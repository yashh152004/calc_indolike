import java.util.*;
class Calc
{
 public static void main(String args[])
 {
     double value=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("CALCULATOR");
     System.out.println("ENTER FIRST NO.");
     double a=sc.nextDouble();
     System.out.println("ENTER 2ND NO.");
     double b=sc.nextDouble();
     System.out.println("Enter the Arithmetic Tool (+, -, *, /):");
     char X = sc.next().charAt(0);
     switch(X)
     {
        case '+' -> {
            value=a+b;
            System.out.println("SUM="+value);
         }
        case '-' -> {
            value=a-b;
            System.out.println("DIFF="+value);
         }
        case '*' -> {
            value=a*b;
            System.out.println("PROD="+value);
         }
        case '/' -> {
            value=a/b;
            System.out.println("DIV"+value);
         }
        default -> System.out.println("INVALID INPUT");
     }
     System.out.println("OUTPUT="+value);
    }
}