import java.util.Scanner;

public class logical {
    public static void main(String[] args){
        int temp = 25;
        if (temp>35){
            System.out.println("it is not outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("it is warm outside");
        }
        else if(temp>=10 && temp<=20){
            System.out.println("it is cold outside");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("press q or Q to quit");
        String response = sc.next();
        if (response.equals("q") || response.equals("Q")){
            System.out.println("you quit");
        }
        else{
            System.out.println("you did not quit");
        }


        Scanner scn = new Scanner(System.in);
        System.out.println("press q or Q to quit");
        String responsen = scn.next();
        if (!responsen.equals("q") && !responsen.equals("Q")){
            System.out.println("you quit");
        }
        else{
            System.out.println("you did not quit");
        }
    }
}
