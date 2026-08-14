class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer>mp = new HashMap<>();

        int left= 0 ;
        int maxlen = 0;

        for(int right =0 ; right < s.length() ; right++){
            char curr = s.charAt(right);
            mp.put(curr,mp.getOrDefault(curr,0)+1);

            while(mp.get(curr) > 2 ){
                char cuur =s.charAt(left);
                mp.put(cuur,mp.get(cuur)-1);

                if(mp.get(cuur) == 0){
                    mp.remove(cuur);
                } 
                left++;
            }
             maxlen = Math.max(maxlen , right - left + 1 );
        }
        return maxlen;
    }
}