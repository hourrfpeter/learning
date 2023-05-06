package two;
public class person {
    String name;
    int age;
    char sex;
    public person(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public person() {
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }
    public void start(){
        System.out.println("name: "+name+"age: "+age+"sex: "+sex);
    }
    public class employee extends person{
        public employee(String name, int age, char sex, String job) {
            super(name, age, sex);
            this.job = job;
        }
        public employee() {
        }
        public void start() {
            System.out.println("name:"+name+" age:"+age+" sex:"+sex+" position:"+job);
        }
        employee [] employees;
        String job;
        public void setJob(String job) {
            this.job = job;
        }
        public String getJob() {
            return job;
        }
        public void equal(person.employee i,person.employee j){
            System.out.println("判断两位职员是否”相等”：");
            if(employees[0].equals(employees[1])){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}