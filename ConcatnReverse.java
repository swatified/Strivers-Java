class Solution {
    static String conRevstr(String S1, String S2) {
      // simply this or s1.concat(s2);
        String s = S1+S2;
      // Dont forget to fucking Initialize!!
        String r= "";

      // notice the -1 here
        for(int i=s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        return r;
    }
}
