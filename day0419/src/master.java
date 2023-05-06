
public class master {
    public class cat extends pet{
        public void toeat(){
            System.out.println("猫吃"+new thing().fish);
        }
    }
    public class dog extends pet{
        public void toeat(){
            System.out.println("狗吃"+new thing().meat);
        }
    }
}
