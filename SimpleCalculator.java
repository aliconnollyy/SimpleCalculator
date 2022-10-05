import java.util.Scanner;
public class SimpleCalculator{

    public static void main(String[] args)
    {
        String userInput;
  
        // Take input from the user
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the equation with spaces between the numbers and operators.");
  
        userInput = sc.next();

        sc.close();
    
    }
}