package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @program: JavaTest
 * @description: https://leetcode.com/problems/invert-binary-tree/
 * @author: Jacky
 * @create: 2020-07-27 15:46
 **/
public class InvertBinaryTree {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val=x;}
    }


    public static List<Integer> preorderTraversal(TreeNode root){
        LinkedList<TreeNode> stack =new LinkedList<>();
        LinkedList<Integer> output=new LinkedList<>();

        if(root==null) return output;

        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.pollLast();
            output.add(node.val);
            if(node.right!=null) stack.add(node.right);
            if(node.left!=null) stack.add(node.left);
        }
        return output;

    }


    public static TreeNode helper(TreeNode root){
        if (root==null) return null;

        LinkedList<TreeNode> stack=new LinkedList<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            TreeNode left=node.left;
            node.left=node.right;
            node.right=left;
            Map<Integer, Integer> test=new HashMap<>();
            if(node.left!=null)
                stack.push(node.left);
            if(node.right!=null)
                stack.push(node.right);

        }

        return  root;

    }

    public static void main(String[] args)  {
        TreeNode root=new TreeNode(4);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(7);
        root.left=left;
        root.right=right;


    }
}