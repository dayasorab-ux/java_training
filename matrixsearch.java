class matrixsearch{
      public static void main(String[] args){
        int[][] graph = {
            {0 , 1, 1},
            {0 , 1, 1},
            {0 , 1, 1},
        };
        int target = 1;
        boolean found = false;
        for (int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length;j++){
                if(graph[i][j] == target){
                System.out.print("found at "+i+","+j);
                found = true;
                }
            }
        }
        if(found){
            System.out.println("not found");
        }
    }
}