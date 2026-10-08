class Solution {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if( c == ')') depth--;
            if(depth>0){
                res.append(c);
            }
            if( c == '(') depth++;
            
        }
        return res.toString();
    }
}