public class Method {
    public double findQuotientOfProductsOfEvenAndOdd(int number) {
        double result = 1;
        if ((number > 999 && number <= 9999) || (number < -999 && number >= -9999)) {
            int digit;
            number = Math.abs(number);
            while (number > 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    result /= digit;
                } else {
                    result *= digit;
                }
                number /= 10;
            }
        } else {

        }
        return result;
    }
}
