import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {

        if(n<2) return 0;
        boolean[] flg =new boolean[n+1];
        Arrays.fill(flg,true);

        flg[0] = false;
        flg[1] = false;

        for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                flg[j] = false;
            }
        }

        int count=0;
        for(int i=0;i<flg.length;i++){
            if(flg[i]) count++;
        }

        return count;
    }
}