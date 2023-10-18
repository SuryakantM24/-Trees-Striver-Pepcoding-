package BinaryTrees;

import java.util.Scanner;

public class BinaryTreeInput{



    public static Node takeinput(boolean isRoot,boolean isleft,int parentdata){

        if(isRoot){
            System.out.println("Enter the rootnode");
        }
        else {

            if(isleft){
                System.out.println("Enter left child of "+parentdata);
            }
            else{
                System.out.println("Enter right child of "+parentdata);
            }

        }
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);
        Node left=takeinput(false,true,root.data);
        Node right=takeinput(false,false,root.data);
        root.left=left;
        root.right=right;

        return root;



    }

    public static void printBetter(Node root){

        if(root==null){
            return;
        }

        System.out.print(root.data+":");

        if(root.left!=null){
            System.out.print("L"+root.left.data+" ");
        }
        if(root.right!=null){
            System.out.print(" R"+root.right.data+" ");
        }
        System.out.println();
        printBetter(root.left);
        printBetter(root.right);

    }

    public static void main(String[] agrs){

       Node root=takeinput(true,false,0);

       printBetter(root);

    }

}
