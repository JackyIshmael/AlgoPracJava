package DailyPrac;


import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @author: Jacky
 * @create: 2020-08-08 10:21
 **/
public class BinaryTreeLevelOrderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int i){
            val=i;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result=new LinkedList<>();
        Queue<TreeNode> levelScan=new LinkedList<>();
        if(root==null) return result;
        //List<Integer> temp=new ArrayList<>();
        //result.add(temp);
        levelScan.add(root);
        int len=0;
        while(!levelScan.isEmpty()){
            List<Integer> eachLevel=new ArrayList<>();
            len=levelScan.size(); //和BTS唯一的区别就是控制每次的输出。
            for(int i=0;i<len;i++){
                TreeNode temp=levelScan.poll();
                eachLevel.add(temp.val);
                if(temp.left!=null)
                    levelScan.add(temp.left);
                if(temp.right!=null)
                    levelScan.add(temp.right);
            }
            result.addFirst(eachLevel);
        }
        return result;
    }

        // 难点在于按层级遍历
        //第二次遍历中，弹出头结点之后，将其左右节点，加入到队列中
        //根据队列当前size，处理队列中需要弹出的点，并且把所有弹出的点的左右节点加入到队列中。

        //每次队列根据进入循环前的队列长度，来标记需要弹出的节点数。

        //因此每一轮迭代中，队列只包含树里面某一层的所有节点。

        //结果保存。 每次结果用一个List保存，并将list add到 总的list中区

}
