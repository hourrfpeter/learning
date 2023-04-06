public class arrays {
    public static void main (String[] args){
        String[] cars = {"aaa", "bbb", "ccc", "ddd", "eee"};
        //System.out.println(cars[0]);

        String[] cars2 = new String[5];
        cars2[0] = "aaa";
        cars2[1] = "bbb";
        cars2[2] = "ccc";
        cars2[3] = "ddd";
        cars2[4] = "eee";
        //System.out.println(cars2[0]);

        for(int i = 0; i < cars2.length; i++){
            System.out.println(cars2[i]);
        }
    }
}
