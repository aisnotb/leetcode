Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area

Assume that the total area is never beyond the maximum possible value of int.

Credits:
Special thanks to @mithmatt for adding this problem, creating the above image and all test cases.

我的思路

这个题目就是个计算题。
解决这个问题的关键在于找到计算出 中间相应值的方程式。


我们要算的是整个图形的面积。
那么我就用两个长方形的面积减去中间重叠的面积。

class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int areaA = Math.abs(D-B) * Math.abs(C-A);
		int areaB = Math.abs(H-F) * Math.abs(G-E);

		int overlap = 0;
		int left = max(A,E);
		int right = max(min(C,G),left);
		int bottom = max(B,F);
		int top = max(min(D,H), B);// 或者当两个长方形没有重合的时候就是

		return areaA + areaB - overlap;

    }
}
