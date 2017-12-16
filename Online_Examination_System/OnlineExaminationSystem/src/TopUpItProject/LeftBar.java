package TopUpItProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author sakib
 */
public class LeftBar extends JFrame {
    BufferedImage buttonIcon,buttonIcon2,buttonIcon3;
    JLabel home,questions,createNew;
    JButton button,button2,button3;

    public LeftBar() throws HeadlessException, IOException, URISyntaxException {
        
        //Icon Resources
        //buttonIcon = ImageIO.read(new File("C:\\Users\\sakib\\Desktop\\home.png"));
        buttonIcon = ImageIO.read(this.getClass().getResource("/home.png"));
        
        buttonIcon2=ImageIO.read(this.getClass().getResource("/question.png"));
        //buttonIcon3=ImageIO.read(new File("C:\\Users\\sakib\\Desktop\\createnew.png"));
        
        home=new JLabel("Home");
        homeBtnProperties();    
        
        questions=new JLabel("Questions");
        questionBtnProperties();
        
        
       

    }

    private void homeBtnProperties() {
        
        //Home Label
        home.setFont(new Font("Segoe UI Light",Font.BOLD,12));
        home.setForeground(Color.WHITE);
        home.setBounds(30, 40, 100, 100);
       // home.setBorder(BorderFactory.createLineBorder(Color.black));
        
        //Home Button
        button = new JButton(new ImageIcon(buttonIcon));
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setBounds(10, 15, 80, 80);
     //   button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }

    private void questionBtnProperties() {
        
        //Question Label
        questions.setFont(new Font("Segoe UI Light",Font.BOLD,12));
        questions.setForeground(Color.WHITE);
        questions.setBounds(20, 40, 100, 100);
        //Question Button
        button2 = new JButton(new ImageIcon(buttonIcon2));
        button2.setBorderPainted(false);
        button2.setFocusPainted(false);
        button2.setContentAreaFilled(false);
        button2.setBounds(10, 15, 80, 80);
    }

    

    

    
    
    
}
