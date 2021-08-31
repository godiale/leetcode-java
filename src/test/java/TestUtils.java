package leetcode;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestUtils {

    static Method getMethod(String klass, String method) throws Exception {
        Class<?> c = Class.forName(klass);
        return Arrays.asList(c.getDeclaredMethods())
                .stream().filter(m -> m.getName().equals(method)).findAny().orElse(null);
    }

}
