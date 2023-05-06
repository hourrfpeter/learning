package one;

public class car {
    public String name;
    public String color;
    public car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public void start(){
        System.out.println(name+"汽车，"+"颜色为"+color);
    }
}
