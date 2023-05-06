package one;

public class paizi {
    public class bmw extends car{
        public bmw(String name, String color) {
            super(name, color);
        }
        public void start(){
            System.out.println("生产了一辆"+name+"汽车，颜色为"+color);
        }
    }
    public class benz extends car{
        public benz(String name, String color) {
            super(name, color);
        }
        public void start(){
            System.out.println("生产了一辆"+name+"汽车，颜色为"+color);
        }
    }
    public class bsj extends car{
        public bsj(String name, String color) {
            super(name, color);
        }
        public void start(){
            System.out.println("生产了一辆"+name+"汽车，颜色为"+color);
        }
    }
}
