public class ts3 {
}
class Shape{
    double x;
    double y;
    double area;
    double girth;

    public void setX(double x) {
        System.out.println("请输入圆的半径，正方形边长或长方形的长：");
        this.x = x;
    }

    public double getX() {
        return x;
    }
    public double area(){
        this.area = (x+y)*2;
        return area;
    }
    public double girth(){
        this.girth = x*y;
        return girth;
    }
    static class Circle extends Shape{
        @Override
        public double area() {
            super.area = 2*x*3.1415926;
            return super.area;
        }

        @Override
        public double girth() {
            super.girth = x*x*3.1415926;
            return super.girth;
        }
    }
    static class Rect extends Shape{
        @Override
        public double area() {
            return super.area();
        }
        @Override
        public double girth() {
            return super.girth();
        }
        static class Square extends Rect{
            @Override
            public double area() {
                super.area = x*4;
                return super.area;
            }

            @Override
            public double girth() {
                super.girth = x*x;
                return super.girth;
            }
        }
    }
}
