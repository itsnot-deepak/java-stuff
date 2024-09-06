import java.util.*;
public class bubble_sort {
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

        for(x=0;x<10;x++){ // this decides the number of passes that will happen
            for(y=0;y<10-x-1;y++){   // here we can also write 9 instead of 10 basically we do -1 when we do not know the size of the array
                // this loop decides how many time do we do the comparsion
                if(arr[y]>arr[y+1]){
                    temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
            }
        }
        System.out.println(" The sorted array is ");
        System.out.print("[ ");
        for( int i=0;i<10;i++){
            System.out.printf("%d, ",arr[i]);
        }
        System.out.print(" ]\n");
    }
}
