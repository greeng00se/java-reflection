package question.q4;

import java.lang.reflect.Array;

public class ArrayReader {

    public Object getArrayElement(Object array, int index) {
        /**
         * Complete your code here
         */
        int length = Array.getLength(array);

        if (index < 0) {
            return Array.get(array, length + index);
        }
        return Array.get(array, index);
    }
}
