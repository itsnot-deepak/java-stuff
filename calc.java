import java.util.Scanner;
public class calc {
    public static void main(String...args){
        int a,b;
        int result=0;
        char op;
        System.out.println("Welcome to the calculator");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the First Number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        System.out.println(" choose among the following operators +,-,*,%,/");
        op=sc.next().charAt(0);
        switch (op){
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '%':
                if(b==0){
                    System.out.println("B cannot be zero for this operation");
                }
                else{
                    result=a%b;
                }
                break;
            case '/':
                if(b==0){
                    System.out.println("B cannot be zero sar");
                }
                else{
                    result=a/b;
                }
                break;
        }
        System.out.println("The result of the calculations is "+result);
    }
}
