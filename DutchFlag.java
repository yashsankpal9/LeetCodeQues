
class Solution {
    public void sortColors(int[] nums) {

        int left=0,mid=0,right=nums.length-1;

        while(mid<=right){
            switch(nums[mid]){
                case 0:
                    int y = nums[left];
                    nums[left] = nums[mid];
                    nums[mid] = y;
                    left++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                default:
                    int x = nums[mid];
                    nums[mid] = nums[right];
                    nums[right] = x;
                    right--;
            }
        }   
    }
}