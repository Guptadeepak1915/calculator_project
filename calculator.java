import java.util.*;
class calculator {
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int first_no=sc.nextInt();
    System.out.println("Enter the oparator");
    String op=sc.next();
    System.out.println("entr the second number");
    int second_no=sc.nextInt();
    switch(op){
      case "+":
      System.out.println("adition :"+(first_no+second_no));
      break;
      case "-":
      System.out.println("subtraction :"+(first_no-second_no));
      break;
      case "*":
      System.out.println("multyply"+(first_no*second_no));
      break;
      case "/":
      System.out.println("divide :"+(first_no/second_no));
      break;
      case "%":
      System.out.println(" remaineder"+(first_no%second_no));
      break;
      default:
      System.out.println("enter the validoparator");
    }
  }
}
