import java.util.Scanner;
public class Auto {
    int luntai;
    String color;
    double weight;
    double speed;

    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加多少速度：");
        double speed = sc.nextDouble();
        this.speed = speed + this.speed;
    }
    public void stop(){
        this.speed = 0;
    }
    public void down(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入减多少速度：");
        double speed = sc.nextDouble();
        this.speed = this.speed - speed;
    }
}