class tree_root{
    static class node{
        int data;
        node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        node root = new node(10);
        System.out.println("root "+root.data);
    }
}