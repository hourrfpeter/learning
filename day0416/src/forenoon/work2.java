package forenoon;

public class work2 {
    public static void main(String[] args) {
        work1 stu = new work1();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.address);
        work1 stu1 = new work1("张三", 18, "北京");
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.address);
        stu1.eat();
        stu1.sleep();
    }
}
