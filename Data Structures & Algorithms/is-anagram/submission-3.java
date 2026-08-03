class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();

        if(s.length()==t.length()){
            Map<Character,Integer> map=new HashMap<>();
            // Map<Character,Integer> map2=new HashMap<>();

            for(int i=0;i<s.length();i++){
                
                map.put(s1[i],map.getOrDefault(s1[i],0)+1);
                map.put(s2[i],map.getOrDefault(s2[i],0)-1);

            }

            for(Integer i : map.values()){
                if(i!=0){
                    return false;
                }
                 
            }
            return true;
            

        }else{
            return false;
        }

    }
}
