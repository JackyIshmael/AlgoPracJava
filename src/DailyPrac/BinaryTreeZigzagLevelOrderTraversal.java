package DailyPrac;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 * @author: Jacky
 * @create: 2020-08-09 19:10
 **/
public class BinaryTreeZigzagLevelOrderTraversal {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int i){
            val=i;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //每层结果存储
        LinkedList<List<Integer>> result=new LinkedList<>();
        if(root==null) return result;
        //按层次遍历
        Queue<TreeNode> levelScan=new LinkedList<>();
        //List<Integer> temp=new ArrayList<>();
        //result.add(temp);
        levelScan.add(root);
        int evenOrodd=1;

        while(!levelScan.isEmpty()){
            //每一层的结果。
            //由于每一层的结果要根据层数进行倒叙或者反向插入，因此需要计数
            LinkedList<Integer> eachLevel=new LinkedList<>();

            int len=levelScan.size();
            for(int i=0;i<len;i++){
                TreeNode temp=levelScan.poll();
                if(evenOrodd%2==1)
                    eachLevel.add(temp.val);
                else
                    eachLevel.addFirst(temp.val);
                if(temp.left!=null)
                    levelScan.add(temp.left);
                if(temp.right!=null)
                    levelScan.add(temp.right);
            }
            evenOrodd++;
            result.add(eachLevel);
        }

        return result;
    }
}
