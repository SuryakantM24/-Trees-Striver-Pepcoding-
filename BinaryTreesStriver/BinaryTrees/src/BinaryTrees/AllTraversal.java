package BinaryTrees;

import java.util.*;

class Pair{

    Node root;
    int state;

    Pair(Node root,int state){
        this.root=root;
        this.state=state;
    }
}
public class AllTraversal {



        public static List<List<Integer>> getTreeTraversal(Node root) {

            //Make three ArrayList for preOrder,postOrder,InOrder
            List<Integer> pre=new ArrayList<>();
            List<Integer> post=new ArrayList<>();
            List<Integer> inO=new ArrayList<>();
            List<List<Integer>> res=new ArrayList<>();

            Stack<Pair> st=new Stack<>();
            Pair p= new Pair(root, 1);

            st.push(p);


            while(!st.isEmpty()){

                Pair tp=st.peek();
                if(tp.state==1){
                    pre.add(tp.root.data);
                    tp.state++;
                    if(tp.root.left!=null){
                        Pair np=new Pair(tp.root.left,1);
                        st.push(np);
                    }
                }
                else if(tp.state==2){
                    inO.add(tp.root.data);
                    tp.state++;
                    if(tp.root.right!=null){
                        Pair np=new Pair(tp.root.right,1);
                        st.push(np);
                    }

                }
                else{
                    post.add(tp.root.data);
                    st.pop();
                }



            }

            res.add(pre);
            res.add(inO);
            res.add(post);

            return res;
        }

        public  static void main(String[] args){

           Node root= BinaryTreeInput.takeinput(true,false,0);
           List<List<Integer>> res=getTreeTraversal(root);

           for(List<Integer> a:res){
               for(Integer b:a){
                   System.out.print(b+" ");
               }
               System.out.println();
           }

        }
}

