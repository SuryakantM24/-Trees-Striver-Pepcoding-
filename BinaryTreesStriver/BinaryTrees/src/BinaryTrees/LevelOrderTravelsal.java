package BinaryTrees;


import java.util.LinkedList;
import java.util.*;

public class LevelOrderTravelsal {



    public static List<List<Integer>> LevelOrderArray(Node root){

        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();

        if(root==null){
            return res;
        }

        q.offer(root);
        while(!q.isEmpty()){
            int levelSize=q.size();
            List<Integer> levelList=new ArrayList<>();
            for(int i=0;i<levelSize;i++){

                if(q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                levelList.add(q.poll().data);
            }
            res.add(levelList);
        }
        return res;
    }
    public static void LevelOrderNormal(Node root){

        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return;
        }
        q.offer(root);
        while(!q.isEmpty()){

            Node temp=q.poll();
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
            System.out.print(temp.data+" ");
        }
    }
    public static void main(String[] args){
        Node root=BinaryTreeInput.takeinput(true,false,0);
        LevelOrderNormal(root);
        List<List<Integer>> res=LevelOrderArray(root);

        for( List<Integer> arr:res){
            for(Integer a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
