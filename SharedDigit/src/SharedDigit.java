public class SharedDigit {

    // Write a method named hasSharedDigit with two parameters of type int.
    // Each number should be within the range of 10(inclusive) - 99(inclusive). If one of the numbers is not within the
    // range, the method should return false. The method should return true if there is a digit that appears in both
    // numbers, such as 2 in 12 and 23; otherwise, the method should return false.

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if((firstNumber>=10) && (firstNumber<=99) && (secondNumber>=10) && (secondNumber<=99)){

            int firstDigitFirstNum = firstNumber / 10;
            int lastDigitFirstNum = firstNumber % 10;
            int firstDigitSecondNum = secondNumber / 10;
            int lastDigitSecondNum = secondNumber % 10;

            if((firstDigitFirstNum==firstDigitSecondNum) || (firstDigitFirstNum == lastDigitSecondNum)
                    || (lastDigitFirstNum == firstDigitSecondNum) || (lastDigitFirstNum == lastDigitSecondNum)){
                return true;
            }
        }
        return false;
    }
}
