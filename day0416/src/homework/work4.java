package homework;
import java.util.Scanner;
public class work4 {
    public static class Worker{
        String name;
        int age;
        double salary;
        int time;
        public Worker(String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public Worker() {

        }
    }
    public void time(Worker w){
        if (w.age <30){
            w.time = 10;
        } else {
            w.time = 8;
        }
    }
    public void salary(Worker w){
        double salary = w.salary;
        if (w.age < 30){
            w.salary = salary * 1.5 ;
        } else if (w.age >= 30 && w.age < 40){
            w.salary = salary * 1.4;
        } else if (w.age >= 40 && w.age < 50){
            w.salary = salary * 1.3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工姓名：");
        String name = sc.next();
        System.out.println("请输入员工年龄：");
        int age = sc.nextInt();
        System.out.println("请输入员工基础工资：");
        double salary = sc.nextDouble();
        Worker w = new Worker(name, age, salary);
        work4 w4 = new work4();
        System.out.println("以下是你的工资信息：");
        System.out.println("员工姓名："+w.name);
        System.out.println("员工年龄："+w.age);
        System.out.println("员工基础工资："+w.salary);
        w4.time(w);
        System.out.println("员工工作时长："+w.time);
        w4.salary(w);
        System.out.println("员工实际工资："+w.salary);
    }
}
