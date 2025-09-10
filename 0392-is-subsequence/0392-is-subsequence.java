class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length()>t.length()){
            return false;
        }

        int current=0;
        int result=0;
        for(int i =0; i<s.length();i++){
            for(int j=current;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    current=j+1;
                    result++;
                    break;
                }
            }
        }
        if(result==s.length()){
            return true;
        }
        else return false;
    }
}