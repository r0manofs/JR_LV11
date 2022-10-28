package Level12;

public class Task1215 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.getName() + " " + cat.getChild());
        System.out.println(dog.getName() + " " + dog.getChild());

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Cat's name";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }

    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Dog's name";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }

    }
}
