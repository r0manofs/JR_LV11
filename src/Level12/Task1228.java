package Level12;

public class Task1228 {

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }

    public static interface Miner {
        public void workVeryHard();
    }

    public static class Human implements Worker, Businessman, Miner {

        @Override
        public void workLazy() {

        }

        @Override
        public void workHard() {

        }

        @Override
        public void workVeryHard() {

        }
    }
}
