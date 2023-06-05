import java.util.Scanner;

public class StringPalindromeHE {
    public static void main(String args[] ) throws Exception {

        String s,x;
        int n;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        x=s;
        n=s.length();
        int i=n-1;
        int j=0,ct=1;
        while(i>=0 && j<n)
        {
            if(x.charAt(i)!=s.charAt(j))
                ct=0;
            i--;
            j++;
        }
        if(ct==1)
            System.out.println("YESSSSS");
        else
            System.out.println("NOO");

    }
}
