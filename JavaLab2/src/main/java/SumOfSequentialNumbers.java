
import java.util.Scanner;

/**
 * @author Armando Del Rio
 */
public class SumOfSequentialNumbers {
    
    private static Scanner input = new Scanner(System.in);
    
    public SumOfSequentialNumbers(){}
    
    public static int sequentialPrint(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
          return sequentialPrint(n - 1) + sequentialPrint(n - 2);
    }
    
    public static void main(String[] args) {
        int number, finalNumber;
        System.out.println("Input the N: ");
        number = input.nextInt();
        finalNumber = sequentialPrint(number);
        System.out.println("The sum of 1 to " + number + " is " + finalNumber);
    }
}
