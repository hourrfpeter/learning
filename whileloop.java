import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("enter your name");
            name = sc.nextLine();
        } while (name.isBlank());

        System.out.println("hello"+name);
        }
    }

