// Given an array and a value, remove all instances of that value in-place and return the new length.
//
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
// The order of elements can be changed. It doesn't matter what you leave beyond the new length.


Example:
//
// Given nums = [3,2,2,3], val = 3,
//
// Your function should return length = 2, with the first two elements of nums being 2.


我理解题目的意思就是保持原数组的顺序不变，然后调整元素的位置。而且必须循环整个数组 所以复杂度就是O(n

题目很清除的说明了，数组后面的内容无关紧要。

所以如何利用这一点？？？

[1,1,2,2] val = 2;

[1,2,3,4,5] val = 3; => [1,2,4,5,3]

根据上面的这个例子，很自然的我就想到了把 3，4 调换，然后把 3 和 5 调换。但是题目的要求不需要调换所有的元素。

用 i 来 作为 慢指针(代表新返回数组的长度)， 用 j 做成快指针， 如果nums[j] == val , 那么 j++， 直到数组末尾。

如果 nums[j] != val , 就把nums[j] 赋值给 nums[i]; 然后 i++;

class Solution{
    public int removeElement(int[] nums, int val){
        int i = 0;
        for (int j = 0 ; j < nums.length; j++ ) {
            if (nums[j] != val) {
                nums[i] = nums[j]; //
                i++;
            }
        }
        return i;
    }
}

数组的题目 可以用2个指针的方法来做。要充分利用题目的信息。
