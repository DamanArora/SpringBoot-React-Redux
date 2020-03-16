package functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //int i = increment(5);
        int i = incrementByOneFunction.apply(5);
        Function<Integer, Integer> mul = incrementByOneFunction.andThen(multiplyNumBy10);
        int multi = mul.apply(5);
        System.out.println(i+" -> "+ multi);

        int incMult = incrementByOneAndMulti.apply(3, 4);
        System.out.println(incMult);
    }

    //BiFunction takes two argument and return
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMulti = (numberToInc, numberToMulti) -> (numberToInc + 1) * numberToMulti;

    //same task using normal function
    static int incrementAndMultiply(int i, int j){
        return (i + 1) * j;
    }

    static Function<Integer, Integer> multiplyNumBy10 = number -> number * 10;

    //Function + lmbda approach
    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    //orignal function
    static int increment(int number){
        return number+1;
    }
}
