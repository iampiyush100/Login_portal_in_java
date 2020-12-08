
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Calculater extends JFrame{
    
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf;
    JButton b;
    String id = "iampiyush100";
    String pass="12345";
    public Calculater()
    {
        setVisible(true);
        setSize(400,400);
        setLocation(200, 200);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
          l1 =  new JLabel("Enter Email");
          tf1 = new JTextField();
          l2 =  new JLabel("Enter Password");
          pf = new JPasswordField();
          b= new JButton("Login");
          l3= new JLabel();
          setLayout(null);
          add(l1);
          add(tf1);
          add(l2);
          add(pf);
          add(b);
          add(l3);
          
          l1.setBounds(50,30,100,30);
          tf1.setBounds(160,30,100,30);
          l2.setBounds(50,100,100,30);
          pf.setBounds(160,100,100,30);
          b.setBounds(50,200,200,50);
         l3.setBounds(50,260,200,50);
          
          b.addActionListener(new EventHandle());
          
         
       }
     class EventHandle implements ActionListener
          {
     
    @Override
    public void actionPerformed(ActionEvent e) {
       String s = tf1.getText();
       char ch[] = pf.getPassword();
       String ss = new String(ch);
       if(s.equals(id) && ss.equals(pass))
       {
          l3.setText("succesful LOGIN");
       }
       else
       {
          l3.setText("Opps!! Unsuccesful LOGIN");  
   
       }
      
    }
     }
    
    public static void main(String[] args) {
        Calculater c=new Calculater();
        
    }
}
