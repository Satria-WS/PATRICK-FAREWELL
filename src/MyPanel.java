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
//    Changing velocity more, sure will be changed direction
    //Change xVelocity as you like 1 or 2
    //xVelocity = 10 and yVelocity = 21; Excellent!!
    int xVelocity = 21;//How many pixels this image is moving on the x-axix
    int yVelocity = 10;
    int x = 0;
    int y = 0;

    MyPanel() {
//    set preferred size and we pass in a new dimension
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        ball = new ImageIcon("ball.png").getImage();
        backgroundImage = new ImageIcon("space.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }
//    Graphics g is a method inherited from JComponent
    public void paint(Graphics g) {

        super.paint(g);//paint background
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage,0,0,null);
        g2D.drawImage(ball,x,y,null);
//

    }

//    to add any unimplemented methods and we have an action performed method
    @Override
    public void actionPerformed(ActionEvent e) {
        //move coordinates

        if (x >= PANEL_WIDTH-ball.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if(y>= PANEL_HEIGHT-ball.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y=y + yVelocity;

        repaint();//redraw all of the graphic now
    }
}
