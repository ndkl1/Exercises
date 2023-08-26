import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class DugmeFrejm extends JFrame {
    JButton ukljuci = new JButton("Ukljuci");
    JButton sacuvaj = new JButton("Sacuvaj");
    JButton odjavi = new JButton("Odjavi");

    public DugmeFrejm(){
        setTitle("Dugme frejm");
        setSize(140,170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(ukljuci);
        panel.add(sacuvaj);
        panel.add(odjavi);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        DugmeFrejm df = new DugmeFrejm();
    }
}
