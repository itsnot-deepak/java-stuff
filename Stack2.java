import java.util.*;
public class Stack2 {
    static int  top=-1;
     static  int len,ch=0,element,i;
    static int arr[]=new int[5];

    //taking our stack size as 5
    //An stack works on the principle of last in first out
    //here we have two functions in stack that are push and pop
    //stack works using a variable called top which is -1 at the start
    //I'll be creating a class called stack functions for push and pop method
    // ill be using the method that i did in class that is by creating multiple different methods
    static int underflow(){
        if(top==-1){
            return 1;
        }
        else{
            return 0;
        }
    }
     static int pop(){
        if(underflow()==1){
            System.out.println("The stack is empty");
            return top;
        }
        else{
            return(arr[top--]);
        }
    }
    static int overflow(){
        if(top>=4){
            return 1;
        }
        else{
            return 0;
        }
    }
    static void push(int element){
        if(overflow()==1){
            System.out.println("The stack is already full");
        }
        else{
            arr[++top]=element;
        }
    }
    static void display(){
        System.out.printf("top:%d\n",top);
        for(i=top;i>=0;i--){
            System.out.printf("| %d  |\n",arr[i]);
        }
    }
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        while((ch<4)){
            System.out.println("Welcome to the Stack implementation");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.Exit");
            System.out.println("enter your choice :");
            ch=sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("enter the element to push");
                    element=sc.nextInt();
                    push(element);
                    break;
                case 2:
                    System.out.printf("The popped element is %d\n",pop());
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
