package arrays;

public class CheckAnagram {
    public boolean isAnagram(String s, String t) {
        int[] charPresent = new int[26];
        if(s.length() != t.length())
            return false;
        for(int i=0;i < s.length(); i++){
           charPresent[s.charAt(i) - 'a']++; 
        } 

        for(int i = 0; i <t.length(); i++){
           charPresent[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i<26;i++){
            if(charPresent[i] != 0)
                return false;
        }
        return true;
    }
}
