package Level12;

public class Task1205 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cow) {
            return "Cow";
        }
        if (o instanceof Dog) {
            return "Dog";
        }
        if (o instanceof Whale) {
            return "Whale";
        }

        return "Неизвестное животное";
    }

    public static class Cow {

    }

    public static class Dog {

    }

    public static class Whale {

    }

    public static class Pig {

    }
}
