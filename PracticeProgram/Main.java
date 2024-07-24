import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int age = scanner.nextInt();
        String  adult=(age>=18) ? "eligible":"Not eligible";
        System.out.println(adult);
        System.out.println("My age is :"+ age);

    }
    }
