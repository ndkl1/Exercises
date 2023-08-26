import javax.swing.*;

public class fiw {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frejm");
        f.setSize(300, 300);
        f.setLocation(100,100);

        JWindow w= new JWindow();
        w.setSize(300,300);
        w.setLocation(500,100);

        f.setVisible(true);
        w.setVisible(true);
    }
}
