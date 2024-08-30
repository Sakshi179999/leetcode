class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] words =s.split("\\s+");
        Stack <String> st = new Stack<>();
        for(String e: words){
            st.push(e);
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
            
            if (!st.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
        
    }
}