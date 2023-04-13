public class work18 {
    public static void main(String[] args) {
        for (int a=0;a<9;a++){
            for (int b=0;b<12;b++){
                int child =36-a-b;
                if(a*4+b*3+child/2==36)
                    System.out.println("男"+a+"人，女"+b+"人，小孩"+child+"人");
            }
        }
    }
}
