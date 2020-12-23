import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
class winner

{
	static JFrame jf;
	JRadioButton r1,r2,r3,r4;    
	ButtonGroup bg;
	String y;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	String ques,opt1,opt2,opt3,opt4,ans,val1,val2,val3,val4,non;
	JButton b1,b2;
	JPanel jp,jp1,jp2,jp3;
	int x=1,k,j,f,n=1,z=0;
	int i=1;	
	winner()
	 {
       	 jf=new JFrame();
         jf.setBounds(450,100,400,500);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true); 



	ImageIcon ic=new ImageIcon("1.png");
	Image im=ic.getImage().getScaledInstance(1200,600,Image.SCALE_SMOOTH);
	ic=new ImageIcon(im);
	JLabel l=new JLabel(ic);
	l.setBounds(0,0,400,500);
	jf.add(l);
	l.setBorder(BorderFactory.createLineBorder(Color.black));

	jl2=new JLabel();
	jl2.setBounds(0,80,400,2);
	l.add(jl2);
	jl2.setBorder(BorderFactory.createLineBorder(Color.black));
	

	jl1=new JLabel("TOP FIVE ");
	l.add(jl1);
	jl1.setForeground(Color.black);
	jl1.setBounds(140,0,150,50);
	jl1.setFont(new Font("Curlz MT", Font.BOLD, 25));
	jl2=new JLabel("WINNERS OF QUIZ");
	l.add(jl2);
	jl2.setForeground(Color.black);
	jl2.setBounds(80,30,350,50);
	jl2.setFont(new Font("Curlz MT", Font.BOLD, 25));

	jl3=new JLabel("Name");
	l.add(jl3);
	jl3.setForeground(Color.black);
	jl3.setBounds(10,80,100,50);
	jl3.setFont(new Font("Curlz MT", Font.BOLD, 23));
	jl4=new JLabel("AKA");
	l.add(jl4);
	jl4.setForeground(Color.black);
	jl4.setBounds(150,80,350,50);
	jl4.setFont(new Font("Curlz MT", Font.BOLD, 23));
	jl5=new JLabel("SCORE");
	l.add(jl5);
	jl5.setForeground(Color.black);
	jl5.setBounds(300,80,350,50);
	jl5.setFont(new Font("Curlz MT", Font.BOLD, 23));

	jl6=new JLabel();
	l.add(jl6);
	jl6.setForeground(Color.black);
	jl6.setBounds(10,120,100,50);
	jl6.setFont(new Font("Curlz MT", Font.BOLD, 23));
	jl7=new JLabel();
	l.add(jl7);
	jl7.setForeground(Color.black);
	jl7.setBounds(150,120,350,50);
	jl7.setFont(new Font("Curlz MT", Font.BOLD, 23));
	jl8=new JLabel();
	l.add(jl8);
	jl8.setForeground(Color.black);
	jl8.setBounds(350,120,350,50);
	jl8.setFont(new Font("Curlz MT", Font.BOLD, 23));

 				try                         
                   {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from winner where score >= 7");
                         while(sr.next())  
                         {
			
                               		val1=(sr.getString(1));
			       		val2=(sr.getString(2));
                              	        val3=(sr.getString(3));
					jl6.setText(val1);	                                    
					jl7.setText(val2);	                                    
					jl8.setText(val3);	                                    
	

		      }
                         }catch(Exception e){System.out.println(e);} 
	

	jl2=new JLabel("WINNERS OF QUIZ");
//	l.add(jl2);
	jl2.setForeground(Color.black);
	jl2.setBounds(80,30,350,50);
	jl2.setFont(new Font("Curlz MT", Font.BOLD, 25));
	jl2=new JLabel("WINNERS OF QUIZ");
//	l.add(jl2);
	jl2.setForeground(Color.black);
	jl2.setBounds(80,30,350,50);
	jl2.setFont(new Font("Curlz MT", Font.BOLD, 25));

	
	

	ImageIcon ic1=new ImageIcon("c.png");
	Image im1=ic1.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
	ic1=new ImageIcon(im1);
	JLabel l1=new JLabel(ic1);
	l1.setBounds(370,10,20,20);
	l.add(l1);
	l1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	l1.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		jf.dispose();
		}
		});
	

	jf.setVisible(true);

	}	

	public static void main(String [] ar)

	{
	
	new winner();
	

	}
}