class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(map.containsKey(str))
            map.get(str).add(strs[i]);
            else{
            map.put(str.toString(),new ArrayList<>(Arrays.asList(strs[i])));
            }

            
        }
        List<List<String>> list=new ArrayList<>();

        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
        
    }
}
