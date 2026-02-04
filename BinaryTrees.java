import java.util.*;
public class BinaryTrees {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }



    }
    static class bt{
        int idx = -1;
        int[] nodes;

        bt(int[] nodes) {
            this.nodes = nodes;
        }

        public Node buildTree() {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree();
            newNode.right = buildTree();

                return newNode;
            }


        //dfs type traversals--O(n)

        public static void preorder(Node Node){
            if(Node==null){
                return;
            }
            System.out.println(Node.data);
            preorder(Node.left);
            preorder(Node.right);
        }

        public static void postorder(Node Node){
            if(Node==null){
                return;
            }
            postorder(Node.left);
            postorder(Node.right);
            System.out.println(Node.data);
            
        }

        public static void inorder(Node Node){
            if(Node==null){
                return;
            }
            inorder(Node.left);
            System.out.println(Node.data);
            
            inorder(Node.right);
            
            
        }

        // bfs type traversal--O(n)
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);q.add(null);
            while(!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(curr.data);
                    if(curr.left!=null){
                        q.add(curr.left);

                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }

        }

        public static int count(Node root){
            if(root==null){
                return 0;
            }

            int lc=count(root.left);int rc=count(root.right);
            int totalCount=lc+rc+1;

            return totalCount;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }

            int ls=sum(root.left);int rs=sum(root.right);

            return ls+rs+root.data;
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);

            return Math.max(lh,rh)+1;
        }

        //diameter of tree
        //approach-1-->O(n^2)

        public static int dia1(Node root){
            int diam1=dia1(root.left);
            int diam2=dia1(root.right);
            int diam3=height(root.left)+height(root.right)+1;

            return Math.max(Math.max(diam1,diam2),diam3);
        }

        //approach2-->O(n)
        static class treeInfo{
            int ht;
            int dia;
            treeInfo(int ht,int dia){
                this.ht=ht;this.dia=dia;
            }

            public static treeInfo dia2(Node root){
                if(root==null){
                    return new treeInfo(0, 0);
                }
                treeInfo left=dia2(root.left);
                treeInfo right=dia2(root.right);

                int myHeight=Math.max(left.ht,right.ht)+1;
                int diameter1=left.dia;
                int diameter2=right.dia;
                int diameter3=left.ht+right.ht+1;
                int myDia=Math.max(Math.max(diameter1,diameter2),diameter3);


                return new treeInfo(myHeight, myDia);
            }
        }
        public static boolean isIdentical(Node root,Node subroot){  //O(M*N)
            if(root==null && subroot==null){
                return true;
            }
            if(root==null || subroot==null){
                return false;
            }
            return isIdentical(root.left, subroot) && isIdentical(root.right, subroot);
        }

        public static boolean isSubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if(isIdentical(root, subroot)){
                return true;
            }

            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
        
        public static int countLeaf(Node root){
            if (root==null){
                return 0;
            }
            
            
            if(root.right==null && root.left==null){
                return 1;
            }

            return countLeaf(root.left) + countLeaf(root.right);
        }

        public static boolean isPresent(Node root,int target){
            if(root==null){
                return false;
            }
            if(root.data==target){
                return true;

            }

            return isPresent(root.left,target) || isPresent(root.right,target);
        }
        static int max=Integer.MIN_VALUE;

        public static int Max(Node root){
            if(root==null){
                return Integer.MAX_VALUE;
            }
            int lmax=Max(root.left);
            int rmax=Max(root.right);

            return Math.max(Math.max(lmax,rmax),root.data);

        }

        public static int Min(Node root){
            if(root==null){
                return Integer.MIN_VALUE;
            }
            int lmin=Min(root.left);
            int rmin=Min(root.right);

            return Math.min(Math.min(lmin,rmin),root.data);

        }
        
        

    }

    public static void main(String[] args) {
        
        int nodes[]={1,2,3,4,5,6,-1,-1};
        
    }
    
}
