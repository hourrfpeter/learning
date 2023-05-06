package four;

import java.util.Objects;

public class pet extends food{
    public class dog{
        String fd1;
        public void eat() {
            food d = new food();
            if (Objects.equals(fd1, d.i)) {
                System.out.println("Dog eat");
            } else {
                System.out.println("Dog not eat");
            }
        }
    }
    public class cat{
        String fd2;
        public void eat() {
            food d = new food();
            if (Objects.equals(fd2, d.j)) {
                System.out.println("Cat eat");
            } else {
                System.out.println("Cat not eat");
            }
        }
    }
}
