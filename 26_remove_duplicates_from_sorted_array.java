Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.


 // 我的思路是
 // 我还是要用双指针的办法，数组由于是排列好的
两个指针，一个快指针，一个慢指针。
i 是慢指针， j 是快指针。

如果nums[i] = nums[j]，那么我就把j 增加一个，来跳过重复的元素

如果nums[i] != nums[j] 那么就把 nums[j] 赋值给 nums[i+1];


然后自己给出一些例子
比如 [1,2,3,4]

在这个里面我们的 j 是个慢指针
class Solution{
    public int removeDuplicates(int[] nums){
        int i = 0 ;
        for( int j = 0 ; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
