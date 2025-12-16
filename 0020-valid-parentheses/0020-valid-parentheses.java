class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        Map<Character, Character> dict = new HashMap<>();
        dict.put('(', ')');
        dict.put('{', '}');
        dict.put('[',']');

        for(int i=0; i<s.length(); i++){
            if(dict.containsKey(s.charAt(i))){
                brackets.push(s.charAt(i));
                continue;
            }

            if(!brackets.empty()){
                if(dict.containsValue(s.charAt(i))){
                    if(dict.get(brackets.peek())==s.charAt(i))
                    {
                        brackets.pop();
                    }else return false;
                }

            }else return false;
        }

        return brackets.empty();
    }
}