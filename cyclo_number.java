import java.io.*;
import java.util.Scanner;

public class cyclo_number 
{
    public static void main(String[] args)//throws IOException
    {

        Scanner sc=new Scanner(System.in);  // Initialize the Scanner Class object
        //InputStreamReader isr=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(isr);

        //System.out.println("Enter the number :");
        // int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();  // Read the input

        int rem ,rem1,rev=0,temp=n,n1=n;  // Initialize the variables
        int div,cnt=-1;
        rem1 = n1 % 10;  // Store the value in vaiable

        while(n>0) {
            /*rem=n%10;
            rev=rev*10+rem;*/
            cnt++;
            n = n / 10;
        }
        div = (int)Math.pow(10,cnt);
        int ans = temp / div;
        //int ans = rev % 10;
        if (rem1==ans)
        {
            System.out.println("The number is cyclo number.");  // Printing output
        }
        else {
            System.out.println("The number is not cyclo number.");
        }
    }
}
