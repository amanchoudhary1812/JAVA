import java.util.Scanner;

public class Temperature_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius:");

        Float tempC = input.nextFloat();

        Float tempF = (tempC * 9/5) + 32; // Formula to change Temperature from Celsius to Fahrenheit.

        System.out.println(tempF); 

    }
}
