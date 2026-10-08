public class sum_matrix{
    public static void main(String[] args){
        int[][] a = {
            {20, 14, 17},
            {57, 18, 10},
            {70, 70, 80},
        };
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length;j++){
                sum += a[i][j];
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
            
        }
        System.out.println("Sum "+sum);
    }
}