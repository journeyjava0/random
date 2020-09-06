package CodeWars;

import java.util.Scanner;

public class TempController {

    public static void main(String[] args) {
        calculateTemp();
    }

    //Get user's input
    public static void calculateTemp (){
        Scanner temp = new Scanner (System.in);
        System.out.println("Enter a value in F and I'll convert it to C: ");
        validInput(temp);
        int tempF = temp.nextInt();
        System.out.println(weatherInfo(tempF));
    }

    //Convert user's input to celsius
    public static String weatherInfo(int tempF) {
        double c = convertToCelsius(tempF);
        //what is the converted value in Celsius?
        if (c > 0)
            return (tempF + "F is " + c + "C and is above freezing temperature");
            else
            return (tempF + "F is " + c + "C and is freezing temperature");
    }

    //Convert from F to C
    public static int convertToCelsius(int temperature) {
        double celsius = (temperature - 32) * 5/9.0;
        return (int) celsius;
    }

    //See if they entered a valid answer
    public static void validInput(Scanner temp) {
        int count = 0;
        if (!temp.hasNextInt()) {
            do {
                System.out.println("That's not a valid input, so let's try that again!");
                temp.next();
                count ++;
            } while (!temp.hasNextInt());
        }
        if(count >0) {
            System.out.println("That's better ... ");
        }
    }
}