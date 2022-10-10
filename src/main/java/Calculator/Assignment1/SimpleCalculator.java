package Calculator.Assignment1;

import java.util.Scanner;
import java.util.Stack;

public class SimpleCalculator{

public static String evaluate(String expression)
    {
        char[] terms = expression.toCharArray();
 
        Stack<Integer> values = new Stack<Integer>();
 
        Stack<Character> operators = new Stack<Character>();
 
        for (int i = 0; i < terms.length; i++)
        {  
            if (terms[i] == ' ')
            {
                continue;
            }
            if (terms[i] >= '0' && terms[i] <= '9')
            {
                StringBuffer stringBuffer = new StringBuffer();
                 
                while (i < terms.length && terms[i] >= '0' && terms[i] <= '9')
                {
                    stringBuffer.append(terms[i++]);
                }
                values.push(Integer.parseInt(stringBuffer.toString()));
               
                i--;
            }
            else if (terms[i] == '(')
            {
                operators.push(terms[i]);
            }
            else if (terms[i] == ')')
            {
                while (operators.peek() != '(')
                {
                  values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            }
            else if (terms[i] == '+' || terms[i] == '-' || terms[i] == '*')
            {
                while (!operators.empty() && hasPrecedence(terms[i], operators.peek()))
                {
                  values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(terms[i]);
            }
        }
 
        while (!operators.empty())
        {
            values.push(applyOp(operators.pop(), values.pop(), values.pop()));
        }
        String result = Integer.toString(values.pop());
        return result;
    }
 
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
        {
            return false;
        }
        if ((op1 == '*') && (op2 == '+' || op2 == '-'))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public static int applyOp(char operator, int operand2, int operand1)
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
        String userInput = "";
        String result;
        boolean valid;
        boolean repeat = true;

        Scanner sc = new Scanner(System.in);
        while(repeat) {
            valid = true;
            System.out.println("Enter the equation or 'exit' to end the program.");
            userInput = sc.nextLine();
            for(int i = 0 ; i<userInput.length(); i++) 
            {
                if(userInput.equals("exit")) 
                {
                    repeat = false;
                }
                if(userInput.charAt(i) != '0' && userInput.charAt(i) != '1' && userInput.charAt(i) != '2' && userInput.charAt(i) != '3' && userInput.charAt(i) != '4' && 
                        userInput.charAt(i) != '5' && userInput.charAt(i) != '6' && userInput.charAt(i) != '7' && userInput.charAt(i) != '8' && userInput.charAt(i) > '9'  && 
                        userInput.charAt(i) != ' ' && userInput.charAt(i) != '+' && userInput.charAt(i) != '-' && userInput.charAt(i) != '*'  ) 
                {
                    valid = false;
                }
            }
            if(valid) {
                result = SimpleCalculator.evaluate(userInput);
                System.out.println("The result of the equation is: " + result);
            }
            else if(valid == false && repeat == true){
                System.out.println("The expression is invalid.");
            }
            else {
                System.out.print("You have exited the program.");
            }
        }
        sc.close();
    }
}
