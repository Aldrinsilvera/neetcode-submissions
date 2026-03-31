class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> table = new HashSet<>();
        for(int x : nums){
            if(!table.add(x)){
                return true;
            }
        }
        return false;
    }
}