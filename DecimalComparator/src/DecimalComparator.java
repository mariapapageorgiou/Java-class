public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        double actualFirst = (int)(firstNumber*1000)/1000d;
        double actualSecond = (int)(secondNumber*1000)/1000d;

        if(actualFirst == actualSecond) {
            return true;
        }
        return false;
    }
}
