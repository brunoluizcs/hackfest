public class BalancePointSolution {

    public int execute(int[] args) {
        int left = args[0];
        int right = 0;;
        for(int i=0; i<args.length;i++){
            right += args[i];
        }

        for(int i=0; i<args.length-1;i++)
        {
            if(left==right)
                return i;
            left+=args[i+1];
            right-=args[i];
        }
        return -1;
    }

}
