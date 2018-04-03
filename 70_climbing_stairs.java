You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


我的解题思路 你去爬楼梯，第一步 只有 2 种方法  一种 第一步跨 1 个台阶 ， 第二种，一步跨 2 个 台阶。 
然后 你爬到最高 点的方法数 就是 你爬剩下的 n-1 个 台阶的方法  加上 你爬 剩下的 n-2 个台阶的方法之和 .

class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
      
        return climbStairs(n-1) + climbStairs(n-2);
    }
}

但是这种写法会 超时。解决的办法就是 用fabbnacci 数列的 方法。

但是我们可以利用上面的这个公式  很好的解决这个问题

class Solution{
	public int climbStairs(int n){
		int[] dp = new int[n+1];
		if (n == 1) {
			return 1;
		}

		dp[1] = 1; dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
}
但是这种解法的 用了 o（n） 的空间复杂度。 


其实还可以更优化， 就是利用 两个变量 相互叠加。 简单点说就是 两个指针相互叠加。 

class Solution{
	public int climbStairs(int n){

	}
}
