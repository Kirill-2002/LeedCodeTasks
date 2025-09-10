class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length()>t.length()){
            return false;
        }

        int current=0;
        String sub="";
        for(int i =0; i<s.length();i++){
            for(int j=current;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    current=j+1;
                    sub+=t.charAt(j);
                    break;
                }
            }
        }
        if(sub.length()==s.length()){
            return true;
        }
        else return false;
    }
}