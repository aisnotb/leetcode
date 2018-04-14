Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.


我的思路

首先观察。题目的意思就是保持数组的相对顺序不变，同时要把 0 都移动到末尾。

这是个解决数组的问题，我回忆一下解决数组的方法 有两个指针的方法， 哈希表数组结构的方法， 有投票的方法。

我突然想到了一个简单的算法 

1. 用两个指针 i， j 来扫描整个数组 
2. i 是 慢指针 ， j 是快指针。
3. 如果nums[i] == 0, 那么 j 就增加直到碰到一个非 0 的元素。
4. 把 nums[j] 放到 nums[i] 的位置 完成一个替换。

但是这个方法是错误的。。我没有考虑清楚 i 的变化问题。并不是简单的 加 1.


class Solution{
	public void moveZeroes(int[] nums){
		int i = 0 ;
		for (int j = 0 ; j < nums.length ; j++) {
			if (nums[i] == 0 && nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			}
			if (j == nums.length - 1) {
				for (int m = i; m < nums.length; m++ ) {
					nums[m] = 0;	
				}		
			}
		}
	}
}

总结： 这个题目 可以不去交换数组元素的位置，而是直接数据移动覆盖 就好了。这样就可以省下很多的操作。

解法一：
class Solution{
	public void moveZeroes(int[] nums){
		int i = 0 ;
		for (int j = 0 ;  j < nums.length ; j++ ) {
			if (nums[j] != 0) {
				nums[i] = nums[j];
				i++;
			}
			if (j == nums.length - 1) {
				for (int m = i; m < nums.length; m++) {
					nums[m] = 0;
				}
			}
		}
	}
}

第二次尝试写这个算法
class Solution{
	public void moveZeroes(int nums[]){
		int n = nums.length;
		int i = 0;
		int count = 0;
		for(int j = 0 ; j < nums.length; j++){
			if(nums[j] != 0 ){
				nums[i++] = nums[j];
				count++;
			}
		}
		for(int m = count; m < n; m++){
			nums[m] = 0;
		}
	}
}
