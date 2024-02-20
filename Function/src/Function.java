import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        greetingUser();
       int firstNumber = userInput();
       int secondNumber = userInput();
       int sum = firstNumber + secondNumber;

        System.out.println("Sum of firstNumber  and secondNumber  is : " + sum);
    }



    public static void greetingUser() {
        System.out.println("Welcome to calculator \n");
    }

    public static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int num = input.nextInt();
        return num;

    }


}