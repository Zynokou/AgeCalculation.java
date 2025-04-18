import java.util.Scanner;

public class AgeCalculator{
    public static void main(String[] args) {
        
        //Variable declaration
        final int TODAY = 2025;
        Scanner sc = new Scanner(System.in);
        String name;
        int birth;

        //Declaration of results
        int age;

        // Variable entry
        System.out.println("What your name ?");
        name = sc.nextLine();
        System.out.println("What is your year of birth ?");
        birth = sc.nextInt();

        //Calculation of results
        age = TODAY - birth;

        //Display of results
        System.out.println("Hello " + name + ".");
        System.out.println("You are " + age + " years old this year");
    }
}