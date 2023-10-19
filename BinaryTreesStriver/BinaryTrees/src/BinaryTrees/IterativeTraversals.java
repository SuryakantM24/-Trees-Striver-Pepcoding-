package BinaryTrees;

import java.util.Stack;

public class IterativeTraversals {



    public  static void iterativePostOrder(Node root){

        Stack<Node> st=new Stack<>();
        if(root==null){
            return;
        }
        st.push(root);
        while (!st.isEmpty()){
            root=st.pop();
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
            System.out.print(root.data+" ");
        }


    }

    public  static void main(String[] args){
        Node root=BinaryTreeInput.takeinput(true,false,0);
        iterativePostOrder(root);
        System.out.println();
        BinaryTreeTraversals.preOrder(root);
    }
}
