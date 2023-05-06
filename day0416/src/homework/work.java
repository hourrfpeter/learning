package homework;
import java.util.Scanner;
public class work {
    public static class ths{
        double speed;
        double size;
    }

    public void move(ths t){
        System.out.println("请输入移动的距离：");
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double time = distance/t.speed;
        System.out.println("移动了"+distance+"米，用时"+time+"秒");
    }

    public void setSpeed(ths t){
        System.out.println("请输入速度：");
        Scanner sc = new Scanner(System.in);
        t.speed = sc.nextDouble();
        System.out.println("速度设置成功");
    }

    public void addSpeed(ths t){
        System.out.println("请输入增加的速度：");
        Scanner sc = new Scanner(System.in);
        double add = sc.nextDouble();
        t.speed += add;
        System.out.println("加速成功");
    }

    public void reduceSpeed(ths t){
        System.out.println("请输入减少的速度：");
        Scanner sc = new Scanner(System.in);
        double reduce = sc.nextDouble();
        t.speed -= reduce;
        System.out.println("减速成功");
    }

    public void getSpeed(ths t){
        System.out.println("当前速度为："+t.speed);
    }

    public void getSize(ths t){
        System.out.println("当前体积为："+t.size);
    }

    public void setSize(ths t){
        System.out.println("请输入体积：");
        Scanner sc = new Scanner(System.in);
        t.size = sc.nextDouble();
        System.out.println("体积设置成功");
    }

    public static void main(String[] args) {
        System.out.println("请输入一个交通工具的速度和尺寸：");
        Scanner sc = new Scanner(System.in);
        ths t = new ths();
        t.speed = sc.nextDouble();
        t.size = sc.nextDouble();
        work w = new work();
        while (true)
        {
        System.out.println("请输入你的选择：");
        System.out.println("移动、设置速度、加速、减速、查看速度、查看体积、设置体积、退出");
        String s = sc.next();
        switch (s) {
            case "移动":
                w.move(t);
                break;
            case "设置速度":
                w.setSpeed(t);
                break;
            case "加速":
                w.addSpeed(t);
                break;
            case "减速":
                w.reduceSpeed(t);
                break;
            case "查看速度":
                w.getSpeed(t);
                break;
            case "查看体积":
                w.getSize(t);
                break;
            case "设置体积":
                w.setSize(t);
                break;
            case "退出":
                System.out.println("程序退出");
                System.exit(0);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        }
    }
}
