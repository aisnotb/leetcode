今天开篇吧 以前也刷过，都是easy 和 medium 的题。不太会总结，现在想把自己的态度放端正
对于每一个题目，力求吃透，以后回顾的时候只要看看现在的思路就好。

我也会把每天写过的题目放到github上与大家分享

首先想到的是遍历所有的元素 n的平方 不能再少

然后是用两个指针，一个固定，一个游走的方式遍历

我又想到如果只有一个元素的情况，一个指针在前，一个指针在后的情况肯定不适用

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// Given nums = [2, 7, 11, 15], target = 9,
//
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].


下面是代码 暴力解法
class Solution{
    public int[] twoSum(int[] nums, int target){
        int[] index = new int[2];
        for (int m = 0 ; m <= nums.length - 1 ; m++) {
            for (int k = m + 1; k < nums.length ; k++) {
                if (nums[m] + nums[k] == target) {
                    index[0] = m;
                    index[1] = k;
                }
            }
        }
        return index;
    }
}

用哈希表来做
如何处理数组中有重复的元素
class solution{
    public int[] twoSum(int[] nums, int target){
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i= 0 ; i < nums.length ; i++ ) {
            int complement = target - nums[i];
            if (map.contains(complement)) {
                index[0] = map.get(complement);
                index[1] = i;
            }
            map.put(nums[i], i);
        }
        return index;
    }
}

总结
hashmap 可以有效的降低 事件复杂度
