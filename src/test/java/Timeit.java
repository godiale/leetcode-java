package leetcode;

import org.junit.Rule;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

public class Timeit {

    @Rule
    public final Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            System.out.println(description.getMethodName() +
                    " succeeded, time taken (milliseconds) " + nanos / 1000000.0);
        }
    };

}
