package Client;
import java.util.Scanner;

import MathsInterface.Operations;
import MathsInterface.MathsInterfaceImp.OperationImplementation;
public class MathsMain {
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int a=0;
  int b=0;
  Operations op=new OperationImplementation();
  System.out.println("Enter two numbers");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("Sum of two numbers is "+op.sum(a, b));
  System.out.println("Subtraction of two numbers is "+op.subtract(a, b));
 }
}
