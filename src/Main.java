public class Main {
    /*
    Минимум и максимум в массиве
    */
    public static void main(String[] args) {

        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The maximum is " + result.x);
        System.out.println("The minimum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {

        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        int max = 0;
        int min = 0;

        for (int value : inputArray) {
            if (max > value) {
                max = value;
            }
            if (min < value) {
                min = value;
            }
        }


        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}