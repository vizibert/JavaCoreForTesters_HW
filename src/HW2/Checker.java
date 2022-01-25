package HW2;

import java.util.zip.DataFormatException;

public class Checker {

    public static void checkArraySize(String[][] strings) throws MyArraySizeException {
        if (strings.length != 4 ||
                strings[0].length != 4 ||
                strings[1].length != 4 ||
                strings[2].length != 4 ||
                strings[3].length != 4) {
            throw new MyArraySizeException("Incorrect array size!");
        }
    }

    public static void sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] str = array[i];
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j].trim());
                } catch
                (NumberFormatException nfe) {
                    throw new MyArrayDataException("Incorrect data type in the cell: " + i + " " + j);
                }
            }
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}

