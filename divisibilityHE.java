import java.util.Scanner;
public class divisibilityHE {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++)
            data[i]=data[i]%10;
        if(data[N-1]==0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
