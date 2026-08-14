class Solution { 
    public int maximumLengthSubstring(String s) {
        int size = 0;
        int i = 0; 
        int[] freq = new int[26];
        
        for (int j = 0; j < s.length(); j++){
            char rightChar = s.charAt(j);
            freq[rightChar - 'a']++;
            while (freq[rightChar - 'a'] > 2) {
                char leftChar = s.charAt(i);
                freq[leftChar - 'a']--;
                i++;
            }
            int currsize = j-i+1;
            size = Math.max(size, currsize);
        }
        
        return size;
    } 
}
