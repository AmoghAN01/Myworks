import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args) 
    {
        int n, count = 0, x, y, z, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer to check if it is Armstrong:");
        n = s.nextInt();
        x = n;
        z = n;
        while(x > 0)
        {
            x = x / 10;
            count++;
        }
        while(n > 0)
        {
            y = n % 10;
            sum = (int) (sum+Math.pow(y, count));
            n = n / 10;
        }
        if(sum == z)
        {
            System.out.println("\n The Given number is an Armstrong number");
        }
        else
        {
            System.out.println("\n The Given number is not an Armstrong number");
        }    
    }
}
