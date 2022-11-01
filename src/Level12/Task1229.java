package Level12;

public class Task1229 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }
    public static class Worker{
        public static void work() {

        }
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO implements Businessman {

        @Override
        public void workHard() {

        }
    }
}
