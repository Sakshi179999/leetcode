
class Solution {
    public int pivotIndex(int[] arr) {
       int arr1[]=new int[arr.length];
       int sum=0;
       for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        arr1[i]=sum;
       }
       if(arr1[arr.length-1]-arr1[0]==0)
       return 0;
       for(int i=1;i<arr.length;i++){
        if(arr1[i-1]==(arr1[arr.length-1]-arr1[i]))
        return i;
       }
       return -1;
    }
}