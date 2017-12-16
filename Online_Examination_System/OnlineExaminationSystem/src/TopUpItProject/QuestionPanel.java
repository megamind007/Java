package TopUpItProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author sakib
 */
public class QuestionPanel {
        JPanel jp;
        //JScrollPane js;
        
        
    public QuestionPanel() {
        
         
         jp=new JPanel();
         
         jp.setLayout(new BorderLayout());
         jp.setBounds(0, 0, 750, 650);
        jp.setLayout(null);
        jp.setBackground(Color.WHITE);
         //jp.setPreferredSize(new Dimension(900,900));
         
        JLabel jl=new JLabel("Please select one from below : ");
        jl.setBounds(55, 15, 500, 50);
        jl.setFont(new Font("Lucida Bright",Font.BOLD,26));
        jl.setForeground(Color.decode("#16a085"));
        
        Font font = jl.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jl.setFont(font.deriveFont(attributes));
        
        jp.add(jl);
        
        JLabel l2=new JLabel("General Knowledge : ");
        l2.setBounds(55, 65, 250, 50);
        l2.setFont(new Font("Lucida Bright",Font.BOLD,18));
        l2.setForeground(Color.decode("#2c3e50"));
        jp.add(l2);
        
        JLabel l3=new JLabel("Science : ");
        l3.setBounds(55, 240, 250, 50);
        l3.setFont(new Font("Lucida Bright",Font.BOLD,18));
        l3.setForeground(Color.decode("#2c3e50"));
        jp.add(l3);
        
        JLabel l4=new JLabel("Sports : ");
        l4.setBounds(55, 420, 250, 50);
        l4.setFont(new Font("Lucida Bright",Font.BOLD,18));
        l4.setForeground(Color.decode("#2c3e50"));
        jp.add(l4);
        
        
        
        
        
        //jp.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
        
        
        
        
        DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Question1");  
          l1.addElement("Question2");  
          l1.addElement("Question3");  
          l1.addElement("Question4");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(55,120, 550,117);  
          list.setCellRenderer(getRenderer());
          list.setFont(new Font("Lucida Bright",Font.BOLD,22));
          list.setForeground(Color.decode("#2c3e50"));
          list.setBackground(Color.decode("#ecf0f1"));
          DefaultListCellRenderer renderer = (DefaultListCellRenderer) list.getCellRenderer();
          renderer.setHorizontalAlignment(SwingConstants.CENTER);
          
          list.addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 if (!e.getValueIsAdjusting()) {
                     System.out.println(list.getSelectedValue().toString());
                     
                     QuestionPaper qp=new QuestionPaper("General",list.getSelectedValue().toString());
                     jp.removeAll();
                     jp.add(qp.jPaper);
                     jp.repaint();
//hm.frame.invalidate();
//hm.frame.validate();

                     
                     
                }
             }
         });
          
          JList<String> list2 = new JList<>(l1);  
          list2.setBounds(55,295, 550,117);  
          list2.setCellRenderer(getRenderer());
          list2.setFont(new Font("Lucida Bright",Font.BOLD,22));
          list2.setForeground(Color.decode("#2c3e50"));
          list2.setBackground(Color.decode("#ecf0f1"));
          
          DefaultListCellRenderer renderer2 = (DefaultListCellRenderer) list2.getCellRenderer();
          renderer2.setHorizontalAlignment(SwingConstants.CENTER);
          
          JList<String> list3 = new JList<>(l1);  
          list3.setBounds(55,475, 550,117);  
          list3.setCellRenderer(getRenderer());
          list3.setFont(new Font("Lucida Bright",Font.BOLD,22));
          list3.setForeground(Color.decode("#2c3e50"));
          list3.setBackground(Color.decode("#ecf0f1"));
          
          DefaultListCellRenderer renderer3 = (DefaultListCellRenderer) list3.getCellRenderer();
          renderer3.setHorizontalAlignment(SwingConstants.CENTER);
          
          list3.addListSelectionListener(new ListSelectionListener() {
             @Override
             public void valueChanged(ListSelectionEvent e) {
                 if (!e.getValueIsAdjusting()) {
                     System.out.println(list3.getSelectedValue().toString());
                     
                     QuestionPaper qp=new QuestionPaper("Sports",list3.getSelectedValue().toString());
                     jp.removeAll();
                     jp.add(qp.jPaper);
                     jp.repaint();
//hm.frame.invalidate();
//hm.frame.validate();

                     
                     
                }
             }
         });
          
          jp.add(list);
          jp.add(list2);
          jp.add(list3);
          
          
            jp.repaint();
            jp.revalidate();
    }
    
     private ListCellRenderer<? super String> getRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list,
                    Object value, int index, boolean isSelected,
                    boolean cellHasFocus) {
                JLabel listCellRendererComponent = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected,cellHasFocus);
                listCellRendererComponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0,Color.decode("#1abc9c")));
                return listCellRendererComponent;
            }
        };
    }
    
}
