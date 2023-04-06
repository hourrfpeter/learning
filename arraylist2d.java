import java.util.*;

public class arraylist2d {
    public static void main(String[]args){
        ArrayList<ArrayList<String>>d = new ArrayList<ArrayList<String>>();
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        b.add("pasta");
        b.add("pizza");
        b.add("burger");
        ArrayList<String> c = new ArrayList<String>();
        c.add("chicken");
        c.add("coffee");
        c.add("tea");
        a.add(String.valueOf(b));
        a.add(String.valueOf(c));
        d.add(c);
        d.add(b);
        System.out.println(a.get(0));
        System.out.println(a);
        System.out.println(d);
        System.out.println(d.get(0).get(1));
    }
}