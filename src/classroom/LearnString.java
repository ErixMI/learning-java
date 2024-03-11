package classroom;

public class LearnString {
    public static void main(String[] args) {


        String name = "Erik";
        String lastName = "Milka";
        //  System.out.println(name + " "+ lastName );

        // Exercise: Print name and Surname ( Example: John Doe)

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        System.out.println(fullName + " " + lastName);


        System.out.println(String.format("%s %s", name, lastName));

        // Can save intoo variables
        String myFullName = String.format("%s %s", name, lastName);
        System.out.println(myFullName);

        // Hello, World
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        // Exercise
        // step 1 : declare a string with your name ;
        // Step  declare a string variable with yoour favourite programing language
        // step 4 concantate the two strings to dorm a massage My name iis name I loce coding
//step 4 print it out;

        String naaame = "My name is Erik";
        String java = " i love code with java";
        String iLoveCode = naaame.concat(java);
        System.out.println(iLoveCode);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());













    }
}
