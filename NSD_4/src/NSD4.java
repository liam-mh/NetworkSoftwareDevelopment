import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class NSD4 {

    public static void main(String[] args) throws IOException {

        /*
        try {
            FileInputStream in = new FileInputStream("Me.mp3");
            int a = in.read();

            FileOutputStream out = new FileOutputStream();

        } catch(Exception e) {
            System.out.println(e);
        }
        */

        System.out.println("Car app");
        System.out.println("-------");

        String userReg;
        String make;
        double price;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input your cars registration, make and price:");
        userReg = scan.nextLine();
        make = scan.nextLine();
        price = scan.nextDouble();

        cars car = new cars(userReg,make,price);


    }
}
