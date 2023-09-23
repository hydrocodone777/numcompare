import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int one = 0;
        int two = 0;
        Scanner inone = new Scanner(System.in);
        System.out.println("Input the first number ");
        if (inone.hasNextInt()){
            one = inone.nextInt();
            inone.nextLine(); }
        else{
            System.out.println("Invalid input, please restart and enter a digit ");
        }
        System.out.println("Input the second number ");
        Scanner intwo = new Scanner(System.in);
        if (intwo.hasNextInt()){
            two = intwo.nextInt();
            intwo.nextLine();
        }
        else {
            System.out.println("Invalid input, please restart and enter a digit ");
        }
        if (one > two) {
            System.out.println("First number is greater.");
        }
        else if (two > one) {
            System.out.println("Second number is greater");
        }
        else if (one == two) {
            System.out.println("Your numbers are equal");
        }
    }
}