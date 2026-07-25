class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapp= new HashMap<>();
        for(int i=0;i<s.length();i++){
            mapp.put(s.charAt(i), mapp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            mapp.put(t.charAt(i), mapp.getOrDefault(t.charAt(i),0)-1);
        }

        for(HashMap.Entry<Character,Integer> entry: mapp.entrySet()){
            if(entry.getValue()<0 || entry.getValue()>0){
                return false;
            }
        }
        return true;
    }
}
