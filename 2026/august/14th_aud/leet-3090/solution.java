class Solution { 
    public int maximumLengthSubstring(String s) { 
        int size = 0; 
        for(int i = 0; i < s.length(); i++){ 
            HashMap<Character, Integer> map = new HashMap<>(); 
            int currsize = 0; 
            for(int j = i; j < s.length(); j++){ 
                if(map.containsKey(s.charAt(j))) map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                else map.put(s.charAt(j), 1); 
                if(map.get(s.charAt(j)) > 2) break;
                currsize++; 
                size = Math.max(size, currsize); 
            } 
        } 
        return size; 
    } 
}
