import java.util.Scanner;

public class mathclass {
    public static void main(String[] args){
        double x;
        double y;
        double z;
        Scanner input = new Scanner(System.in);
        System.out.println("enter side x");
        x = input.nextDouble();
        System.out.println("enter side y");
        y = input.nextDouble();
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotenuse is "+z);
    }
}
