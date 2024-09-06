import java.util.*;
import  java.lang.*;
class gen<type>{
    type ob;
    gen(type o){
        ob=o;
    }
    type getOb(){
        return ob;
    }
    void typeof(){
        System.out.println("the type of type is : "+ob.getClass().getName());
    }

}
class genz<type1,type2>{
    type1 ob1;
    type2 ob2;
    genz(type1 o1,type2 o2){
        ob1=o1;
        ob2=o2;
    }
    void their_types(){
        System.out.println("The type of the argument 1 is :"+ob1.getClass().getName());
        System.out.println("The type of the argument 2 is :"+ob2.getClass().getName());
    }
    type1 getkey(){
        return ob1;
    }
    type2 getValue(){
        return ob2;
    }
}
class nonGenz{
    Object ob1;
    nonGenz(Object o){
        ob1=o;
    }

}
class boundgen< type extends Number>{
    type[] arr;
    boundgen(type[] T){
        arr=T;
    }
    double avg(){
        double sum=0.0;
        for(type i:arr){
            sum=sum+i.doubleValue();
        }
        return sum/ arr.length;
    }
}
public class genzs {
    public static void main(String...args){
        gen<Integer> test=new gen<Integer>(1221);
        test.typeof();
        System.out.println("the value here is :"+test.getOb());

        gen<String> test2=new gen<String>("hola mf");
        test2.typeof();
        System.out.println("the value here is :"+test2.getOb());

        Integer num[]={1,2,3,4,5,6};
        boundgen<Integer> iob=new boundgen<Integer>(num);
        System.out.println("the avg is :"+iob.avg());
    }

}
