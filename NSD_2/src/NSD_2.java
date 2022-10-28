import java.util.Scanner;

public class NSD_2 {

    public static void main(String[] args) {

        //1. Write a program that accepts an integer from the user and then determines all the even and odd numbers from 1 up to the integer entered by the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in any whole number:");
        int inputNum = scanner.nextInt();

        for (int i = 1; i < (inputNum + 1); i++) {

            if (i % 2 == 1) {
                System.out.println(i + " is odd");
            } else {
                System.out.println(i + " is even");
            }
        }

        //2. In UseEmpClasses, Worker and Manager classes

        //3. Write a program that accepts daily rainfall figures for a series of consecutive days and then outputs the number of days and the mean daily rainfall for the period. Figures are to be entered as integers that represent the rainfall in millimetres (mm) and the mean is to be shown in mm, to 1 decimal place. It is known that some data corruption has occurred, resulting in the occasional appearance of a 3-digit rainfall figure. Whenever such a value occurs, it is to be ignored for calculation purposes, but should generate an error message via a new exception class called CorruptionException (that you are to write). Use a while loop for data entry and terminate data entry via any negative value.
        System.out.println("\nDaily Rainfall Figures");
        System.out.println("----------------------");

        int[] rainfallFig = {4, 12, 200, 4, 15, 1, 5, -12, 3};

        int loop = 0;
        int days = 0;
        double mean = 0;
        CorruptionException c = new CorruptionException();

        while (rainfallFig[loop] > 0) {

            if (c.checkNum(rainfallFig[loop]) == 0) {

                mean += rainfallFig[loop];
                days++;
                loop++;
            } else {

                c.reset();
                loop++;
            }
        }

        mean = mean / days;

        java.text.DecimalFormat oneDec = new java.text.DecimalFormat("0.0");

        System.out.println("Days of rainfall data recorded: " + days);
        System.out.println("The mean rainfall in mm: " + oneDec.format(mean));


        //4. Fahrenheit to Celsius converter
        System.out.println("\nFahrenheit to Celsius converter");
        System.out.println("-------------------------------");
        System.out.println("Please type in the current temperature in Fahrenheit");

        int f = scanner.nextInt();
        double c1 = (double) 5/9;
        double c2 = ((f-32)*c1);

        System.out.println(f + "Fahrenheit in Celcius is: " + c2);
        
    }
}
