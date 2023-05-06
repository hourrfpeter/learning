package three;

public class jingli extends yuangong{
    double bonus;
    public jingli() {
    }
    public jingli(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    public void w2() {
        System.out.println(id+ " " + name + " " + salary + " " + bonus);
    }
}
