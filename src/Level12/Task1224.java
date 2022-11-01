package Level12;

public class Task1224 {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if(o instanceof Cat){
            return "Cat";
        }
        if(o instanceof Tiger){
            return "Tiger";
        }
        if(o instanceof Lion){
            return "Lion";
        }
        if(o instanceof Bull){
            return "Bull";
        }
        if(o instanceof Pig){
            return "Pig";
        }

        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
