import java.awt.Toolkit;
import java.awt.Image;
import javax.swing.*;
class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH =500;
    private static final int DEFAULT_HEIGHT =400;
    SimpleFrame(){
        // setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        // setLocation(200,200);
        
        // frame.setLocation(200,200);
        // frame.setBounds(x,y,width,height);
       setBounds(500,200,DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setTitle("Rojina");
        setResizable(false);
        ImageIcon imgicon = new ImageIcon("C:/Users/chhet/OneDrive/Pictures/javaa.png");
        Image img  = imgicon.getImage();
        setIconImage(img);

    }
    
}