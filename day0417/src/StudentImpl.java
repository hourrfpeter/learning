import java.util.Scanner;
public class StudentImpl extends Student {
    private class stu{
        String name;
        int age;
        String address;
        String zipCode;
        String mobile;
        private void get(){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的名字：");
            name = sc.next();
            System.out.println("请输入你的年龄：");
            age = sc.nextInt();
            System.out.println("请输入你的地址：");
            address = sc.next();
            System.out.println("请输入你的邮编：");
            zipCode = sc.next();
            System.out.println("请输入你的手机号：");
            mobile = sc.next();
        }
    }
}
