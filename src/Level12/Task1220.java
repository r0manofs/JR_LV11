package Level12;

public class Task1220 {
    public static void main(String[] args) {

    }

    public static abstract class Human implements CanRun, CanSwim {

    }

    public interface CanRun {

        boolean canRun();

        void run();

    }

    public interface CanSwim {

        boolean canSwim();

        void swim();

    }
}
