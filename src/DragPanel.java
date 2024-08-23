import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("smile.jpeg");
    final  int WIDTH = image.getIconWidth();
    final  int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public  void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this,g,imageCorner.getX(),imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter {

    }

    private  class DragListener extends MouseMotionAdapter{

    }

}
