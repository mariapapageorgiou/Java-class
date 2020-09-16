public class GreatestCommonDivisor {

    // Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    // If one of the parameters is <10, the method should return -1 to indicate an invalid value. The method should
    // return the greatest common divisor of the two numbers (int). The greatest common divisor is the largest positive
    // integer that can fully divide each of the integers (i.e. without leaving a remainder).
    // TIPS
    // 1. Use a while or a for loop and check if both numbers can be divided without a remainder.
    // 2. Find the minimum of the two numbers.

    public static int getGreatestCommonDivisor(int first, int second) {

        if((first>=10) && (second>=10)) {

            int possibleFactor = Math.min(first,second);

            while(possibleFactor>0){

                if((first % possibleFactor == 0) && (second % possibleFactor == 0)){
                    return possibleFactor;
                }
                possibleFactor--;
            }
        }
        return -1;
    }

}
