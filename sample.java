import java.util.*;
public class sample {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        static class binaryTree{
            static int idx=-1;
            public static Node builtTree(int[] nodes){
                idx++;
                if(nodes[idx]==-1){
                    return null;

                }
                Node newNode=new Node(nodes[idx]);
                newNode.left=builtTree(nodes);
                newNode.right=builtTree(nodes);
                return newNode;


            }
            public static int height(Node root){
                if(root==null){
                    return 0;
                }
                int lh=height(root.left);
                int rh=height(root.right);
                return Math.max(lh,rh)+1;
            }
            public static int dia(Node root){
                int lh=height(root.left);int rh=height(root.right);
                int ldia=dia(root.left);int rdia=dia(root.right);
                int selfdia=lh+rh+1;
                return Math.max(Math.max(ldia,rdia),selfdia);
            }
            public static List<List<Integer>> bfs(Node root){
                Queue<Node> q=new LinkedList<>();
                List<List<Integer>> result=new ArrayList<>();
                if(root==null){
                    return result;
                }
                q.add(root);q.add(null);
                List<Integer> level=new ArrayList<>();
                while(!q.isEmpty()){
                    Node curr=q.remove();
                    if(curr==null){
                        // System.out.println();
                        result.add(level);
                        level=new ArrayList<>();
                        if(q.isEmpty()){
                            break;
                        }
                        q.add(null);


                    }else{
                        level.add(curr.data);
                        if(curr.left!=null){
                            q.add(curr.left);
                        }if(curr.right!=null){
                            q.add(curr.right);
                        }
                    }
                }
                return result;
                
            }
            public static List<Integer> zigzag(Node root){
                Stack<Node> s1=new Stack<>();
                Stack<Node> s2=new Stack<>();
                s1.push(root);
                List<Integer> result=new ArrayList<>();
                if(root==null){
                    return result;
                }
                
                
                
                while(!s1.isEmpty() || !s2.isEmpty()){
                    
                    
                    while(!s1.isEmpty()){
                        Node curr=s1.pop();
                        result.add(curr.data);
                        if(curr.left !=null){
                            s2.push(curr.left);
                        }
                        if(curr.right !=null){
                            s2.push(curr.right);
                        }
                    }
                    while(!s2.isEmpty()){
                        Node curr=s2.pop();
                        result.add(curr.data);
                        if(curr.right !=null){
                            s1.push(curr.right);
                        }
                        if(curr.left !=null){
                            s1.push(curr.left);
                        }
                        

                    }

                }
                return result;
            }
            public static boolean isIdentical(Node root,Node subroot){
                if(root==null && subroot==null) return true;

                if(root==null || subroot==null) return false;
                if(root.data !=subroot.data) return false;
                return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);

                
            }
            public static boolean isSub(Node root,Node subroot){
                if(root==null && subroot==null) return true;

                if(root==null || subroot==null) return false;
                if(isIdentical(root, subroot)) return true;

                return isSub(root.left, subroot) && isSub(root.right, subroot);
            }
        }
    }


}
