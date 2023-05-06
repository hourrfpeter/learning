package homework;
import java.util.Scanner;
public class work3 {
    public static class n{
        int n1;
        int n2;
    }
    public void add(n n1){
        int nm = n1.n1 + n1.n2;
        System.out.println(nm);
    }
    public void sub(n n1){
        int nm = n1.n1 - n1.n2;
        System.out.println(nm);
    }
    public void mul(n n1){
        int nm = n1.n1 * n1.n2;
        System.out.println(nm);
    }
    public void div(n n1){
        int nm = n1.n1 / n1.n2;
        System.out.println(nm);
    }

    public static void main(String[] args) {
        work3 w = new work3();
        n n1 = new n();
        System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);
        n1.n1 = sc.nextInt();
        n1.n2 = sc.nextInt();
        System.out.println("请选择运算符：");
        System.out.println("加法+，减法-，乘法*，除法/");
        switch (sc.next()){
            case "+":
                w.add(n1);
                break;
            case "-":
                w.sub(n1);
                break;
            case "*":
                w.mul(n1);
                break;
            case "/":
                w.div(n1);
                break;
            default:
                System.out.println("输入错误！");
        }
    }
}
