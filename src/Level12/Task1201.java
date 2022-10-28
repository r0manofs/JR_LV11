package Level12;

/*1201 and 1202*/

public class Task1201 {

    public static void main(String[] args) {

        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {       //переопределяем метод
            return " ";
        }
    }
}

