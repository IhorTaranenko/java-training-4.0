public class Temperature {

    /**
     * Converts temperature from Fahrenheit to Celsius degree.
     *
     * @param fahrenheit temperature degree in Fahrenheit
     * @return temperature degree in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double c = (5*(fahrenheit - 32))/9;// TODO fill in code here and replace the return statement
        return c;
    }

    /**
     * Converts temperature from Celsius to Fahrenheit degree.
     *
     * @param celsius temperature degree in Celsius
     * @return temperature degree in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        double f = (celsius * 9/5) + 32;// TODO fill in code here and replace the return statement
        return f;
    }
}