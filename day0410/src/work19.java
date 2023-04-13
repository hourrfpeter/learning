public class work19 {
    public static void main(String[] args) {
        for (int a=1000;a<10000;a++){
            int b=a/1000;
            int c=a/100%10;
            int d=a/10%10;
            int e=a%10;
            if (((b*c)+(d*e))*((b*c)+(d*e))==a){
                System.out.println(a);
            }
        }
    }
}
