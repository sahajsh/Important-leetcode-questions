class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            result.addAll(twoSum(nums, i + 1, nums.length - 1, i));
        }
        
        return result;
    }
    
    public List<List<Integer>> twoSum(int[] nums, Integer start, Integer end, Integer pre) {
        if (start >= end) {
            return new ArrayList<>();
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        Integer left = start;
        Integer right = end;
        
        while (left < right) {
            if (nums[left] + nums[right] + nums[pre] == 0) {
                List<Integer> answer = new ArrayList<>();
                answer.add(nums[pre]);
                answer.add(nums[left]);
                answer.add(nums[right]);
                result.add(answer);
                left++;
                right--;
                while (left < right && nums[left] == nums[left-1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (nums[left] + nums[right] + nums[pre] > 0) {
                right--;
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else {
                left++;
                while (left < right && nums[left] == nums[left-1]) {
                    left++;
                }
            }
        }
        
        return result;
    }
}