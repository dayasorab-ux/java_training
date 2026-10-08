public class matrix_col_sum{
    public static void main(String[] args){
        int[][] a = {
            {20, 14, 17},
            {57, 18, 10},
            {70, 70, 80},
        };

        for (int j = 0; j < a[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
            System.out.println("Column " + j + " sum: " + sum);
        }
    }
}