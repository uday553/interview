package com.uday.interview.trees;
//https://leetcode.com/problems/distribute-coins-in-binary-tree/
public class DistributeCoinsInBinaryTree {
	int ans=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);   
        return ans;
    }
    public int dfs(TreeNode root) {
        if(root ==null)
            return 0;
        int left = dfs( root.left);
        int right = dfs( root.right);
        int val = root.value+left+right-1;
        ans=ans+Math.abs(left)+Math.abs(right);
        return val;
    }
}
