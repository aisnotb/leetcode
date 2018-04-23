Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]



我的思路

第一种思路 最简单的就是暴力解法。

用指针去扫描一遍就好了,在这里用begin 和 end 两个值来记录区间范围

我一开始的思路是错误的，我的想法是从左边朝着右边扫描，如果碰到了相等的元素那么我就把左边的值保存下来，然后如果左边的元素保存下来之后，碰到的第二个元素就是右边的值， 其实这么做是不对的
正确的做法是必须要从左边扫描一次，然后右边扫描一次，必须要两次。

class Solution{
	public int[] search(int[] nums, int target){
		int begin = -1;
		int end = -1;
		for(int i = 0 ; i < nums.length; i++){
			if(nums[i] == target) {
				begin = i;
				break;
			}
		}
		if(begin == -1){
			return new int[]{-1,-1};
		}

		for(int j= nums.length - 1; j >= 0; j--){
			if(nums[j] == target){
				end = j;
				break;
			}
		}
		return new int[]{begin, end}; 
	}
}

这么做的时间复杂度是o(n), 	空间复杂度是o(1)

我的第二种思路肯定是二分法
这个题目的关键是在于 对 nums[mid] == target 的时候的处理。

一个极端的情况就是所有的元素都是target 。 

class Solution{
	public int[] searchRange(int[] nums, int target){
		int left = 0;
		int right = nums.length-1;

		while(left <= right) {
			int mid = left + (right - left)/2;
			if(nums[mid] < target) {
				left = mid + 1;		
			}else if(nums[mid] > target ){
				right = mid -1;
			}else{
						
			}
		}
	}
}

