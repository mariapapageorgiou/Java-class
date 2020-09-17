public class PerfectNumber {

    // What is the perfect number? A perfect number is a positive integer which is equal to the sum of its proper
    // positive divisors. Proper positive divisors are positive integers that fully divide the perfect number without
    // leaving a remainder and exclude the perfect number itself.
    // Write a method named isPerfectNumber with one parameter of type int named number.
    // If number is <1, the method should return false. The method must calculate if the number is perfect. If the
    // number is perfect, the method should return true; otherwise, it should return false.

    public static boolean isPerfectNumber(int number) {

        if(number>=1) {

            int num = 1;
            int sum = 0;

            while(num<number){

                if((number % num == 0)){
                    sum += num;
                }
                num++;
            }
            if(sum == number) {
                return true;
            }
        }
        return false;
    }
}
