class Solution {
    public int pivotIndex(int[] nums) {
        
    
        ArrayList<Integer> leftsum = new ArrayList<>(List.of(0));

        for(int i=0; i<nums.length;i++)
        {
            leftsum.add(leftsum.get(i)+nums[i]);
        }

        for(int i=1; i<leftsum.size();i++)
        {
            if(leftsum.get(i-1)==leftsum.get(leftsum.size()-1)-leftsum.get(i)){return i-1;}
        }

        return -1;

    }
}