package BinaryTrees;

import java.util.Stack;

public class IterativeTraversals {



    public static void iterativePostOrderTwoStacks(Node root){
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        if(root==null) {
            return;
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null){
                st1.push(root.left);
            }
            if(root.right!=null){
                st1.push(root.right);
            }
        }
        while(!st2.isEmpty()){
            Node temp=st2.pop();
            System.out.print(temp.data+" ");
        }

    }
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
        System.out.println();
        BinaryTreeTraversals.postOrder(root);
        System.out.println();
         iterativePostOrderTwoStacks(root);



    }
}
