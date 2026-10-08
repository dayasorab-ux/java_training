public class min_max_matrix{
    public static void main(String[] args){
        int[][] a = {
            {20, 14, 17},
            {57, 18, 10},
            {70, 70, 87},
        };
        int min = a[0][0];
        int max = a[0][0];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length;j++){
                System.out.print(a[i][j]+"  ");
                min = Math.min(min,a[i][j]);
                max = Math.max(min,a[i][j]);
            }
            System.out.println(); 
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}