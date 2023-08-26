import javax.swing.*;

public class v9 extends JFrame {
    //zad 1
    /*
    JTextField m= new JTextField(5);
    JTextField oe=new JTextField(5);
    JTextField s=new JTextField(5);
    JButton ok= new JButton("OK");
    JButton cancel=new JButton("Cancel");

    public v9(){
        setSize(250,300);
        setTitle("Predmeti");
        JLabel m_1=new JLabel("Matematika:");
        JLabel oe_1=new JLabel("Osnovi ekonomije: ");
        JLabel s_1=new JLabel("Sociologija");
        JLabel npi= new JLabel("Nada Kolakovic 190878");

        JPanel panel = new JPanel();
        panel.add(m_1);
        panel.add(m);
        panel.add(oe_1);
        panel.add(oe);
        panel.add(s_1);
        panel.add(s);
        panel.add(npi);
        panel.add(ok);
        panel.add(cancel);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        v9 frejm=new v9();
    }

     */
    //zad 2
    /*
    JList lista;
    JLabel podnaslov = new JLabel("Lista prvih 20 brojeva:");
    JScrollPane skroler;
    JButton ok=new JButton("OK");

    public v9(){
        setSize(350,300);
        setTitle("Fobonjacijevi brojevi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int[] niz =new int[20];
        String[] nizs=new String[20];

        int i;
        niz[0]=niz[1]=1;
        nizs[0]=nizs[1]=Integer.toString(1);

        for (i=2; i<20; i++){
            niz[i]=niz[i-1]+niz[i-2];
            nizs[i]=Integer.toString(niz[i]);
        }

        lista = new JList(nizs);
        lista.setVisibleRowCount(10);
        skroler = new JScrollPane(lista);

        JPanel panel = new JPanel();
        panel.add(podnaslov);
        panel.add(lista);
        panel.add(skroler);
        panel.add(ok);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        v9 vezbe = new v9();
    }

     */
    //zad 3
    /*
    JLabel dk= new JLabel("Dobitna kombinacija");
    JTextArea ta= new JTextArea(7,5);
    JButton zavrti= new JButton("Zavrti");

    public v9() {
        setSize(350, 300);
        setTitle("Loto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        int i;
        int[] niz= new int[7];
        for (i = 0; i < 7; i++) {
            niz[i] = 1 + (int) (Math.random() * 39);
            ta.append(niz[i]+"\n");
        }

        JPanel panel = new JPanel();

        panel.add(dk);
        panel.add(ta);
        panel.add(zavrti);
        add(panel);

        setVisible(true);
        }

    public static void main(String[] args) {
        v9 frejm = new v9();
    }

     */
    //zad 4
    JTextField tekst;
    JLabel pn;
    JButton nb= new JButton("Novi broj");

    public v9(){
        setSize(350, 200);
        setTitle("Parnost");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int br=1+(int)(Math.random()*100);
        tekst= new JTextField(br+"", 10);

        if (br%2==0){
            pn=new JLabel("Broj je paran");
        }
        else {
            pn=new JLabel("Broj je neparan");
        }

        JPanel panel = new JPanel();
        panel.add(tekst);
        panel.add(pn);
        panel.add(nb);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        v9 frejm = new v9();
    }
}
