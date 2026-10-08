class matrix_sym{
      public static void main(String[] args){
        int[][] graph = {
            {0 , 1, 1},
            {0 , 1, 1},
            {0 , 1, 1},
        };
        boolean symetric = true;
        for (int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph[i].length;j++){
                if(graph[i][j] == graph[i][j]){
                    symetric = false;
                }
            }
        }

            System.out.println(symetric? "symetric matrix" : "not symetric");
        }
    }
