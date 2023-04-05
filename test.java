import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("enter yor name");
        JOptionPane.showMessageDialog(null, "Hello"+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null, "you are "+height+" meters tall");


    }
}