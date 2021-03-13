
/**
 * Write a description of IPFinder here.
 * IP address finder by using java swing/AWT with events, networking
 * @author (Noor Ahmed Shaikh ) 
 */
import javax.swing.*;               // external GUI 
import java.awt.event.*;           // external events handler
import java.net.*;                 // netwroking packages
import java.awt.Color;             // foe set the colors

public class TestIPFinder extends JFrame implements ActionListener
{
    JLabel l;                       //label
    JTextField TextF,TextF2;       //TextFiled
    JButton btn,btn2;              // button
    
    // GUI
    TestIPFinder()
    {
        super("IP Finder -19SW24");          // title of Frame passing using  ' super '
       
        // label
        l = new JLabel("Enter URL:");       // Label 
        l.setBounds(100,120,180,45);        // set the Boundry of label
        
        //TextField
        TextF = new JTextField();
        TextF.setBounds(100,150,300,50);    // set the boundry of TextField
        TextF.setForeground(Color.WHITE);
        TextF.setBackground(Color.GRAY);
        
        //creating Button
        btn = new JButton("Find IP Address");
        btn.setBounds(100,220,125,80);      //set the boundry of button
        btn.setForeground(Color.WHITE);
        btn.setBackground(Color.BLACK);
       
        // implement the ActionListener on the button
        btn.addActionListener(this);


        //adding textField, label and button in frame
        add(l);                                      //add label
        add(TextF);                                 // add textField
        add(btn);                                  //adding button


        //Frame visibility setting
        setSize(600,600);                          // set the Frame Size width and height
        setLayout(null);                          //hide default layout of frame
        setVisible(true);                        //set the visisbility of frame
        setBackground(Color.GRAY);               //set background color of frame
    }
    
    //handle the actionEvent using ' actionPerformed(ActionEvent e) '
    public void actionPerformed(ActionEvent e)
    {
        String url=TextF.getText();  // taking URL in textfield
        //networking code finding IP Address
        try
        {
            // creating object of InetAddress and getting Name by passing URL
            InetAddress iname = InetAddress.getByName(url);  
            // getting ip address using getHostAddress() method
            String ipadd = iname.getHostAddress();
            //show Ip address message pomp Dialog using JOptionPane
            JOptionPane.showMessageDialog(this,ipadd);
        }
        catch(UnknownHostException excpt)
        {
            // ip exception occur it catch the Exception show the exception in 
            //Dialog popup
            JOptionPane.showMessageDialog( this, excpt.getMessage() );
        }
    }


    public static void main(String args[])
    {
        TestIPFinder obj = new TestIPFinder();
    }
}
