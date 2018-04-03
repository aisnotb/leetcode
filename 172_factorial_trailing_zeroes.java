Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.



这个题目我是这么想的， 如果要有0， 那么只可能是两个数相乘等于10 ， 就有 1 * 10 = 10 ； 2 * 5 = 10 

4 * 5 = 20 ； 活着 8 * 10 = 80 ；但是其实 4 * 5 = 20 相当于 2 * 10 。所以只要能够相乘等于10 就够了，而不需要是10 的多少个倍数。


现在的问题就变成了。 给定的数 n 有多少个 5 这个因子。

比如 10 ！ =  1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 

我们只需要看看10 里面有几个5， 因为2 肯定是充足的。比如 2 ，4 ，6 .....

比如数字 10 ，我就可以得到两个 0， 5， 2 * 5 

15， 我可以得到 5， 2 * 5， 3 * 5， 也就是 3 个 0 

20， 我可以得到 5， 2* 5， 3 * 5， 4 * 5 ，也就是 4 个 0 

比如说是 24 那么就可以分解成为 4 个 5 ，然后是 21， 22， 23， 24 ，
我们就要对 21， 22， 23，24 每一个数进行 同样的运算来确定有多少个 5 .


所以问题也就变成了  一个数 可以分解出多少个 5 这个因子， 就有多少个 0 

class Solution{
	public int trailingZeros(int n){
		return n == 0 ? 0 : n / 5 + trailingZeros( n / 5);
	}
}