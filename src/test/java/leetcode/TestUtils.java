package leetcode;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestUtils {
    @SuppressWarnings("SameParameterValue")
    static Method getMethod(String klass, String method) throws Exception {
        Class<?> c = Class.forName(klass);
        return Arrays.stream(c.getDeclaredMethods())
                .filter(m -> m.getName().equals(method)).findAny().orElse(null);
    }
}
