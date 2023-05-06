package homework;
import java.util.Objects;
import java.util.Scanner;
public class work1 {
    public static class people{
        String id;
        String password;
        String email;
    }

    public void emailfix(people em){
        em.email = em.id+"@gameschool.com";
    }

    public static void main(String[] args) {
        work1 w = new work1();
        people p = new people();
        System.out.println("欢迎使用用户注册系统");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户ID：");
        String id = sc.next();
        System.out.println("请输入用户密码：");
        String pw = sc.next();
        System.out.println("请输入用户邮箱：（如没有可忽略）");
        String em = sc.next();
        if (em.equals("")){
            w.emailfix(p);
        }else {
            em = id+"@gameschool.com";
        }
        p.id = id;
        p.password = pw;
        p.email = em;
        System.out.println("用户注册成功！以下是你的用户信息：");
        System.out.println("用户ID："+p.id);
        System.out.println("用户密码："+p.password);
        System.out.println("用户邮箱："+p.email);
    }
}
