import java.util.*;

public class bubbleSorting {
    public static void main(String[] args) {
        System.out.println("enter the length");
        Scanner in= new Scanner(System.in);
int length= in.nextInt();
int []arr=new int [length];
for(int i=0;i<length;i++){
    System.out.println("the frst element "+i+"st");
    arr[i]=in.nextInt();

}//54321
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int []bubblesorting(int arr[]){
       for(int i =0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++) {
            if(arr[j]>arr[j+1]){
int temp=arr[j+1];
arr[j+1]=arr[j];
arr[j]=temp;
            }
        }
       }
       return arr;
    }
}
