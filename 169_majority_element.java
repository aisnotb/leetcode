Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.


我的思路

这个题一个简单的想法就是 去直接数 每一个元素出现了多少次， 然后直接得出次数最多的那个元素
于是我们需要一个 hashmap， 把一个元素和他对应的次数 记录下来。


第一种方法 暴力解法
class Solution {
    public int majorityElement(int[] nums) {

    	int majority = nums.length / 2;
		
		for (int i = 0 ; i < nums.length ; i++) {
			int count = 0;
			for (int j = 0 ; j < nums.length; j++ ) {
				if (nums[i] == nums[j]) {
					count += 1;
		  		}      		
		  		if (count > majority) {
					return nums[i];
		  		}
			}      	
		}      

		return -1;
    }
}
这种解法 有个小技巧 就是 只用了一个变量来保存一个元素 出现的次数， 使得空间复杂度降到了 最低。 

class Solution{
	public int majorityElement(int[] nums){
		
	}
}


参考资料
http://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html



