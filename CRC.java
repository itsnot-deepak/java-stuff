import java.util.*;
public class CRC {
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int m,g[],n,d[],z[],r[],msb,i,j,k;
        System.out.println("enter the number of data bits");
        n=sc.nextInt();
        System.out.println("enter the number of generator bits");
        m=sc.nextInt();
        d=new int[n+m];
        g=new int[m];
        System.out.println("enter the data bits ");
        for(i=0;i<n;i++){
            d[i]= sc.nextInt();
        }
        System.out.println("enter the generatir bits ");
        for (j=0;j<m;j++){
            g[j]=sc.nextInt();
        }
        for(i=0;i<m-1;i++){
            d[n+i]=0;
        }
        r=new int[m+n];
        for(i=0;i<m;i++){
            r[i]=d[i];
        }
        z=new int[m];
        for(i=0;i<m;i++){
            z[i]=0;
        }
        for(i=0;i<n;i++){
            k=0;
            msb=r[i];
            for(j=i;j<m+i;j++){
                if(msb==0){
                    r[j]=xor(r[j],z[k]);
                }
                else{
                    r[j]=xor(r[j],g[k]);
                    k++;
                }
            }
            r[m+i]=d[m+i];
        }
        System.out.println("the code bits added are:");
        for(i=n;i<n+m-1;i++){
            d[i]=r[i];
            System.out.print(d[i]);
        }
        System.out.println("\n the code data is:");
        for(i=0;i<n+m-1;i++){
            System.out.print(d[i]);
        }
    }
    public static int xor(int x, int y){
        if(x==y){
            return(0);
        }
        else{
            return(1);
        }
    }
}
