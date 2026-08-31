class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    boolean correct = true;
     Map<Character,Integer>mp1 = new HashMap<>();
     Map<Character,Integer>mp2 = new HashMap<>();

     for(int i = 0 ; i < ransomNote.length() ; i++){
        char ch = ransomNote.charAt(i);
        mp1.put(ch,mp1.getOrDefault(ch,0)+1);
     }

    for(int i = 0 ; i <magazine.length() ; i++){
        char ch = magazine.charAt(i);
        mp2.put(ch,mp2.getOrDefault(ch,0)+1);
    }

        for(char n : mp1.keySet()){
            if(mp2.getOrDefault(n,0) < mp1.get(n)){
                    correct = false;
            }
        }
        return correct;
        
    }
}