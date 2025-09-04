class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result="";
        if(word1.length()>=word2.length()){
            for(int i =0; i<word1.length();i++){
                if(i>word2.length()-1){
                    result += word1.substring(i);
                    break;
                }
                else{result = result + word1.charAt(i) + word2.charAt(i);}
            }
        }
        else{
            for(int i =0; i<word2.length();i++){
                if(i>word1.length()-1){
                    result += word2.substring(i);
                    break;
                }
                else{result = result + word1.charAt(i) + word2.charAt(i);}
            }
        }
        return result;
    }
}