package com.company;

import com.sun.source.tree.Tree;

import java.util.*;
public class CousinsInBinaryTree {
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

      public boolean isCousins(TreeNode root, int x, int y) {
          Queue<TreeNode> queue=new LinkedList<>();
          queue.add(root);
      }

    public static void main(String []args){
    }
}
