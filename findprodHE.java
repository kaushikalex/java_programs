import java.util.*;
import java.lang.Math;
public class findprodHE {
    public static void main(String args[] ) throws Exception {
    int n;
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    long[] a= new long[n];
        for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    long ans=1;
    long x;
    x=(long)Math.pow(10,9);
        for(int i=0;i<n;i++)
    ans=(ans*a[i])%(x+7);
        System.out.println(ans);

}
}
