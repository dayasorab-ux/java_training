class recur{
    void print(int n){
        if(n == 0) {
            //System.out.println(n);
            //print(n-1) ;
        return;       }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        recur r = new recur();
        r.print(5);
    }
}