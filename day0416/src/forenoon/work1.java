package forenoon;

import java.util.Scanner;

public class work1 {
    String name;
    int age;
    String address;
    void eat(){
        System.out.println("吃饭");
    }
    void sleep(){
        System.out.println("睡觉");
    }
    void work(){
        System.out.println("工作");
    }
    public work1(){
    }
    public work1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
