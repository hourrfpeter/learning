public class work17 {
    public static void main(String[] args) {
        int way = 1;
        int xiaoji = 0;
        for(int a = 0;a<33;a++){
            for(int b = 0;b<50;b++){
                xiaoji = 100-a-b;
                if (xiaoji%3==0 && 3*a+2*b+xiaoji/3==100){
                    System.out.println("第"+way+"种方案：");
                    way++;
                    System.out.println("公鸡"+a+"只，母鸡"+b+"只，小鸡"+xiaoji+"只");
                }
            }
        }
    }
}
