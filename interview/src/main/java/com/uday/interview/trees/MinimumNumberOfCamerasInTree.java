package com.uday.interview.trees;

//https://leetcode.com/problems/binary-tree-cameras/
public class MinimumNumberOfCamerasInTree {
    int ans=0;
    public int minCameraCover(TreeNode root) {
        if(root==null)
            return ans;
        if(root.left ==null && root.right==null)
            return 1;
        boolean status = minCameraCoverTraverse(root,0);
        return ans;
    }
    public boolean minCameraCoverTraverse(TreeNode root,int level) {
        
        if(root==null){
            return true;
        }
        System.out.println(level+"---------->"+root.value);
        System.out.println(((root.left!=null)?root.left.value:null));
        System.out.println(((root.right!=null)?root.right.value:null));
        
        boolean lTree = minCameraCoverTraverse(root.left,level+1);
        boolean RTree = minCameraCoverTraverse(root.right,level+1);
        System.out.println(level+" -- "+lTree+" -- "+RTree);
        if( lTree && RTree)
        { 
            System.out.println("False");
            return false;
        }
         
        ans++;
        System.out.println("True");
        return true;
    }
    
}
