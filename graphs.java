import java.util.ArrayList;

public class graphs {
    static class Edge{
        int src;int dest;
        public Edge(int s,int d){
            this.src=s;this.dest=d;

        }
        public static void createGraph(ArrayList<Edge> graph[]){
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<Edge>();
            }
            graph[0].add(new Edge(0,2));
            graph[0].add(new Edge(0,1));
            graph[1].add(new Edge(1,3));
            graph[0].add(new Edge(0,3));
            

        }
        public static void printAllpaths(int curr,ArrayList<Edge> graph[],boolean[] vis,int target,String path){
            if(curr==target){
                System.out.println(path);
                return;
            }
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(!vis[e.dest]){
                    printAllpaths(e.dest, graph, vis, target, path+e.dest);

                }
                
                
                


            }
            vis[curr]=false;
        }
        

    }
    
}
