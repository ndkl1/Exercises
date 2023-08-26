import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class nekiAplet extends JApplet {
    public void paint(@NotNull Graphics g)
    {
        g.drawString("Neki aplet", 20, 90);
    }

    public static void main(String[] args) {
        nekiAplet nk = new nekiAplet();
    }
}
