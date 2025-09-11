class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> earlyhs= new HashSet<>();

        for(int element: nums2){
            hs.add(element);
        }
        for(int element: nums1){
            if(!hs.contains(element)&&!earlyhs.contains(element)){
                l.add(element);
                earlyhs.add(element);
            }
        }

        result.add(l);

        l = new ArrayList<>();

        hs= new HashSet<>();

        earlyhs= new HashSet<>();

        for(int element: nums1){
            hs.add(element);
        }
        for(int element: nums2){
            if(!hs.contains(element)&&!earlyhs.contains(element)){
                l.add(element);
                earlyhs.add(element);
            }
        }

        result.add(l);

        return result;




        

    }
}