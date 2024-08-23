import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("smile.jpeg");

    DragPanel(){

    }

    public  void paintComponent(){

    }

    private class ClickListener extends MouseAdapter {

    }

    private  class DragListener extends MouseMotionAdapter{

    }

}
