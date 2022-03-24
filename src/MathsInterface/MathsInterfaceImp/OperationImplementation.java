package MathsInterface.MathsInterfaceImp;
import MathsInterface.Operations;

public class OperationImplementation implements Operations{
 @Override
 public int sum(int a,int b)
 {
  return a+b;
 }
 @Override
 public int subtract(int a,int b)
 {
  return a-b;
 }
}
