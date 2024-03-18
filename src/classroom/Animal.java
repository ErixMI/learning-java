package classroom;

public class Animal {


    public String name;
    public int age;
    public String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void walk() {
        System.out.println("I am walking right now ! ");
    }
    public void eat() {
        System.out.println("I can eat!");
    }
}
