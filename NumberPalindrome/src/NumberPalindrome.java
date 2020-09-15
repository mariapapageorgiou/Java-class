public class NumberPalindrome {

    // Write a method called isPalindrome with one int parameter called number. The method needs to return a boolean.
    // It should return true if the number is a palindrome number otherwise it should return false.
    // TIPS
    // 1. A palindrome number is a number which when reversed is equal to the original number. eg 121, 12321, 1001
    // 2. Checking for a palindrome number: Find the reverse of the given number. Store it in a variable called reverse.
    //    Compare the number with reverse. If both are the same then the number is a palindrome otherwise it is not.
    // 3. Reversing a number:
    //    Declare and initialize the variable reverse to store the reverse of a number, reverse = 0.
    //    Extract the last digit of the given number by performing the modulo division.
    //    Store the last digit in a variable called lastDigit = number % 10.
    //    Increase the place value of reverse by one.
    //    To increase place value multiply the reverse variable by 10. eg reverse *= 10;.
    //    Add lastDigit to reverse. Since the last digit of the number is processed, remove the last digit of number.
    //    To remove the last digit divide number by 10.
    //    Repeat steps until number is not equal to (or greater than) zero.
    // 4. Be careful with negative numbers. They can also be palindrome numbers.
    // 5. You will need a parameter for comparing a reversed number with the starting number

}