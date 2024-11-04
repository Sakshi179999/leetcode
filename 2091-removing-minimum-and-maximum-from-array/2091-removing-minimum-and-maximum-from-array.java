class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minmax[]=minmax(nums);
        int minIdx=minmax[0];
        int maxIdx=minmax[1];
        
        int deleteFromFront = Math.max(minIdx, maxIdx) + 1;
        int deleteFromBack = n - Math.min(minIdx, maxIdx);
        int deleteMixed = (Math.min(minIdx, maxIdx) + 1) + (n - Math.max(minIdx, maxIdx));
       
        
        return Math.min(deleteFromFront, Math.min(deleteFromBack, deleteMixed));
        
    }
    public int[] minmax(int [] nums){
        int minidx=0;
        int maxidx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minidx]){
                minidx=i;
                
            }
                if(nums[i]>nums[maxidx]){
                    maxidx=i;
                }
            
        }
        return new int[]{minidx,maxidx};
        
    }
}