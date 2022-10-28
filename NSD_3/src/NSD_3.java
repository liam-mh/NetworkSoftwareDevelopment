import java.util.*;

public class NSD_3 {

    public static void main(String[] args) {

        // 1.Supposing that integers are a variable of type Collection<Integer>.
        // Write a program that accepts a list of integers from user and then uses an iterator to compute the sum of all the integer values in the collection.
        // Write a second code segment that does the same thing using a for-loop.

        List<Integer> userInt = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        System.out.println("Please type in any whole numbers. Input 0 to finish");
        int userInput = in.nextInt();
        userInt.add(userInput);

        while (userInput != 0) {
            userInput = in.nextInt();
            userInt.add(userInput);
        }

        System.out.println("Using a while loop:");
        Iterator<Integer> it = userInt.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("Using a for loop:");
        for (Integer i : userInt)
            System.out.println(i);


        // 2. Write a program that reads an unspecified number of integers and finds the one that has the most occurrences.
        // The input ends when the input is 0. For example, if you entered 2, 3, 40, 3, 5, 4, 3, 3, 3, 2, 0, the number 3 occurred most often.
        // If not one but several numbers have the most occurrences, all of them should be reported.
        // For example, since 9 and 3 appear twice in the list 9, 30, 3, 9, 3, 2, 4, both occurrences should be reported.
        // Hint: You need a map collection to store the integers.

        System.out.println("");
        System.out.println("Hashmap - most common numbers");

        HashMap<Integer, Integer> numbers = new HashMap<>();

        System.out.println("Please type in any whole numbers. Input 0 to finish");
        int userIn2 = in.nextInt();
        numbers.put(userIn2, 0);
        while (userIn2 != 0) {
            userIn2 = in.nextInt();
            numbers.put(userIn2, 0);
        }

        for (Integer a : numbers.keySet()) {

            for (Integer b : numbers.keySet()) {

                if (a == b) {
                    Integer val = numbers.get(a);
                    val++;
                    numbers.put(a, val);
                }
            }
        }


            for(Integer key : numbers.keySet()) {
                for(Integer element : numbers.values()) {
                    int count;
                    if(numbers.containsKey(element)) {
                        count = numbers.get(element);
                    } else {
                        count = 1;
                    }
                    numbers.put(element, count + 1);
                }
            }


        for (Integer i : numbers.values())
            System.out.println(i);

    }
}
