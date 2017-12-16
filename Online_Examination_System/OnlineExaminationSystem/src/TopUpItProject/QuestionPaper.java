package TopUpItProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author sakib
 */
public class QuestionPaper implements ActionListener{
    JPanel jPaper;
    String [][] data;
    String []correctAns;
    JLabel score;
     ButtonGroup []bg;
    //ButtonGroup btn;
     String catagory;
     
     
    
    public QuestionPaper(String k , String q) {
        catagory=k;
        Content c=new Content();
        correctAns=new String[10];
        System.out.println(q+"          "+k);
        if(catagory.equals("General")&& (q.equals("Question1")||q.equals(""))){
            data=c.question2;
        }else if(catagory.equals("Sports")&& (q.equals("Question1")||q.equals(""))){
        data=c.question1;
        }
        jPaper=new JPanel();
        jPaper.setBounds(0, 0, 750, 600);
        jPaper.setLayout(null);
        jPaper.setBackground(Color.WHITE);
        //btn=new ButtonGroup();
        
        JLabel questionlJLabel=new JLabel(" Number of Question : 10");
        questionlJLabel.setBounds(25, 10, 250, 20);
        questionlJLabel.setFont(new Font("Lucida Bright",Font.BOLD,14));
        questionlJLabel.setForeground(Color.decode("#16a085"));
        
        score=new JLabel(" Score : 0");
        score.setBounds(400, 10, 150, 20);
        score.setFont(new Font("Lucida Bright",Font.BOLD,14));
        score.setForeground(Color.decode("#16a085"));
        
        JButton submit=new JButton("submit");
        submit.setBounds(500, 10, 100, 20);
        submit.setFont(new Font("Lucida Bright",Font.BOLD,14));
        submit.setBackground(Color.decode("#16a085"));
        submit.setForeground(Color.WHITE);
        submit.setBorderPainted(false);
        submit.setFocusPainted(false);
        submit.setContentAreaFilled(true);
        
            submit.addActionListener(this);
        
        //submit.addActionListener(this);
        
        JLabel marks=new JLabel(" Total marks : 10");
        marks.setBounds(230, 10, 250, 20);
        marks.setFont(new Font("Lucida Bright",Font.BOLD,14));
        marks.setForeground(Color.decode("#16a085"));
        
        JPanel newQpanel =new JPanel();
        newQpanel.setLayout(null);
        newQpanel.setBounds(40, 50, 680 , 600);
        newQpanel.setBackground(Color.WHITE);
        JLabel [] questions=new JLabel[10];
        JRadioButton [][] ans=new JRadioButton[10][4];
        bg=new ButtonGroup[10];
        int y=0;
        int x=0;
        int z=20;
        int dataCount=1;
        for(int i=0;i<10;i++){
            questions[i]=new JLabel(" Question No "+(i+1)+" : "+data[i][0]);
            questions[i].setBounds(0, y+5, 650, 20);
            questions[i].setFont(new Font("Lucida Bright",Font.BOLD,12));
            questions[i].setForeground(Color.decode("#34495e"));
            bg[i]=new ButtonGroup();
            newQpanel.add(questions[i]);
            for(int j=0;j<4;j++){
                
                ans[i][j]=new JRadioButton(data[i][dataCount]);
                ans[i][j].setActionCommand(data[i][dataCount]);
                ans[i][j].setBounds(x, z+10, 170, 20);
                ans[i][j].setFont(new Font("Lucida Bright",Font.PLAIN,12));
                ans[i][j].setForeground(Color.decode("#2c3e50"));
                ans[i][j].setBackground(Color.WHITE);
                bg[i].add(ans[i][j]);
               //btn.add(ans[0][j]);
                newQpanel.add(ans[i][j]);
                x+=180;
                dataCount++;
            }
            correctAns[i]=data[i][5].trim();
            dataCount=1;
            y+=50;
            x=0;
            z+=50;
            //System.out.println("i am here "+btn.getSelection().getActionCommand());
        }
        
        jPaper.add(questionlJLabel);
        jPaper.add(marks);
        jPaper.add(score);
        jPaper.add(submit);
        jPaper.add(newQpanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int ttlScore=0;
        
        for(int i=0;i<10;i++){
            System.out.println(correctAns[i]+catagory);
            if(bg[i].getSelection().getActionCommand().trim().equals("")){
                System.out.println("askhfksgfaljfgaljsghfaj");
            } 
            String str=bg[i].getSelection().getActionCommand().trim();
            //System.out.println(""+bg[i].getSelection().getActionCommand());
            if(str.equalsIgnoreCase(correctAns[i].trim())){
                ttlScore++;
            }
            
        }
        JOptionPane.showMessageDialog(null, "Your Score is : "+ttlScore);
        score.setText("Score : "+ttlScore);
    }
    
}
