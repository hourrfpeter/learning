import java.util.Scanner;

public class ifclass {
    public static void main(String[] args){
        int age = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        age = input.nextInt();
        if(age>=75){
            System.out.println("you are old");
        }
        else if(age>=18){
            System.out.println("you are an adult");
        }
        else if(age>=13){
            System.out.println("you are a teenager");
        }
        else{
            System.out.println("you are not an adult");
        }
    }
}
