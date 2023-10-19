package BinaryTrees;

import java.util.Stack;

public class IterativeTraversals {

    public static void iterativeInOrder(Node root){

        Stack<Node> st=new Stack<>();

        if(root==null){
            return;
        }

        while(true){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                root=st.pop();
                System.out.print(root.data+" ");
                root=root.right;
            }


        }


    }

    public  static void iterativePreOrder(Node root){

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
        iterativePreOrder(root);
        System.out.println();
        BinaryTreeTraversals.preOrder(root);
        System.out.println();
        BinaryTreeTraversals.inOrder(root);
        System.out.println();
        iterativeInOrder(root);

    }
}
