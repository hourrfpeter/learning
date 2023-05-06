package two;

public class test{
    public static void main(String[] args) {
        person.employee e = new person().new employee();
        e.setName("李四");
        e.setAge(21);
        e.setSex('女');
        e.setJob("经理");
        e.start();
        person.employee e1 = new person().new employee();
        e1.setName("李四");
        e1.setAge(21);
        e1.setSex('女');
        e1.setJob("经理");
        e1.start();
        person.employee [] employees = new person.employee[2];
        employees[0] = e;
        employees[1] = e1;
        person.employee e2 = new person().new employee();
        e2.equal(e,e1);
    }
}
