static int powerSum(int X, int N) {
        int upto = (int) (Math.pow(X, 1.0/N)) +1;
        int[] arr = new int[X+1];
        arr[0] = 1;
        for(int index = 1; index <= upto; ++index){
            int pow = (int)Math.pow(index, N);
            for(int j = X; j >= pow; j--){
                arr[j] += arr[j-pow];
            }
        }
        return arr[X];
    }