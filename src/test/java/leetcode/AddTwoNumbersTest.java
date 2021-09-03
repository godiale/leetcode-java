package leetcode;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(TimingExtension.class)
class AddTwoNumbersTest {

    private int listToInt(ListNode ln) {
        int ret = 0;
        int base = 1;

        while (ln != null) {
            ret += ln.val * base;
            ln = ln.next;
            long baseNew = (long)base * 10;
            if (baseNew > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Input list is not fitting into int");
            }
            base = (int)baseNew;
        }
        return ret;
    }

    private ListNode intToList(int v) {
        if (v < 0) {
            throw new IllegalArgumentException("Input should be non-negative: " + v);
        }

        ListNode head = null;
        ListNode tail = null;
        do {
            ListNode li = new ListNode(v % 10);
            v /= 10;
            if (head == null) {
                head = li;
                tail = li;
            } else {
                tail.next = li;
                tail = li;
            }
        } while (v != 0);

        return head;
    }

    @Test
    void testIntToListConversions() {
        assertEquals(1, listToInt(intToList(1)));
        assertEquals(342, listToInt(intToList(342)));
        assertEquals(1200, listToInt(intToList(1200)));
        assertThrows(IllegalArgumentException.class, () -> intToList(-1));

        ListNode head = null;
        for (int i = 0; i < 20; ++i) {
            ListNode li = new ListNode(1);
            if (head == null) {
                head = li;
            } else {
                li.next = head;
                head = li;
            }
        }
        final ListNode headConst = head;
        assertThrows(IllegalArgumentException.class, () -> listToInt(headConst));
    }

    @Test
    void testAddTwoNumbers() {
        AddTwoNumbers adder = new AddTwoNumbers();
        for (int i=0; i < 11000; ++i) {
            for (int j=0; j < 11000; ++j) {
                assertEquals(i+j, listToInt(adder.addTwoNumbers(intToList(i), intToList(j))));
            }
        }
    }

    @Test
    void testMany() throws Exception {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Method method = TestUtils.getMethod("leetcode.AddTwoNumbers", "addTwoNumbers");
        ListNode l1 = intToList(1234);
        ListNode l2 = intToList(5678);
        for (int i=0; i < 10000; ++i) {
            method.invoke(addTwoNumbers, l1, l2);
        }
    }
}