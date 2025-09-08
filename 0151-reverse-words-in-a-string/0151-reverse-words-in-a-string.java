class Solution {
    public String reverseWords(String s) {
        
        String word="";
        String result="";

        for(int i = 0; i < s.length();i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }
            else if (word==""){
                continue;
            }
            else{
                result = " " + word  + result;
                word="";
            }

            if(i==s.length()-1){
                result= word + result;
            }
        }
        result = result.trim();
        return result;
    }
}