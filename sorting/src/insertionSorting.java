import java.util.Arrays;

public class insertionSorting {
    public static void main(String[] args) {
        int arr[]={9,0,-6,-1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j>0;j--){
               if(arr[j-1]>arr[j]){
                   swap( arr,j-1 ,j);

               }
               else
                   break;
           }
        }
        return arr;
    }
    public static int []swap(int arr[],int h,int j){
        System.out.println("hu");
        int temp=arr[h];
        arr[h]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
