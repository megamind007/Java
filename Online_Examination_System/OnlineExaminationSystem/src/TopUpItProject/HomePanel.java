package TopUpItProject;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author sakib
 */
public class HomePanel extends JFrame implements ActionListener{
    JFrame frame;
    JPanel leftBarPanel,topPanel,bottomPanel,topPanelInside,container, homePanel,questionPanel,createNewPAnel;
    JButton button,button2,button3;
    //JScrollPane js;
    public HomePanel() throws HeadlessException, IOException, URISyntaxException {
        
        
        
        frame=new JFrame();
        frame.setTitle("Quick Quiz");
        frame.setFont(new Font("Segoe UI Light",Font.BOLD,12));
        frame.setForeground(Color.decode("#16a085"));
        frame.setSize(850, 650);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.decode("#16a085"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        //Main Container of Top And Bottom Panels
        container=new JPanel();
        container.setBounds(100, 0, 750, 650);
        container.setLayout(null);
               
        //Top Panel
        topPanel=new JPanel();
        topPanel.setBounds(0, 0, 750, 325);
        topPanel.setBackground(Color.WHITE);
        topPanel.setLayout(null);
        //frame.add(topPanel);
        
        //Top Panel Inside
        topPanelInside=new JPanel();
        topPanelInside.setBounds(100, 60, 550, 205);
        topPanelInside.setLayout(null);
        topPanelInside.setBackground(Color.decode("#ecf0f1"));
        topPanel.add(topPanelInside);
        topPanelInsideProperties(topPanelInside);
        
        //LeftBar Panel
        leftBarPanel=new JPanel();
        leftBarPanel.setBounds(0,0, 100, 650);
        leftBarPanel.setLayout(null);
        leftBarPanel.setBackground(Color.decode("#16a085"));
        frame.add(leftBarPanel);
        
        
        
        //Bottom panel
        bottomPanel=new JPanel();
        bottomPanel.setBounds(0,325, 750, 325);
        bottomPanel.setBackground(Color.decode("#1abc9c"));
        bottomPanel.setLayout(null);
        //frame.add(bottomPanel);
        bottomPanelProperties(bottomPanel);
        
        
        
        
        container.add(topPanel);
        container.add(bottomPanel);
        container.setBackground(Color.WHITE);
        
       
        
        frame.add(container);
        frame.repaint();
        leftBerComponents();
        
    }
    
   
    
    
    

    
    public static void main(String[] args) throws HeadlessException, IOException, URISyntaxException {
        new HomePanel();
       
    }

    

    private void leftBerComponents() throws HeadlessException, IOException , URISyntaxException{
        LeftBar l=new LeftBar();
        
        
        //Custom HomePanel for HomeMenu
        homePanel=new JPanel();
        homePanel.setBounds(0, 0, 100, 125);
        homePanel.setLayout(null);
        homePanel.add(l.button);
        homePanel.add(l.home);
        homePanel.setBackground(Color.decode("#16a085"));
        homePanel.setBorder(BorderFactory.createMatteBorder(
                                    5, 0, 5, 0, Color.decode("#1abc9c")));
        homePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        l.button.addActionListener( this);
        //homePanel.action(Eve, this);

        leftBarPanel.add(homePanel);
        
        //Custom QuestionPanel for QuestionManu
        questionPanel=new JPanel();
        questionPanel.setBounds(0, 125, 100, 125);
        questionPanel.setLayout(null);
        questionPanel.add(l.button2);
        questionPanel.add(l.questions);
        questionPanel.setBackground(Color.decode("#16a085"));
        questionPanel.setBorder(BorderFactory.createMatteBorder(
                                    0, 0, 5, 0, Color.decode("#1abc9c")));
        questionPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //questionPanel.repaint();
        l.button2.addActionListener(this);
        leftBarPanel.add(questionPanel);
        
        
        button=l.button;
        button2=l.button2;
        
        
        leftBarPanel.repaint();
    }

    private void topPanelInsideProperties(JPanel x) {
        JLabel welcome=new JLabel("Quick Quiz!");
        welcome.setBounds(150, 20, 250, 50);
        welcome.setFont(new Font("Lucida Bright",Font.BOLD,36));
        welcome.setForeground(Color.decode("#16a085"));
        x.add(welcome);
        
        JLabel tagLine=new JLabel("Test You Learning...");
        tagLine.setBounds(240, 45, 250, 50);
        tagLine.setFont(new Font("Segoe UI Light",Font.PLAIN,18));
        tagLine.setForeground(Color.decode("#2c3e50"));
        x.add(tagLine);
        
        JLabel topUpItLabel=new JLabel("A TopUpIT Project!");
        topUpItLabel.setBounds(160, 100, 250, 50);
        topUpItLabel.setFont(new Font("Lucida Bright",Font.PLAIN,22));
        topUpItLabel.setForeground(Color.decode("#2c3e50"));
        x.add(topUpItLabel);
    }

    private void bottomPanelProperties(JPanel x) throws IOException {
        
        BufferedImage buttonIcon;
        buttonIcon = ImageIO.read(this.getClass().getResource("/start.png"));
                
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(225  , 150   , 280, 50);
        panel.setBackground(Color.decode("#16a085"));
        
        JLabel icon=new JLabel(new ImageIcon(buttonIcon));
        icon.setBounds(200, 0, 50, 50);
        
        JLabel label=new JLabel("It's Quiz time!");
        label.setBounds(260, 50, 200, 100);
        label.setFont(new Font("Lucida Bright",Font.BOLD,26));
        label.setForeground(Color.WHITE);
        x.add(label);
        JLabel btnLabel=new JLabel("Let's Start!");
        btnLabel.setFont(new Font("Lucida Bright",Font.BOLD,24));
        
        btnLabel.setForeground(Color.WHITE);
        btnLabel.setBounds(70, 15, 150, 20);
        
        panel.add(btnLabel);
        panel.add(icon);
        panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.addMouseListener(new MouseAdapter() {
                //private Color background;

                @Override
                public void mousePressed(MouseEvent e) {
                   panel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                   String str;
                   
                   int range = (1 - 0) + 1; 
                   int x=(int)(Math.random() * range) + 0;
                   if(x==0){
                       str="Sports";
                   }else{
                       str="General";
                   }
                   //System.out.println("lalalal");
                   
                   QuestionPaper qp = new QuestionPaper(str,"");
                    //System.out.println(" tadadadad");
           
           container.removeAll();
            container.add(qp.jPaper);
           container.repaint();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    
                }
            });
//        
//        
        x.add(panel);
        
        x.repaint();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        QuestionPanel qs=new QuestionPanel();
        System.out.println(e.getSource());
        if(e.getSource()==button){
            //homePanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
           // questionPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            container.removeAll();
            container.add(topPanel);
            container.add(bottomPanel);
            
            container.repaint();
            
        }
        else if(e.getSource()==button2){
            
            //homePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           // questionPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            
            container.removeAll();
            //container.add(js,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            container.add(qs.jp);
            //container.add(qs.jp);
            //frame.add(js,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            
            container.repaint();
            container.revalidate();
        }else if(e.getSource()==button3){
            container.removeAll();
//            
            homePanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            createNewPAnel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//            frame.setVisible(false);
//            new QuizQestion();
           //Content c=new Content();
           
//           QuestionPaper qp = new QuestionPaper();
//           
//           
//            container.add(qp.jPaper);
//           container.repaint();
            
        }
        
        
    }
    

    
    
}


