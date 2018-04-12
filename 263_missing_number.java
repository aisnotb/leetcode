Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2
Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?


我的思路
方法 一
用公式直接算出来 所有数的和，然后一个个减去当前的数。

class Solution {
    public int missingNumber(int[] nums) {
		int n = nums.length;
        int sum = n * (n + 1) / 2;
        for(int i = 0 ; i < nums.length; i++){
            sum-=nums[i];
        }
        return sum;
    }
}

方法 二
用 异或 的方法。

class Solution {
    public int missingNumber(int[] nums) {
    	int ans = 0;
    	int k = 0;
    	for(int i = 0 ; i < nums.length; i++){
    		ans ^ = nums[i];
    		k ^= i;
    	}	
    	return ans ^ k;
    }
}
卧槽！，隔了几天来验证学习成果的时候 居然发现我的 算法有严重的问题。第二个方法根本就是有问题的。
