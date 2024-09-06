import java.util.*;
class stack_functions{
    int arr[]=new int[5];
    public int push(int num,int top){
        if(top==arr.length-1){
            System.out.println("STACK OVERFLOW !!!");
            return (top);
        }
        else{
            top=top+1;
            arr[top]=num;
            System.out.println(arr[0]+' '+arr[1]+' '+arr[2]+' '+arr[3]+' '+arr[4]);
            return(top);
        }
    }
    public int[] pop(int top){
        int val_ret[]=new int[2];
        if(top==-1){
            System.out.print("STACK UNDERFLOW!!");
            val_ret[0]=top;
            val_ret[1]=10000000;
            return (val_ret);

        }
        else{
            int poppy=arr[top--];
            val_ret[0]=top;
            val_ret[1]=poppy;
            return(val_ret);
        }
    }
    public void display(int top){
        for(int i=top;i>=0;i--){
            System.out.printf("| %d |\n",arr[i]);
        }
    }

}
public class stack {
    public static void main(String...args) {
        //taking our stack size as 5
        //An stack works on the principle of last in first out
        //here we have two functions in stack that are push and pop
        //stack works using an variable called top
        //I'll be creating a class called stack functions for push and pop method
        int choice = 0;
        int top=-1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Stack Implememtation");
        while (choice != 3) {
            System.out.print("Choose an Functionality:\n1.push\n2.pop\n3.Display\n4.Exit\n");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            stack_functions sf = new stack_functions();
            switch (choice){
                case 1:
                    System.out.println("enter the number to push:");
                    num=sc.nextInt();
                    top=sf.push(num,top);
                    break;
                case 2:
                    int val_back[]=sf.pop(top);
                    top=val_back[0];
                    System.out.printf("The popped number is %d\n",val_back[1]);
                    break;
                case 3:
                    System.out.println("-------stack-------");
                    System.out.println(top);
                    sf.display(top);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input MR");
                    break;
            }
        }
    }
}
