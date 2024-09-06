import java.awt.desktop.SystemEventListener;
import java.util.*;

enum error_code{
        Error_404(404),Error_500,Error_505,Error_400(400);
        private int code;
        error_code(int c){
            code=c;
        }
        error_code(){
            code=-1;
        }
        int getCode(){
            return code;
        }

}
public class enumerations {
    public static void main(String...args){
    error_code er1,er2,er3;
    er1=error_code.Error_400;
    er2=error_code.Error_404;
    er3=error_code.Error_500;
    System.out.println(error_code.valueOf("Error_400"));
    for(error_code e:error_code.values()){
        System.out.println(e);
    }
    System.out.println(er1.ordinal());
    switch (er1){
        case Error_404 :
            System.out.println("This is the not found error");
            break;
        case Error_400 :
            System.out.println("This is your papa ji ka error");
            break;
        case Error_500:
            System.out.println("This is the mummy ji ka error");
            break;
    }
    System.out.println(er2.compareTo(error_code.Error_400));
    System.out.println(er1.equals(er2));
    System.out.println(er2.getCode());
    System.out.println(er3.getCode());
    }

}
