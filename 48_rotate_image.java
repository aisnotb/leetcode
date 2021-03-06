You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]

我的思路这个题目

1. 我的想法是先从外到内， 一层一层的替换。

首先判断从外到内需要有几次循环，比如n == 4 的时候，我们需要两次 由外而内的 循环。
当n ==5 的时候，我们需要 2 次的判断，因为中间的一个元素 我们不需要再去动他

2. 然后就是内层的操作。

我们假设上面一层我们叫1， 右边叫2， 下面叫3，左边叫4.

那么当我们把1 放到2 的位置的时候，我们覆盖掉了2 的所有元素。

所以我们需要一个数组来保存最外一圈的元素。 当循环进入到内层的时候，我们同样需要一个数组来保存内层元素内容

当然我们也可以尝试只用一个integer 来保存，用来节省空间

我发现了，这个题目的难点实际上实在对于数组的转换上面。每次都搞得我头晕。没办法，只好慢慢计算。

思路1
就是不需要这么多的for 循环，每次换4个数。直接成功。

我自己的问题就是，不擅长用 下标 i，j ，去表示指定位置的坐标

class Solution{
	public void rotate(int[][] nums){
		int n  = matrix.length;
		//这里很简单的是 i 用来代表 需要进行由外而内循环的次数
		for(int i = 0 ; i < n / 2; i++){
			for(int j = i ; j < n-1-i ; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
	}
}
其实现在这么看这个题目 也不是很难。 哈哈哈。。感觉很爽。 有进步
