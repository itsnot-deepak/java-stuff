import java.util.Scanner;
public class Selection_sort {
    public static void main(String...args){
        int x,y,temp;
        int arr[]=new int[10];
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the Elements of the array");
        for( int i=0;i<10;i++){
            System.out.printf("enter the %d element\n",(i+1));
            arr[i]= sc.nextInt();
        }
        System.out.print("[ ");
        for( int i=0;i<10;i++){
            System.out.printf("%d, ",arr[i]);
        }
        System.out.print(" ]\n");

        for(x=0;x<arr.length;x++){
            for(y=x+1;y< arr.length;y++){
                if(arr[x]>arr[y]){
                    temp=arr[x];
                    arr[x]=arr[y];
                    arr[y]=temp;
                }
            }
        }
        System.out.println("The final sorted array is ");
        System.out.print("[ ");
        for( int i=0;i<10;i++){
            System.out.printf("%d, ",arr[i]);
        }
        System.out.print(" ]");
    }
}
