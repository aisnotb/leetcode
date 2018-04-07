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

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; // 假设所有的输入都是合法的，或者等下做检测
        if (k % (n - 1) == 0) {
        	return ;
        }
        for (int i = 0; i < n; i++) {
        	
        }
    }
}
