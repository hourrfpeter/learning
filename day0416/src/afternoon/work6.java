package afternoon;

public class work6 {
    public int add(int... a){
        int sum = 0;
        for (int i : a) {
            sum +=i;
        }
        return sum;
    }
}
