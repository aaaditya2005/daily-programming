class Solution {
    int transform(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return -1;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch:map1.keySet()){
           if (!map1.get(ch).equals(map2.get(ch))) {
               return -1;
           }
        }
        
        int i = s1.length()-1;
        int j = s1.length()-1;
        
        while(i>=0){
            if(s1.charAt(i)==s2.charAt(j)){
                i--;
                j--;
            }else i--;
        }
        
        return j+1;
        
    }
}