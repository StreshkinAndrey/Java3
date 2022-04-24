package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

class App {
    static <T> void swap(T[] array, int firstIndex, int secondIndex) { // Task 1
        T oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

    static <T> ArrayList<T> convertToList(T[] array) { // Task 2
        return new ArrayList<>(Arrays.asList(array));
    }
}
