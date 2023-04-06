public class stringmethods {
    public static void main(String[]args){
        String name = " bro ";
        boolean result = name.equalsIgnoreCase("bro");
        int result2 = name.length();
        char result3 = name.charAt(1);
        int result4 = name.indexOf("o");
        boolean result5 = name.isEmpty();
        String result6 = name.toUpperCase();
        String result7 = name.toLowerCase();
        String result8 = name.trim();
        String result9 = name.replace("bro", "brother");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
        System.out.println(name);
    }
}
