import javax.swing.*;

public class labele_text extends javax.swing.JFrame {
    JTextField korisnicko_ime = new JTextField(15);
    JPasswordField lozinka = new JPasswordField(15);
    JTextArea komentar = new JTextArea(4,15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Cancel");

    public labele_text(){
        setTitle("Informacije o nalogu");
        setSize(300,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel korisnicko_imeLabel1 = new JLabel("Korisnicko ime: ");
        JLabel lozinkaLabel1 = new JLabel("Lozinnka: ");
        JLabel komentarLabel1 = new JLabel("Komentar: ");

        komentar.setLineWrap(true);
        komentar.setWrapStyleWord(true);

        panel.add(korisnicko_imeLabel1);
        panel.add(korisnicko_ime);

        panel.add(lozinkaLabel1);
        panel.add(lozinka);

        panel.add(komentarLabel1);
        panel.add(komentar);

        panel.add(ok);
        panel.add(cancel);

        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        labele_text pot = new labele_text();
    }
}
