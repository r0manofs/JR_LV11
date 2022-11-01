package Level12;

/*Поиск минимального числа в массиве и его индекса*/

import java.util.Arrays;

public class Task1233 {

    public static void main(String[] args) throws Exception {

        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int min = 0;
        int indexOfMin=0;

        for (int index = 0; index < array.length; index++) {
            if (array[index]<min){

                min=array[index];
                indexOfMin=index;
            }
        }

        return new Pair<Integer, Integer>(min, indexOfMin);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
