class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length()!=s2.length()) return false;

        if(s1.equals(s2))
        return true;
        else{
             int i = -1, j = -1;

        for (int k = 0; k < s1.length(); k++) {
            if (s1.charAt(k) != s2.charAt(k)) {
                if (i == -1) {
                    i = k;  
                } else if (j == -1) {
                    j = k;  
                } else {
                    return false; 
                }
            }
        }

        if (i != -1 && j != -1) {
            return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
        }
        
        return false;
       }

    }
}