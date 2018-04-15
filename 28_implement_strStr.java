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


class Solution{
	public int strStr(String haystack, String needle){
		int n1 = haystack.length;
		int n2 = needle.length;
		if(n2 > n1 ) return -1;
		int i = 0 ;
		int j = 0 ;
		int begin = -1;
		while(i< n1 && j< n2){
				while(needle.indexOf(j)!=haystack.indexOf(i)){
					i++;
					begin = i;
				}
				j++;
				while(needle.indexOf(j) == haystack.indexOf(i)){
					i++;
					j++;
				}
			}
		}
		return -1;
	}
}
