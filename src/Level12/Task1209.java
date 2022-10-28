package Level12;

/*1209(min) & 1210(max)*/

public class Task1209 {

    public static void main(String[] args) {

        int answerInt = min(14, 15);
        long answerLong = min(-90000000, 90000000);
        double answerDouble = min(-1.0000000011, -1.000099);

        System.out.println(answerInt + "\n" + answerLong + "\n" + answerDouble);
    }

    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static long min(long x, long y) {
        return x < y ? x : y;
    }

    public static double min(double x, double y) {
        return x < y ? x : y;
    }
}
