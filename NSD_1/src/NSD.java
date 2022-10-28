import java.util.Date;

public class NSD {

    public static void main (String[] args) {

        //1. Display your own name on the screen, using control characters to (roughly) centre it.
        System.out.println("\t \t \t \t Liam");

        //2. Declare three constant integers (specifying your own values) and display the mean of these three values to one decimal place, using a typecast to type float to avoid truncation of the result.
        int num1 = 45;
        int num2 = 3;
        int num3 = 15;
        float result = (float) (num1+num2+num3)/3;
        System.out.printf("%.1f%n", result);

        //3. Prompt the user to enter the day of the week, accept their entry and then display a message saying ‘Happy xxxxx!’, where ‘xxxxx’ is replaced with the day entered.
        java.util.Scanner Scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter a day of the week:");
        String dayOfWeek = Scanner.nextLine();
        System.out.println("Happy "+dayOfWeek+"!");

        //4. Accept a word from the keyboard and then display the last letter in that word.
        System.out.println("Please enter any word:");
        String word = Scanner.nextLine();
        String last = word.substring(word.length()-1);
        System.out.println("The last letter of the word is: "+last);

        //5. Design a class named Account that contains:
        Account a = new Account(1122,20000);
        a.setAccountDetails(1122,20000,450);
        a.printAccount();

        a.withdraw(2500);
        a.deposit(3000);
        a.printAccount();

        //6. Personnel and ShowPersonnel
    }
}
