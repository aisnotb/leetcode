Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.


我的解题思路是首先观察 

如果给定一个数组 [1,2,3,4] k = 1 数组变成[4,1,2,3]
						k = 2 数组变成[3,4,1,2]
						k = 3 数组变成[2,3,4,1]
						k = 4 数组变成[1,2,3,4]
现在还不知道解法，不过先考虑下时间复杂度的问题。很明显，这个复杂度和 k 有关系，k 的值在 (n - 1)的时候达到最大， 而在 k 的时候 最小为0.

则需要的操作越多

所以说没有必要为所有的 k 设计出一个算法。只要在 数组的长度内给他设定出一个算法 就ok

一句话 就是和 n 的 大小有关系。

比如上面的这个例子。如果 k = 1， 那么 要把 所有的数据 都移动位置。

现在理清楚了题目的意思，开始写代码

解法 1 暴力解法 每次把整个数组 右边移动 1 个位置, 移动 k 次

class Solution {
	public void rotate(int[] nums, int k){
		int n = nums.length;
		for (int i = 0 ; i < k; i++) {
			var temp = nums[n-1]; //    我们需要保存数组的最后一个元素 
			for (int j = n - 1; j > 0 ; j--) {
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
	}
}
很高兴自己写的这个例子一次通过了。但是也发现了很多不足
时间 复杂度 n 平方
空间 复杂度 o（1）


解法 2 使用额外的数组来解决这个问题

一般来解决空间复杂度 太高的方法都是用 空间换时间。是不是现在的电脑 内存要求越来越高的原因啊  ：(
根据我们的观察，我们可以直接把 这个数组的后面 k 个元素 放到 新数组的前面，然后把 前面的元素放到数组的后面

class Solution {
    public void rotate(int[] nums, int k) {
    	int n = nums.length;
    	k = k % n;
		int[] arr = new Int[n];
		for (int i = 0; i < n;  i++) {
			arr[i + k] = nums[i];
		}
		for (int i = 0;  i < n;  i++) {
			nums[i] = arr[i];
		}
		
    }
}

这个是错误的做法。应为这个函数返回值是 void。 所以我们只能在该数组上面下手。


以后再做
解法 3 这个题的确可以 一次 解决，应为对于一个给定 长度 和 k 的数组， 我们可以通过计算 来直接得到新的数组。
class Solution{
	public void rotate(int[] nums, int k){

	}
}

