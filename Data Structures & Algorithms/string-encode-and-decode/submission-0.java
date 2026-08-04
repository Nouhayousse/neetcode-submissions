class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append(":").append(str);

        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded_strs=new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int j=str.indexOf(":",i);
            int n=Integer.parseInt(str.substring(i,j));
            
            String mot=str.substring(j+1,j+n+1);
            decoded_strs.add(mot);

            i=j+1+n;
               
            

        }
        return decoded_strs;

    }
}
