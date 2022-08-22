import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {

    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        //  replace null with lambda expression

//      return (Double a, Double b) -> Math.max(a, b);
        return (a, b) -> Math.max(a, b);
    }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        //  replace null with method reference
//      return (Double d) -> Math.sqrt(d);
//      return (d) -> Math.sqrt(d);
        return d -> Math.sqrt(d);
    }
}