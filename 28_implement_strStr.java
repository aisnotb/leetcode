Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

这个题我原来的想法是用两个指针从头开始扫描
但是算法没有写出来，觉得好尴尬。

后来我又想到了用两个只需要比较   

class Solution{
	public int strStr(String haystack, String needle){
		int n1 = haystack.length();
		int n2 = needle.length();
		if(n2 == 0) return 0;
		if(n2 > n1 ) return -1;
		for(int i = 0 ; i < l1-l2+1; i++){
			int count = 0;
			while(count < n2 && haystack.charAt(i+count) === needle.charAt(count)){
			count++;
			}
			if(count == n2 ){
				return i;
			}

		}
		return -1;
	}
}

总结
首先字符串的长度 要用s.length() 这个函数来获得

其次需要考虑其中一个字符串为空的情况


