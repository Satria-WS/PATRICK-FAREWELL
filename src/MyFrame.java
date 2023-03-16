import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
//    instance of my panel
    MyPanel panel;

//    MyFrame as constructor
    MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
