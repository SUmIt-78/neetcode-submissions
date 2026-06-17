class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] res=new int[nums1.length+nums2.length];
       int i=0;
       int j=0;

       while(i<nums1.length && j<nums2.length){
        if(nums1[i]<nums2[j]){
            res[i+j]=nums1[i];
            i++;
        }else{
            res[i+j]=nums2[j];
            j++;
        }
       }

       while(i<nums1.length){
         res[i+j]=nums1[i];
            i++;
       }

       while(j<nums2.length){
          res[i+j]=nums2[j];
            j++;
       }
       if(res.length % 2!=0){
        return res[res.length/2];
       }
       int mid=res.length/2;
       return (res[mid-1]+res[mid])/2.0;
        
    }
}
