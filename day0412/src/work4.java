
public class work4 {
    public static void main(String[] args) {
        int[]force={72,89,65,58,87,91,53,82,71,93,76,68};
        for (int i = 0; i < force.length; i++) {
            int[] count = new int[0];
            if (force[i]>90){
               force[i]=count[4]++;
            }else if (force[i]>80){
                force[i]=count[3]++;
            }else if (force[i]>70){
                force[i]=count[2]++;
            }else if (force[i]>60){
                force[i]=count[1]++;
            }else {
                force[i]=count[0]++;
            }
        }
    }
}
