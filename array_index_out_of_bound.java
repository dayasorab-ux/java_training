public class array_index_out_of_bound{
    public static void main(String[]args){
        try{
        int[] arr = {10,20,30,50};
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];
        System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error , no place for this index");
        }
    }
}