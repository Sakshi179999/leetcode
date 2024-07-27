class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
        
    }
    public void reverse(int [] nums,int start,int last){
        while(start<last){
        int t=nums[start];
        nums[start]=nums[last];
        nums[last]=t;
        start++;
        last--;
        }
    }
}