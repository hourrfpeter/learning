//MySuperClass.java
class MySuperClass{
    protected int value;
}
//TestMain.java
class MySubClass extends MySuperClass{
    public void print(){
        System.out.println(value);
    }
}
public class ts5{
    public static void main(String args[]){
        MySubClass msc = new MySubClass();
        msc.print();
        System.out.println(msc.value);
    }
}

