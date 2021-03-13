
/**
 * Write a description of MoneyConvetor here.
 * 
 * @author (Noor Ahmed Shaikh) 
 * @version (a version number or a date)
 */
// roll no: 19sw24
//name: Noor ahmed shaikh

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Convertor implements ActionListener{
    
    JFrame f1,f2,f3,f4;
    JLabel lh1,lh2,h3;
    JButton btn1,btn2,btn3;
    Convertor()
    {
        //frame settings
        ImageIcon Icon=new ImageIcon("C:\\Users\\khan\\Desktop\\currencylogo.png");
        f1 = new JFrame("currency Convertor");
        f1.setIconImage(Icon.getImage());
        f1.setBounds(200,60,550,450);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
      
        Container conn = f1.getContentPane();
        conn.setVisible(true);
        conn.setBackground(Color.PINK);
        conn.setLayout(null);
        
        
        //heading settins
        lh1 = new JLabel("currency Convertor",JLabel.RIGHT);
        lh1.setBounds(40,30,400,50);
        Font fn = new Font("Arial",Font.BOLD,30);
        lh1.setFont(fn);
        conn.add(lh1);
        
        //buttons settings
        btn1 = new JButton("PKR to Dollar");
        btn1.setBounds(190,100,120,60);
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setForeground(Color.WHITE);
        Cursor crs=new Cursor(Cursor.HAND_CURSOR);
        btn1.setCursor(crs);
        conn.add(btn1);
        btn1.addActionListener(this);
        
        btn2     = new JButton("PKR to Pounds");
        btn2.setBounds(190,180,120,60);
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setForeground(Color.WHITE);
        btn2.setCursor(crs);
        conn.add(btn2);
        btn2.addActionListener(this);
        
        btn3 = new JButton("PKR to Riyal");
        btn3.setBounds(190,260,120,60);
        btn3.setBackground(Color.DARK_GRAY);
        btn3.setForeground(Color.WHITE);
        btn3.setCursor(crs);
        conn.add(btn3);
        btn3.addActionListener(this);
    }
    JLabel lhp, lp,ld;
    JTextField tp,td;
    JButton ext,convrt,rst;
    public void actionPerformed(ActionEvent e)
    {
        String act = e.getActionCommand();
        //PKR to Dollar
        if(act=="PKR to Dollar")
        {
            f2 = new JFrame("PKR to Dollar");
            Container conn2 = f2.getContentPane();
            f2.setBounds(400,40,550,500);
            f2.setVisible(true);
            f2.setLayout(null);
            //container settings
            conn2.setVisible(true);
            conn2.setBackground(Color.LIGHT_GRAY);
            conn2.setLayout(null);
            //heading setting
            ImageIcon Icon=new ImageIcon("C:\\Users\\khan\\Documents\\muet uni doc\\2nd semester\\OOP sub\\moneyConvertorproject\\images\\dollar.png");
            lhp = new JLabel("PKR to Dollar",Icon,JLabel.RIGHT);
            lhp.setBounds(10,50,400,100);
            Font fn = new Font("Arial",Font.BOLD,40);
            lhp.setFont(fn);
            conn2.add(lhp);
            
            //labels settings
            lp = new JLabel("PKR Money");
            lp.setBounds(60,160,140,30);
            Font fn2 = new Font("Arial",Font.BOLD,20);
            lp.setFont(fn2);
            conn2.add(lp);
            
            ld = new JLabel("Dollar Money");
            ld.setBounds(60,280,140,30);
            ld.setFont(fn2);
            conn2.add(ld);
            
            //pkr settings
            tp = new JTextField();
            tp.setBounds(180,150,190,70);
            Font fn3 = new Font("Arial",Font.ITALIC,30);
            tp.setFont(fn3);
            tp.setForeground(Color.RED);
            conn2.add(tp);
            //dollar setting
            td = new JTextField();
            td.setBounds(190,270,190,70);
            td.setFont(fn3);
            td.setForeground(Color.RED);
            conn2.add(td);
            
            //converor button
            convrt = new JButton("Convert");
            convrt.setBounds(70,350,120,60);
            convrt.setBackground(Color.DARK_GRAY);
            convrt.setForeground(Color.WHITE);
            Cursor crs=new Cursor(Cursor.HAND_CURSOR);
            convrt.setCursor(crs);
            conn2.add(convrt);
            //pkr text settings
            convrt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {

                    //String ch=e2.getActionCommand();
                    if(convrt==e2.getSource())
                    {
                           
                            try{
                            float textpk=Float.parseFloat( tp.getText() );
                            if(textpk>0)
                            {
                                final float textDollar=textpk/160.05f;
                                String txt=String.valueOf(textDollar);
                                td.setText("$"+txt);
                            }
                           }catch(Exception e){JOptionPane.showMessageDialog(conn2,"Please Enter the Amount!");}
                    }
                }
            }
            );
            
            //reset button
            rst = new JButton("Reset");
            rst.setBounds(220,350,120,60);
            rst.setBackground(Color.DARK_GRAY);
            rst.setForeground(Color.WHITE);
            rst.setCursor(crs);
            conn2.add(rst);
            //exit button performance settings
            rst.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    String ch=e2.getActionCommand();
                    if(ch=="Reset")
                    {
                        tp.setText(null);
                        td.setText(null);
                    }
                }
            }
            );
            
            //exit button setting
            ext = new JButton("Exit");
            ext.setBounds(370,350,120,60);
            ext.setBackground(Color.DARK_GRAY);
            ext.setForeground(Color.WHITE);
            ext.setCursor(crs);
            conn2.add(ext);
            //exit button performance settings
            ext.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    String ch=e2.getActionCommand();
                    if(ch=="Exit")
                    {
                        JOptionPane.showConfirmDialog(conn2,"Are your sure to Quit?");
                        f2.setVisible(false);
                    }
                }
            }
            );
            
            }
            
           //PkR to Pounds
           if(act=="PKR to Pounds")
           {
               f3 = new JFrame("PKR to Pounds");
            Container conn3 = f3.getContentPane();
            f3.setBounds(400,40,550,500);
            f3.setVisible(true);
            f3.setLayout(null);
            //container settings
            conn3.setVisible(true);
            conn3.setBackground(Color.LIGHT_GRAY);
            conn3.setLayout(null);
            //heading setting
            //ImageIcon Icon=new ImageIcon("C:\\Users\\khan\\Documents\\muet uni doc\\2nd semester\\OOP sub\\java programs\\projects\\icon.png");
            lhp = new JLabel("PKR to Pounds",JLabel.RIGHT);
            lhp.setBounds(10,30,400,50);
            Font fn = new Font("Arial",Font.BOLD,40);
            lhp.setFont(fn);
            conn3.add(lhp);
            
            //labels settings
            lp = new JLabel("PKR Money");
            lp.setBounds(60,130,140,30);
            Font fn2 = new Font("Arial",Font.BOLD,20);
            lp.setFont(fn2);
            conn3.add(lp);
            
            ld = new JLabel("Pounds Money");
            ld.setBounds(60,260,140,30);
            ld.setFont(fn2);
            conn3.add(ld);
            
            //pkr settings
            tp = new JTextField();
            tp.setBounds(180,110,190,70);
            Font fn3 = new Font("Arial",Font.ITALIC,30);
            tp.setFont(fn3);
            tp.setForeground(Color.RED);
            conn3.add(tp);
            //dollar setting
            td = new JTextField();
            td.setBounds(190,250,190,70);
            td.setFont(fn3);
            td.setForeground(Color.RED);
            conn3.add(td);
            
            //converor button
            convrt = new JButton("Convert");
            convrt.setBounds(70,350,120,60);
            convrt.setBackground(Color.DARK_GRAY);
            convrt.setForeground(Color.WHITE);
            Cursor crs=new Cursor(Cursor.HAND_CURSOR);
            convrt.setCursor(crs);
            conn3.add(convrt);
            
            //pkr text settings
            convrt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {

                    if(convrt==e2.getSource())
                    {
                           
                            try{
                            float textpk=Float.parseFloat( tp.getText() );
                            if(textpk>0)
                            {
                                final float textDollar=textpk * 0.0047f;
                                String txt=String.valueOf(textDollar);
                                td.setText("£"+txt);
                            }
                            }catch(Exception e){JOptionPane.showMessageDialog(conn3,"Please Enter the Amount!");}
                    }
                }
            }
            );
            //for  reset button
            //reset button
            rst = new JButton("Reset");
            rst.setBounds(220,350,120,60);
            rst.setBackground(Color.DARK_GRAY);
            rst.setForeground(Color.WHITE);
            rst.setCursor(crs);
            conn3.add(rst);
            //exit button performance settings
            rst.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    String ch=e2.getActionCommand();
                    if(ch=="Reset")
                    {
                        tp.setText(null);
                        td.setText(null);
                    }
                }
            }
            );
            
            //exit button setting
            ext = new JButton("Exit");
            ext.setBounds(370,350,120,60);
            ext.setBackground(Color.DARK_GRAY);
            ext.setForeground(Color.WHITE);
            ext.setCursor(crs);
            conn3.add(ext);
            //exit button performance settings
            ext.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    String ch=e2.getActionCommand();
                    if(ch=="Exit")
                    {
                        JOptionPane.showConfirmDialog(conn3,"Are your sure to Quit?");
                        f3.setVisible(false);
                    }
                }
            }
            );
            
           }
           
           //PkR to riyal
           if(act=="PKR to Riyal")
           {
               f4 = new JFrame("PKR to Riyals");
            Container conn4 = f4.getContentPane();
            f4.setBounds(400,40,550,500);
            f4.setVisible(true);
            f4.setLayout(null);
            //container settings
            conn4.setVisible(true);
            conn4.setBackground(Color.LIGHT_GRAY);
            conn4.setLayout(null);
            //heading setting
            //ImageIcon Icon=new ImageIcon("C:\\Users\\khan\\Documents\\muet uni doc\\2nd semester\\OOP sub\\java programs\\projects\\icon.png");
            lhp = new JLabel("PKR to Riyal",JLabel.RIGHT);
            lhp.setBounds(10,30,400,50);
            Font fn = new Font("Arial",Font.BOLD,40);
            lhp.setFont(fn);
            conn4.add(lhp);
            
            //labels settings
            lp = new JLabel("PKR Money");
            lp.setBounds(60,130,140,30);
            Font fn2 = new Font("Arial",Font.BOLD,20);
            lp.setFont(fn2);
            conn4.add(lp);
            
            ld = new JLabel("Riyals Money");
            ld.setBounds(60,260,140,30);
            ld.setFont(fn2);
            conn4.add(ld);
            
            //pkr settings
            tp = new JTextField();
            tp.setBounds(180,110,190,70);
            Font fn3 = new Font("Arial",Font.ITALIC,30);
            tp.setFont(fn3);
            tp.setForeground(Color.RED);
            conn4.add(tp);
            //dollar setting
            td = new JTextField();
            td.setBounds(190,250,190,70);
            td.setFont(fn3);
            td.setForeground(Color.RED);
            conn4.add(td);
            
            //converor button
            convrt = new JButton("Convert");
            convrt.setBounds(70,350,120,60);
            convrt.setBackground(Color.DARK_GRAY);
            convrt.setForeground(Color.WHITE);
            Cursor crs=new Cursor(Cursor.HAND_CURSOR);
            convrt.setCursor(crs);
            conn4.add(convrt);
            
            //pkr text settings
            convrt.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {

                    if(convrt==e2.getSource())
                    {
                           
                            try{
                            float textpk=Float.parseFloat( tp.getText() );
                            if(textpk>0)
                            {
                                final float textDollar=textpk / 42.70f;
                                String txt=String.valueOf(textDollar);
                                td.setText("SAR:"+txt);
                            }
                        }catch(Exception e){JOptionPane.showMessageDialog(conn4,"Please Enter the Amount!");}
                    }
                }
            }
            );
            //for  reset button
            //reset button
            rst = new JButton("Reset");
            rst.setBounds(220,350,120,60);
            rst.setBackground(Color.DARK_GRAY);
            rst.setForeground(Color.WHITE);
            rst.setCursor(crs);
            conn4.add(rst);
            //exit button performance settings
            rst.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    String ch=e2.getActionCommand();
                    if(ch=="Reset")
                    {
                        tp.setText(null);
                        td.setText(null);
                    }
                }
            }
            );
            
            //exit button setting
            ext = new JButton("Exit");
            ext.setBounds(370,350,120,60);
            ext.setBackground(Color.DARK_GRAY);
            ext.setForeground(Color.WHITE);
            ext.setCursor(crs);
            conn4.add(ext);
            //exit button performance settings
            ext.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    String ch=e2.getActionCommand();
                    if(ch=="Exit")
                    {
                        JOptionPane.showConfirmDialog(conn4,"Are your sure to Quit?");
                        f4.setVisible(false);
                    }
                }
            }
            );
            
           }
    }
    
    public static void main(String args[])
    {
        try {
            // select Look and Feel
           UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            // start application
           Convertor obj = new Convertor();

        }
        catch (Exception ex) {
            System.out.println(ex.toString());
       
        }
       
    }
        
    }