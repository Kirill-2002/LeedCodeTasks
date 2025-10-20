class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack <>();
        

        for (int i =0; i< s.length();i++){
            if(s.charAt(i)!='*')stack.push(s.charAt(i));
            else if (stack.empty()) continue;
            else stack.pop();
        }

        StringBuilder sb = new StringBuilder();

        for(Character ch: stack){
            sb.append(ch);
        }

        return sb.toString();





        

        




    }
}