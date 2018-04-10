Implement int sqrt(int x).

Compute and return the square root of x.

x is guaranteed to be a non-negative integer.


Example 1:

Input: 4
Output: 2
Example 2:

Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.


我的解题思路

class Solution{
	public int mySqrt(int x){
		if(x == 0) return 0;
	        int left = 1;
	        int right = x;
	        while(left <= right){
	            int mid = left + (right - left)/ 2;
	            if(mid <= x / mid && (mid + 1) > x / (mid + 1)){
	                return mid;
	            }else if(mid < x / mid){
	                left = mid + 1;
	            }else{
	                right = mid - 1;
	            }
	        }
	        return 0;
	    }
	}
}

这个题目有两个地方要注意 。一个是 

int mid = left + (right - left)/ 2;

其次就是 
mid <= x / mid .都必须写成这种写法。否则容易溢出。
