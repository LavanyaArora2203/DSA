public class slidingWindow {

    public static int longestIncreasingSubarray(int[] nums){
        int maxLen=1;int currLen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currLen++;
            }else{
                currLen=1;
            }
            maxLen=Math.max(currLen,maxLen);
        }

        return maxLen;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    
}
