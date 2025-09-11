class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        HashSet<Integer> hs1= new HashSet<>();
        HashSet<Integer> hs2= new HashSet<>();

        for(int i=0; i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length;i++){
            hs2.add(nums2[i]);
        }
        for(int i=0; i<nums1.length;i++){
            if(!hs2.contains(nums1[i])&&!l1.contains(nums1[i])){
                l1.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length;i++){
            if(!hs1.contains(nums2[i])&&!l2.contains(nums2[i])){
                l2.add(nums2[i]);
            }
        }
        result.add(l1);
        result.add(l2);
        return result;

        

    }
}