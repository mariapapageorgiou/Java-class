public class LargestPrime {

    // Write a method named getLargestPrime with one parameter of type int named number.
    // If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid
    // value. The method should calculate the largest prime factor of a given number and return it.
    // HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.

    public static int getLargestPrime(int number) {

        int largestPrime = -1;
        boolean isPrime = true;
        //checking if number is a factor
        for (int i =2; i <=number; i++) {
            if (number % i == 0) {
                //checking if number is prime
                for (int j=2; j < i; j++) {
                    if ( i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }
}
