package four;
import java.util.Scanner;
public class master extends pet{
    String s1;
    String s2;
    public void toeat() {
        dog d = new dog();
        cat c = new cat();
        d.fd1 = s1;
        c.fd2 = s2;
        d.eat();
        c.eat();
    }

    public static void main(String[] args) {
        master m = new master();
        System.out.println("dog eat bone, cat eat fish\nwhat is you choose?");
        Scanner sc = new Scanner(System.in);
        System.out.println("dog eat:");
        String s1 = sc.nextLine();
        m.s1 = s1;
        System.out.println("cat eat:");
        String s2 = sc.nextLine();
        m.s2 = s2;
        m.toeat();
    }
}
