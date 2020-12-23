import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
class score 

{
	static JFrame jf;
	JRadioButton r1,r2,r3,r4;    
	ButtonGroup bg;
	String y;
	 static	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	String ques,opt1,opt2,opt3,opt4,ans,val1,val2,val3,val4,non;
	JButton b1,b2;
	JPanel jp,jp1,jp2,jp3;
	//int x=1,k,j,f,n=1;
	//int i=1;	
	score()
	 {
       	 jf=new JFrame();
         jf.setBounds(100,100,1200,600);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true); 

	ImageIcon ic=new ImageIcon("1.png");
	Image im=ic.getImage().getScaledInstance(1200,600,Image.SCALE_SMOOTH);
	ic=new ImageIcon(im);
	JLabel l=new JLabel(ic);
	l.setBounds(0,0,1200,600);
	jf.add(l);

	ImageIcon ic1=new ImageIcon("dd.png");
	Image im1=ic1.getImage().getScaledInstance(400,300,Image.SCALE_SMOOTH);
	ic1=new ImageIcon(im1);
	JLabel l1=new JLabel(ic1);
	l1.setBounds(600,300,400,300);
	l.add(l1);
	ImageIcon ic2=new ImageIcon("s.png");
	Image im2=ic2.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	ic2=new ImageIcon(im2);
	JLabel l2=new JLabel(ic2);
	l2.setBounds(200,300,100,100);
	l.add(l2);
	l1.setVisible(false);
	l2.setVisible(false);

	ImageIcon ic3=new ImageIcon("av.png");
	Image im3=ic3.getImage().getScaledInstance(400,100,Image.SCALE_SMOOTH);
	ic3=new ImageIcon(im3);
	JLabel l3=new JLabel(ic3);
	l3.setBounds(400,300,400,100);
	l.add(l3);
	l3.setVisible(false);
	
	ImageIcon ic4=new ImageIcon("pp.png");
	Image im4=ic4.getImage().getScaledInstance(200,100,Image.SCALE_SMOOTH);
	ic4=new ImageIcon(im4);
	JLabel l4=new JLabel(ic4);
	l4.setBounds(50,300,200,100);
	l.add(l4);
	l4.setVisible(false);
	ImageIcon ic5=new ImageIcon("ppp.png");
	Image im5=ic5.getImage().getScaledInstance(300,100,Image.SCALE_SMOOTH);
	ic5=new ImageIcon(im5);
	JLabel l5=new JLabel(ic5);
	l5.setBounds(450,500,300,100);
	l.add(l5);
	l5.setVisible(false);
	ImageIcon ic6=new ImageIcon("pppp.png");
	Image im6=ic6.getImage().getScaledInstance(300,100,Image.SCALE_SMOOTH);
	ic6=new ImageIcon(im6);
	JLabel l6=new JLabel(ic6);
	l6.setBounds(850,300,300,100);
	l.add(l6);
	l6.setVisible(false);
		



	jl4=new JLabel();
	l.add(jl4);
	jl4.setForeground(Color.black);
	jl4.setBounds(460,160,1000,100);
	jl4.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	if(quiz.z>=7){
	jl4.setText("Excellent Performance");
	l1.setVisible(true);
	l2.setVisible(true);
}
	else
	{
	if(quiz.z>=4)
	{
	jl4.setText("Average Performance");
	l3.setVisible(true);
	}
	else
	{
	jl4.setText("Poor Performance");
	l4.setVisible(true);
	l5.setVisible(true);
	l6.setVisible(true);
	}
	}	

	jl=new JLabel("Congractulations");
	l.add(jl);
	jl.setForeground(Color.black);
	jl.setBounds(500,0,500,100);
	jl.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	jl1=new JLabel(login.b+"  You have successfully complete this quiz");
	l.add(jl1);
	jl1.setForeground(Color.black);
	jl1.setBounds(350,40,1000,100);
	jl1.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	jl2=new JLabel(" Your Score");
	l.add(jl2);
	jl2.setForeground(Color.black);
	jl2.setBounds(500,80,1000,100);
	jl2.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	jl3=new JLabel(quiz.z+" out of 10 Correct");
	l.add(jl3);
	jl3.setForeground(Color.black);
	jl3.setBounds(500,120,1000,100);
	jl3.setFont(new Font("Curlz MT", Font.BOLD, 25));
	



	ImageIcon ic11=new ImageIcon("c.png");
	Image im11=ic11.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	ic11=new ImageIcon(im11);
	JLabel l11=new JLabel(ic11);
	l11.setBounds(1160,10,30,30);
	l.add(l11);
	l11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	l11.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new quiztype();
		jf.dispose();
		}
		});
	
     try
                        {
	if(quiz.z>4)
	{       
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                            PreparedStatement pt=con.prepareStatement("insert into winner values(?,?,?) ");                           

  			  
                  pt.setString(1,login.b);       
                  pt.setString(2,login.c);
                 pt.setString(3,quiz.z+"");
               pt.executeUpdate();
                                          new quiztype();
		}
                   }catch(Exception e){System.out.println(e);}                       


	jf.setVisible(true);

	}	

	public static void main(String [] ar)

	{
	new score();

	}
}