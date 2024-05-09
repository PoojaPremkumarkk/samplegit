package inheritance;

import java.util.Scanner;

//Base class
class AddNumbers {
 protected int num1;
 protected int num2;
 
 public AddNumbers(int num1, int num2) {
     this.num1 = num1;
     this.num2 = num2;
 }
 
 public int add() {
     return num1 + num2;
 }
}

//Derived class inheriting from AddNumbers
class AddTwoNumbers extends AddNumbers {
 public AddTwoNumbers(int num1, int num2) {
     super(num1, num2);
 }



 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter the first number:");
     int firstNumber = scanner.nextInt();
     
     System.out.println("Enter the second number:");
     int secondNumber = scanner.nextInt();
     
     // Create an object of derived class
     AddTwoNumbers adder = new AddTwoNumbers(firstNumber, secondNumber);
     
     // Call add method to get the sum
     int sum = adder.add();
     
     System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
     
     scanner.close();
 }
}
