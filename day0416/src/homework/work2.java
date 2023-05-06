package homework;
import java.util.Scanner;
public class work2 {
    public static class Person{
        String name;
        int age;
    }
    public void printPerson(Person p){
        System.out.println("姓名："+p.name+" 年龄："+p.age);
    }
    public static void main(String[] args) {
        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        p.name = sc.next();
        System.out.println("请输入年龄：");
        p.age = sc.nextInt();
        work2 w = new work2();
        w.printPerson(p);
    }
}
