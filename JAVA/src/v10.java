import javax.swing.*;
import java.awt.*;

public class v10 extends JFrame {
    //zad 1
    /*
    JLabel m = new JLabel("Matematika:");
    JTextField m_1=new JTextField(5);
    JLabel oe = new JLabel("Osnovi ekonomije:");
    JTextField oe_1=new JTextField(5);
    JLabel s = new JLabel("Sociologija:");
    JTextField s_1=new JTextField(5);
    JLabel pr = new JLabel("Prosek:");
    JTextField pr_1=new JTextField(5);

    JButton racunaj= new JButton("Racunaj");
    JButton odustani = new JButton("Odustani");

    public v10(){
        setSize(250,300);
        setTitle("Prosek ocena");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        GridLayout gl= new GridLayout(5, 2);
        panel.setLayout(gl);

        panel.add(m);
        panel.add(m_1);
        panel.add(oe);
        panel.add(oe_1);
        panel.add(s);
        panel.add(s_1);
        panel.add(pr);
        panel.add(pr_1);
        panel.add(racunaj);
        panel.add(odustani);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        v10 frejm = new v10();
    }

     */
    //zad 2
    /*
    JLabel dk=new JLabel("Dobitna kombinacija:");
    JTextArea ta=new JTextArea(7,5);
    JButton zavrti = new JButton("Zavrti");

    public v10(){
        setSize(200,250);
        setTitle("Loto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int[] niz=new int[7];
        for (int i=0;i<7; i++) {
            niz[i] = 1 + (int) (Math.random() * 39);
            ta.append(niz[i]+"\n");
        }

        JPanel panel=new JPanel();
        BoxLayout bl= new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(bl);

        panel.add(dk);
        panel.add(ta);
        panel.add(zavrti);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        v10 frejm = new v10();
    }

     */
    //zad 3
    JTextField tf;
    JLabel pn;
    JButton nb=new JButton("Novi broj");

    public v10(){
        setTitle("Parnost");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int sb=1+(int)(Math.random()*100);
        tf=new JTextField(sb+"",10);

        if (sb%2==0){
            pn=new JLabel("Broj je paran.");
        }
        else {
            pn=new JLabel("Broj je neparan");
        }

        JPanel panel=new JPanel();
        BorderLayout bl=new BorderLayout();
        panel.setLayout(bl);

        JPanel panel1= new JPanel();
        FlowLayout fl=new FlowLayout();
        panel1.setLayout(fl);

        panel1.add(tf);
        panel1.add(pn);
        panel.add(BorderLayout.NORTH,panel1);
        panel.add(BorderLayout.CENTER, nb);
        add(panel);
        pack();

        setVisible(true);
        }

    public static void main(String[] args) {
        v10 vezbe = new v10();
    }
}
