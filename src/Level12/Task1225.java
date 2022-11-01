package Level12;

public class Task1225 {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Tiger) return "Tiger";         //дочерние в первую очередь
        if (o instanceof Bull) return "Bull";
        if (o instanceof Lion) return "Lion";
        if (o instanceof Cow) return "Cow";

        if (o instanceof Cat) return "Cat";         // базовые классы в последнюю очередь
        if (o instanceof Animal) return "Animal";

        return "Животное";
    }

    public static class Cat extends Animal
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
