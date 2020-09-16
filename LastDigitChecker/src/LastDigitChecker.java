public class LastDigitChecker {

    // Write a method named hasSameLastDigit with three parameters of type int.
    // Each number should be within the range of 10(inclusive) - 1000(inclusive). If one of the numbers is not within
    // the range, the method should return false. The method should return true if at least two of the numbers share
    // the same rightmost digit; otherwise, it should return false.

    // Write another method named isValid with one parameter of type int.
    // The method needs to return true if the number is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree) {

        if(isValid(numOne) && isValid(numTwo) && isValid(numThree)) {

            int lastNumOne = numOne % 10;
            int lastNumTwo = numTwo % 10;
            int lastNumThree = numThree % 10;

            if((lastNumOne==lastNumTwo) || (lastNumOne==lastNumThree) || (lastNumTwo==lastNumThree)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {

        if(number>=10 && number<=1000) {
            return true;
        }
        return false;
    }
}
