import java.util.*;
class Sum{

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:\n");
    int num1 = sc.nextInt();
    System.out.println("Enter second number:\n");
    int num2 = sc.nextInt();
    int num3 = num1 + num2;
    System.out.println("Sum of " +" "+num1+" "+ "and"+" "+num2+" "+":"+num3);
  }
}