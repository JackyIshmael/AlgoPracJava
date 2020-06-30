package algohelper;

import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 二叉树练习
 * @author: Jacky
 * @create: 2020-06-19 00:46
 **/
public class TwoXTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){ this.val=val; }
        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

    }

    public static void preorderTraversalOld_DIGUI(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        preorderTraversalOld_DIGUI(root.left);
        preorderTraversalOld_DIGUI(root.right);
    }
    //前序遍历
    public static void preorderTraversal(TreeNode root){

        //root 作为指向数组根节点的启示指针，需要不断对其作移动操作，然后为了防止记录丢失，我们需要
        TreeNode pointer=root;
        if(pointer==null) return;

        Stack<TreeNode> stack=new Stack<>();
        List result=new ArrayList();

        //用非递归的方式，循环来处理数据
        while(pointer!=null || !stack.empty()){
            while(pointer!=null){
                //前序遍历，因此优先保存结果。能正常读取到的节点都直接压入到栈中并向左遍历44
                result.add(pointer.val);
                stack.push(pointer);
                pointer=pointer.left;
            }
            //到这里说明 pointer 走到了左子树的最左端，需要取当前栈顶的非NULL节点继续研究
            //查看其右子树，如果不存在则继续向上回溯，如果存在则继续对其前序遍历
            TreeNode parent=stack.pop();
            pointer=parent.right;
        }
        System.out.println(String.join("->",result));

    }

    //中序遍历
    public static void inorderTraversal(TreeNode root)
    {
        //root
        TreeNode pointer=root;
        if(pointer==null) return;

        Stack<TreeNode> stack=new Stack<>();
        List result=new ArrayList();

        while(pointer!=null || !stack.empty()){
            while(pointer!=null){
                stack.push(pointer);
                pointer=pointer.left;
            }
            //此时，因为中序先左再中再右。栈顶是最左下角的元素，因此将其弹出并将val输入到结果之中
            //如果栈顶还有右子树，那么根据中序 顺理成章地将向右子树的左子节点循环到底而不会输出其间有可能作为根节点存在的节点，仅对其压栈。
            //如果没有右子树，那么继续pop，获取栈顶元素也就是相对于之前节点的根节点。
            //中序对应的保存结果的位置也在循环中部

            TreeNode parent=stack.pop();
            result.add(parent.val);
            pointer=parent.right;

        }
        System.out.println(String.join("->",result));
    }

    //后序遍历，先左再右再根。
    public static void postorderTraversal(TreeNode root){
        //需要用一个lastvist来标记上一次访问的栈顶节点，如果某个节点的右节点是已被访问，那么其作为根节点才能允许被弹出

        //核心：根节点必须在右节点弹出之后再弹出，所以用一个标记来标记上一次访问，来验证当前节点是否有右子树。
        if (root==null) return;
        TreeNode pointer=root;
        TreeNode lastvist=null;
        Stack<TreeNode> stack=new Stack<>();
        List result=new ArrayList();

        while(pointer!=null&!stack.isEmpty()){
            while(pointer!=null){
                //入栈
                stack.push(pointer);
                pointer=pointer.left;
            }

            TreeNode parent=stack.peek();

            if(parent.right==null || parent.right==lastvist){
                //说明当前的相对右节点已经访问过了，可以输出相对根节点了
                result.add(parent.val);
                lastvist=parent;
                stack.pop();
            }
            else {
                pointer=parent.right;
            }
        }
        System.out.println(String.join("->",result));

    }


    //DFS深度遍历---从上到下
    //二叉树的遍历方式很容易理解，左右子树不可能发生交叉，因此DFS中只要对当前节点的左右进行递归，就会搜索到所有节点。
    //实现后的DFS可以用于前序遍历==》经过的节点首先本身是根节点，然后DFS中先对左子树遍历，达到根-》左-》右的顺序
    public static void DFS(TreeNode root, List result){
        TreeNode parent=root;
        if(parent==null) return;

        //将遍历到的节点的val输入到list中
        result.add(parent.val);

        DFS(parent.left,result);
        DFS(parent.right,result);
    }

    public static List preorderTraversalDFS(TreeNode root){
        List result=new ArrayList();
        DFS(root,result);
        return result;
    }
//-----------------------------------------------------------------------------------------------------------------

    //DFS深度遍历-分治递归

    //BFS遍历，用队列去实现。

    //归并排序，关键在于不断地递归分割数组，然后获取最小地那一部分
/*    public static int[] MergeSort(int[] nums){
        return mergesort(nums);
    }*/

/*    public static int[] mergesort(int[] nums){

        //分治+递归
        if(nums.length<=1) return nums;

        //



    }*/



}
