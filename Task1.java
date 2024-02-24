Question 1

package firsttask;

public class Question1 {
  //write a program to print the number from 10 to 50 using for loop/while loop
    public static void main( String[] args) {
      for ( int i=10;i<=50;i++) {
        System.out.println(i);
    }
    }
}



Question 2


package firsttask;

import java.util.Scanner;
  public class Question2 {
    //write a  program that find a given number is negative or positive
        public static void main(String[] args) {
            // Create Scanner object to read input
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number: ");
            // Read the number provided by the user
            double number = sc.nextDouble();

            // Check if the number is positive, negative, or zero
            if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else {
                System.out.println("The number is zero.");
            }
        }

  



Question 3




package firsttask;

public class Question3 {
     public static void main(String[] args) {
    //write down the program to reverse the given number using loops ,input =876 output =678
       
       int number = 876, reverse = 0;  
       while(number != 0)   
       {  
       int remainder = number % 10;  
       reverse = reverse * 10 + remainder;  
       number = number/10;  
       }  
       System.out.println(reverse);  
       }  
       }



Question 4




package firsttask;

public class Question4 {
//write a java program to find the smallest number in among three numbers
  public static void main(String[] args) {
        int num1 = 9, num2 = 6, num3 = 3;

            if (num1 <= num2 && num1 <= num3)
                System.out.println("Smallest number is: " + num1);
            else if (num2 <= num1 && num2 <= num3)
                System.out.println("Smallest number is: " + num2);
            else
                System.out.println("Smallest number is: " + num3);
        }
    

  }





Question 5






package firsttask;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double discount = 0.0;
        if (purchaseAmount < 500) {
            discount = 0; // no discount
        } else if (purchaseAmount > 500 && purchaseAmount < 1000) {
            discount = 10; // 10% discount for purchases between 500 and 1000
        } else if (purchaseAmount > 1000) {
            discount = 20; // 20% discount for purchases over 1000
        }

        double discountAmount = (purchaseAmount * discount) / 100;
        double payableAmount = purchaseAmount - discountAmount;

        System.out.println("Discount: $" + discountAmount);
        System.out.println("Payable amount: $" + payableAmount);

        sc.close();
    }

}






Question 6




package firsttask;

public class Question6 {
      public static void main(String[] args) {
          int n=5;
          for (int i=n; i>=1; i--) {
              for (int j=n; j>=i;j--) {
                  System.out.print(j);
              }
              for (int k=1; k<i; k++) {
                  System.out.print(i);
              }
              System.out.println();
          }
      }
  }













