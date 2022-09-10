import java.util.Scanner;

public class ToggleStringHE {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = "";
        for(int i=0; i<S1.length(); i++)
        {

            char c = S1.charAt(i);

            if(c>= 97 && c<=122)
            {
                S2+=Character.toUpperCase(c);
            }
            else
            {
                S2+=Character.toLowerCase(c);
            }
        } System.out.println(S2);

    }
}
