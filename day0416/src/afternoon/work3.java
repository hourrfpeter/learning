package afternoon;

public class work3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==j){
                    break;
                }
                System.out.print("i="+i+","+"j="+j+"\t");
            }
            System.out.println();
        }
    }
}
