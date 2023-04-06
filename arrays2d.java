public class arrays2d {
    public static void main(String[] args){
        String[][] cars = new String[3][3];
        cars[0][0] = "BMW";
        cars[0][1] = "Mercedes";
        cars[0][2] = "Audi";
        cars[1][0] = "Ford";
        cars[1][1] = "Chevrolet";
        cars[1][2] = "Dodge";
        cars[2][0] = "Toyota";
        cars[2][1] = "Honda";
        cars[2][2] = "Nissan";
        for(int i =0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
