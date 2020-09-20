public class NumberToWords {

    // Write a method called numberToWords with one int parameter named number. The method should print out the passed
    // number using words for the digits. If the number is negative, print "Invalid Value".
    // To print the number as words, follow these steps:
    // 1. Extract the last digit of the given number using the remainder operator.
    // 2. Convert the value of the digit found into a word. There are 10 possible values for that digit, those being
    //    0,1,2,3,4,5,6,7,8,9. Print the corresponding word for each digit.
    // 3. Remove the last digit from the number.
    // 4. Repeat steps 2 through 4 until the number is 0.

    // Write a second method called reverse. The method should have one int parameter and return the reversed number(int).
    // The method reverse should also reverse negative numbers.
    // Use the method reverse within the method numberToWords in order to print the words in the correct order.

    // Write a third method called getDigitCount. The method should have one int parameter called number and return the
    // count of the digits in that number. If the number is negative, return -1 to indicate an invalid value.

    // HINT: Use a for loop to print zeroes after reversing the number. To get the number of zeroes, check the difference
    //       between the digit count from the original number and the reversed number.

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int reverse = reverse(number);
        int count= getDigitCount(number);

        while(reverse > 0 || count > 0) {
            int digit = reverse % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }
                reverse /= 10;
                count--;

        }
    }

    public static int reverse(int number) {

        int reverse = 0;
        int digit = 0;

        while(number != 0) {
            digit = number % 10;
            reverse *= 10;
            reverse += digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
