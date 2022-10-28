package Level12;

/*1216,1217*/

public class Task1216 {

    public static void main(String[] args) {

    }
    public interface CanFly{

        boolean canFly();       // может ли летать
        void fly();             // полет
        void landing();         //приземление

    }
    public interface CanRun{

        boolean canRun();
        void run();

    }
    public interface CanSwim{

        boolean canSwim();
        void swim();

    }
}
