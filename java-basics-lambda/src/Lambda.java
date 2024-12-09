import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        BiFunction<Double, Double, Double> getMax = (a, b) -> Math.max(a,b);
        return getMax;
    }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        Function<Double, Double> getSqrt = Math::sqrt;
        return getSqrt;
    }
}