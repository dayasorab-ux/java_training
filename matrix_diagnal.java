public class matrix_diagnal{
    public static void main(String[] args){
        int[][] graph = {
            {0 , 1, 1},
            {0 , 1, 1},
            {0 , 1, 1},
        };
        System.out.println("main diagnal");
        for (int i = 0; i < graph.length; i++){
            System.out.println(graph[i][i]+" ");
        }
    }
}