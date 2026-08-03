class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();

        if(s.length()==t.length()){
            Map<Character,Integer> map1=new HashMap<>();
            Map<Character,Integer> map2=new HashMap<>();

            for(int i=0;i<s.length();i++){
                
                map1.put(s1[i],map1.getOrDefault(s1[i],0)+1);
                map2.put(s2[i],map2.getOrDefault(s2[i],0)+1);

            }

            for(Character c : map1.keySet()){
                if(!map1.get(c).equals(map2.getOrDefault(c,0))){
                    return false;
                }
                 
            }
            return true;
            

        }else{
            return false;
        }

    }
}
