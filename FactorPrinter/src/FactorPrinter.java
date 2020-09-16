public class FactorPrinter {

    // Write a method named printFactors with one parameter of type int named number.
    // If number is <1, the method should print "Invalid Value".
    // The method should print all factors of the number. A factor of a number is an integer which divides that number
    // wholly (i.e. without leaving a remainder).
    // NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space
    // For example, the printout for printFactors(10); can be:
    // 1
    // 2
    // 5
    // 10

    public static void printFactors(int number){

        if(number>=1){

            int factor = 0;
            int num = 1;

            while(num<=number){
                factor = number % num;
                if(factor==0){
                    System.out.println(num);
                }
                num++;
            }

        } else {
            System.out.println("Invalid Value");
        }

    }
}
