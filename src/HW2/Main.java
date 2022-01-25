package HW2;

import static HW2.Checker.*;
import static java.util.Arrays.deepToString;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = createArray();
//        array[2][3] = "D";
        System.out.println(deepToString(array));
        checkArraySize(array);
        sumArray(array);
    }

    public static String[][] createArray() {
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
//        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        return array;
    }
}