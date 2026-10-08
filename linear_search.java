public class linear_search{
    public static void main(String[]args){
        int arr[] = {10,30,49,70,60,64};
        int target = 49;
        int index = -1;
        for (int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index!=-1)
            System.out.println("Index: " + index);
        else
            System.out.println("element not found");
    }
}