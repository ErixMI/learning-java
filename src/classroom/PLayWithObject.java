package classroom;

public class PLayWithObject {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.name);

        barsik.name = "Barsik";
        barsik.age = 1;
        barsik.color = "grey";
        System.out.println(barsik.name);

        Animal leo = new Animal();
        leo.name = "Leo";
        leo.age = 2;
        leo.color = "ginger";
        System.out.println(leo.name);
        System.out.println(barsik);
        System.out.println(leo);
        barsik.walk();
        leo.walk();
        barsik.eat();
        leo.eat();


    }
}
