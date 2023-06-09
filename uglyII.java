class Solution {
    public int nthUglyNumber(int n) {
        int[] arr= new int[n];

        int in_2=0,in_3=0,in_5=0;
        int f_2=2,f_3=3,f_5=5;
        arr[0] =1;
        for(int i=1;i<n;i++){
            arr[i] = Math.min(Math.min(f_2,f_3),f_5);

            if(f_2 == arr[i]) f_2 = 2*arr[++in_2];
            if(f_3 == arr[i]) f_3 = 3*arr[++in_3];
            if(f_5 == arr[i]) f_5 = 5*arr[++in_5];
        }

        return arr[n-1];
    }
}

