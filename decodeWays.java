
class Solution {
    public int numDecodings(String s) {

    if(s.length() == 0) return 0;
       int[] res = new int[s.length()+1];
        Arrays.fill(res,0);
       res[0] = 1;
       res[1] = s.charAt(0) != '0'?1:0;

       for(int i=2;i<=s.length();i++){

           //1
           int p1 = Integer.valueOf(s.substring(i-1,i));
           if(p1 >= 1 && p1 <= 9) res[i] +=res[i-1];
           //2
           int p2 = Integer.valueOf(s.substring(i-2,i));
           if(p2 >= 10 && p2 <=26) res[i] +=res[i-2];
       } 

       return res[s.length()];
    }
}
// 012
// 226
// 0 1 2 3
// 1 1 2 3

//


// 11106 