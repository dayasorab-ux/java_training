class knapsack01{
    static int knapsack(int[] weight, int[] value, int capacity){
        int n = weight.length;
        int[][] dp = new int[n+1][capacity + 1];
        for(int i = 1;i <= n;i++){
            for(int w = 1; w <= capacity; w++ ){
                dp[i][w] = dp[i - 1][w];
                if(weight[i -1] <= w){
                    dp[i][w] = Math.max(dp[i][w], value[i - 1] + dp[i - 1][w - weight[i - 1]]);
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String[] args){
        int[] weight = {1,2,3,4};
        int[] value = {10,15,40,50};
        int capacity = 5;
        System.out.println(knapsack(weight, value, capacity));
    }
}