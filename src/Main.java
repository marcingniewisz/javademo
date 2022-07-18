import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek  : ");
        int age = scanner.nextInt();


        System.out.println("Podaj imie : ");
        String name =  scanner.nextLine();
        if (age >= 18){
            System.out.println("jaesteś pełnoletni");
            System.out.println(name);
        }else{
            System.out.println("jaesteś niepełnoletni");
            System.out.println(name);
        }

        if (age <= 100 ){
            System.out.println("jaesteś zombie");
        }

        System.out.println(age*2);
        System.out.println(age/2);
        System.out.println(age+2);
        System.out.println(age-2);
        System.out.println(age%2);
        System.out.println();


    }
}
