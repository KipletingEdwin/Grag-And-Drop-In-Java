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

    }

    public  void paintComponent(){

    }

    private class ClickListener extends MouseAdapter {

    }

    private  class DragListener extends MouseMotionAdapter{

    }

}
