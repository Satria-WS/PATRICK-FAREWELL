import java.awt.*;
import java.awt.event.*;
import javax.swing.*; //for component JPanel

//JPanel is a subclass of the component class;
public class MyPanel extends JPanel implements ActionListener {

//    final means a value can't be changed
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image ball;//ball or enemy
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;//How many pixels this image is moving on the x-axix
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
//    set preferred size and we pass in a new dimension
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        ball = new ImageIcon("ball.png").getImage();
        timer = new Timer(1000, null);
    }
//    Graphics g is a method inherited from JComponent
    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(ball,x,y,null);

    }

//    to add any unimplemented methods and we have an action performed method
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
