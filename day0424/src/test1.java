import java.util.Arrays;

public class test1 extends test{
}
class Super {
    public void m() {
      //foo();
    }

    static class Animal {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Dog extends Animal {
        public Dog(String name) {
            super();
        }

        public String getName() {
            return super.getName();
        }

        public void setName(String name) {
            super.setName(name);
        }
    }

    static class Cat extends Animal {
        public Cat(String name) {
            super();
        }

        public String getName() {
            return super.getName();
        }

        public void setName(String name) {
            super.setName(name);
        }
    }

    public static class TestAnimal {
        public static void main(String[] args) {
            Animal[] as = new Animal[]
                    {
                       new Dog("Pluto"),
                       new Cat("Tom"),
                       new Dog("Snoopy"),
                       new Cat("Garfield")
                    };
            Dog[] dogs = getAllDog(as);
            for (int i = 0; i <= dogs.length; i++) {
                System.out.println(dogs[i].getName());
            }
        }

        public static Dog[] getAllDog(Animal[] as) {
            Dog[] ds = new Dog[0];
            int index = 0;
            for (int i=0;i< as.length;i++)
            {
                if (as[i] instanceof Dog)
                {
                    ds= Arrays.copyOf(ds,ds.length+1);
                    ds[index]=(Dog)as[i];
                    index++;
                }
            }
            return ds;
        }
    }
}