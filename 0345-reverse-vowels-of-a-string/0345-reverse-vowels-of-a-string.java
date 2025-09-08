class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        
        char [] chars = s.toCharArray();
        char current;
        int left=0;
        int right=chars.length-1;

        while(left<right){

            if(vowels.contains(chars[left])){
                while(right>left){
                    if(vowels.contains(chars[right])){
                        current=chars[left];
                        chars[left]=chars[right];
                        chars[right]=current;
                        right--;
                        break;
                    }
                    right--;
                }
            }
            left++;
            
        }
        

        return new String(chars);
    }
}