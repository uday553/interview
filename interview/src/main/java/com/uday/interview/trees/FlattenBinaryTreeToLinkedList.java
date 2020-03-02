package com.uday.interview.trees;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

public class FlattenBinaryTreeToLinkedList {

	public TreeNode getLastNode(TreeNode root)
    {
        if(root==null)
            return root;
        while(root.right!=null)
        {
            root=root.right;
        }
        return root;
    }
   
    public void flatten(TreeNode root) {
        getFlatten(root);
    }
    public TreeNode getFlatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return root;
        TreeNode left = root.left;
        TreeNode right= root.right;
        left= getFlatten(left);
        right= getFlatten(right);
        if(left!=null && right!=null)
        {
            root.right=left;
            root.left=null;
            TreeNode t = getLastNode(left);
            t.right=right;
        }
        else if(right==null){
            root.right=root.left;
            root.left=null;
        }
        return root;
    }
}
