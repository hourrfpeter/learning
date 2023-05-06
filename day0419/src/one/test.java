package one;

public class test {
    public static void main(String[] args) {
        //汽车工厂随机生产汽车
        int num = (int)Math.round(Math.random()*2);
        System.out.println(num);
        if (num == 0) {
            car bmw = new paizi().new bmw("宝马", "黑色");
            bmw.start();
        }else if (num == 1) {
            car benz = new paizi().new benz("奔驰", "白色");
            benz.start();
        }else {
            car bsj = new paizi().new bsj("保时捷", "红色");
            bsj.start();
        }
    }
}
