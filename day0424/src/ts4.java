public class ts4 {
    String num;
    public void getShape(int i){
        if (i == 0){
            this.num = yuan();
        } else if (i == 1) {
            this.num = ju();
        } else if (i == 2) {
            this.num = zh();
        } else {
            this.num = "无返回";
        }
    }
    public String yuan(){
        return "半径为1的圆形";
    }
    public String ju(){
        return "长为3宽为2的矩形";
    }
    public String zh(){
        return "边长为2的正方形";
    }
}
