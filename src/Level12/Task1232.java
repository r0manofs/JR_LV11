package Level12;

public class Task1232 {

    public static void main(String[] args) {
        Pegasus horse = new Pegasus();
    }

    public static interface CanFly {
        public void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Task1231.Horse implements Task1231.CanFly {
        @Override
        public void fly() {

        }
    }
}
