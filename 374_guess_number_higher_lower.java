We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.


这个题我的思路是 二分法。。

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) < 0){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        
        return -1;
    }
    
}
这个题目我现在写第二遍

态度一定要好。
后来我仔细看了别人的评论，这个题目本身就很confusing
并不是我的理解问题。所以，let it go :)


思路3.
直接来暴力解法, 不过这个解法毫无意义。如果被问到的话一句话带过吧

public class Solution extends GuessGame{
	public int guessNumber( int n ) {
		//直接暴力循环
		for(int i = 1 ; i <=n; i++) {
			if( guess(i) == 0 ) {
				return i;
			}
		}
		return -1;
	}
}

总结
我在判断数字不等于 0 的时候，经常会弄反顺序。。
我需要反思下 ，然后继续后面的题目
