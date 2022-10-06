import java.util.Scanner;
import java.util.Stack;

public class SimpleCalculator{

public static int evaluate(String expression)
    {
        char[] terms = expression.toCharArray();
 
        Stack<Integer> values = new
                              Stack<Integer>();
 
        Stack<Character> operators = new
                              Stack<Character>();
 
        for (int i = 0; i < terms.length; i++)
        {
             
            if (terms[i] == ' ')
                continue;
 
            if (terms[i] >= '0' &&
                 terms[i] <= '9')
            {
                StringBuffer stringBuffer = new
                            StringBuffer();
                 
                while (i < terms.length &&
                        terms[i] >= '0' &&
                          terms[i] <= '9')
                    stringBuffer.append(terms[i++]);
                values.push(Integer.parseInt(stringBuffer.
                                      toString()));
               
                  i--;
            }
 
            else if (terms[i] == '(')
                operators.push(terms[i]);
 
            else if (terms[i] == ')')
            {
                while (operators.peek() != '(')
                  values.push(applyOp(operators.pop(),
                                   values.pop(),
                                 values.pop()));
                operators.pop();
            }
 
            else if (terms[i] == '+' ||
                     terms[i] == '-' ||
                     terms[i] == '*')
            {

                while (!operators.empty() &&
                       hasPrecedence(terms[i],
                                    operators.peek()))
                  values.push(applyOp(operators.pop(),
                                   values.pop(),
                                 values.pop()));
 
                operators.push(terms[i]);
            }
        }
 
        while (!operators.empty())
            values.push(applyOp(operators.pop(),
                             values.pop(),
                           values.pop()));
 
        return values.pop();
    }
 
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
        {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static int applyOp(char operator, int operand1, int operand2)
    {
        switch (operator)
        {
        case '+':
            return operand1 + operand2;
        case '-':
            return operand1 - operand2;
        case '*':
            return operand1 * operand2;

        default:
        }
        return 0;
    }

    public static void main(String[] args)
    {
        String userInput;
        int result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the equation with spaces between the numbers and operators.");

        userInput = sc.next();
        
        result = evaluate(userInput);
        
        System.out.println("The result of the equation is: " + result);
        sc.close();
    
    }
}