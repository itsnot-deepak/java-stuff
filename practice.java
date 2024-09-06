import java.util.*;
import java.util.Collections;

public class practice {
    public static  void main(String...args){
    int num ;
    Stack<Integer> stack1 =new Stack<>();
    stack1.push(50);
    stack1.push(30);
    System.out.println(stack1);
    LinkedList<Integer> ll=new LinkedList<>();
    ll.add(1);
    ll.add(5);
    ll.add(6);
    ll.remove(2);
    System.out.println(ll);
    Map<Integer,String> hh=new HashMap<>();
    hh.put(1,"deepak");
    hh.put(2,"dev");
    System.out.println(hh.containsValue("deepak"));
    String s="deepak";
    int len=s.length();
    char ch[]=new char[len];
    for( int i=0;i<len;i++){
        ch[i]=s.charAt(i);
    }
    System.out.println(ch);
    Arrays.sort(s.toCharArray());
    System.out.println(s);

}}
