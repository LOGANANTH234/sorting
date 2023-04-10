import java.util.*;

public class SelectionSorting {
    public static void main(String[] args)
    {
       // System.out.println("selectionSorting");

        Scanner in = new Scanner( System.in);
        System.out.println("enter a array length");
        int l = in.nextInt();
        int arr[]= new int [l];
        for(int i=0;i<l;i++){
            System.out.print("enter the "+ i+"st element ");
            arr[i]=in.nextInt();
        }
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static int [] selectionSorting (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int start=0;
            int max=Max(arr,start,last);
            int [] swap=Swap(arr,max,last);
        }
        return arr;
    }
    public static int Max (int arr[],int s,int e){
        int max=s;
        for (int i = 0; i <=e ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static int []Swap(int arr[],int max,int last){
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
        return arr;
    }
}
