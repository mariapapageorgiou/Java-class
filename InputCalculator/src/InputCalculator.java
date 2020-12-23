import java.util.Scanner;

public class InputCalculator {
    // Write a method called inputThenPrintSumAndAverage that does not have any parameters
    // The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
    // When the user enters something that is not an int then it needs to print a message in the format
    // "SUM = XX AVG = YY". XX represents the sum of all entered numbers of type int. YY represents the calculated
    // average of all numbers of type long.
    // TIPs: 1. Use Scanner to read an input from the user
    //       2. Use casting when calling the round method since it needs double as a parameter.
    //       3. Use the method Math.round to round the calculated average (double). The method round returns long.
    //       4. Be mindful of spaces in the printed message.
    //       5. Be mindful of users who may type an invalid input right away.
    //       6. The method inputThenPrintSumAndAverage should be defined as public static

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while(true) {

            // System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

                sum += number;
                count ++;
                average = Math.round((double)sum/count);
                average = Math.round(average);

            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
