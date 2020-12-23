import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
class admin 

{
	static JFrame jf;
	JRadioButton r1,r2,r3,r4;    
	ButtonGroup bg;
	String y;
 	static	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	String ques,opt1,opt2,opt3,opt4,ans,val1,val2,val3,val4,non;
	JButton b1,b2;
	JPanel jp,jp1,jp2,jp3;
	int x=1,k,j,f,n=1,z=0;
	int i=1;	
	admin()
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
	l.setBorder(BorderFactory.createLineBorder(Color.black));
	jl2=new JLabel();
	jl2.setBounds(0,60,1200,2);
	l.add(jl2);
	jl2.setBorder(BorderFactory.createLineBorder(Color.black));
	

	jl1=new JLabel(" Welcome to Administrator Page ");
	l.add(jl1);
	jl1.setForeground(Color.black);
	jl1.setBounds(400,10,700,50);
	jl1.setFont(new Font("Curlz MT", Font.BOLD, 25));

	jl4=new JLabel(" Add Quiz ");
	l.add(jl4);
	jl4.setForeground(Color.black);
	jl4.setBounds(20,70,140,50);
	jl4.setFont(new Font("Curlz MT", Font.BOLD, 25));
	ImageIcon ic3=new ImageIcon("i.png");
	Image im3=ic3.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	ic3=new ImageIcon(im3);
	JLabel l3=new JLabel(ic3);
	l3.setBounds(20,150,100,100);
	l.add(l3);
	l.setBorder(BorderFactory.createLineBorder(Color.black));
		l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	jl4.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new addquiz();
		jf.dispose();
		}
		});
	
l3.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new addquiz();
		jf.dispose();
		}
		});
	


	jl5=new JLabel(" Add Question ");
	l.add(jl5);
	jl5.setForeground(Color.black);
	jl5.setBounds(200,250,170,50);
	jl5.setFont(new Font("Curlz MT", Font.BOLD, 25));
	ImageIcon ic4=new ImageIcon("i.png");
	Image im4=ic4.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	ic4=new ImageIcon(im4);
	JLabel l4=new JLabel(ic4);
	l4.setBounds(230,330,100,100);
	l.add(l4);
	l.setBorder(BorderFactory.createLineBorder(Color.black));
	l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

	
	jl5.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new addques();
		jf.dispose();
		}
		});
	
l4.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new addques();
		jf.dispose();
		}
		});
	




	jl6=new JLabel(" View All Visitors ");
	l.add(jl6);
	jl6.setForeground(Color.black);
	jl6.setBounds(430,70,250,50);
	jl6.setFont(new Font("Curlz MT", Font.BOLD, 25));
	jl5.setBackground(Color.black);
	ImageIcon ic5=new ImageIcon("i.png");
	Image im5=ic5.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	ic5=new ImageIcon(im5);
	JLabel l5=new JLabel(ic5);
	l5.setBounds(460,150,100,100);
	l.add(l5);
	l.setBorder(BorderFactory.createLineBorder(Color.black));

	jl7=new JLabel(" View Top 10 Winners ");
	l.add(jl7);
	jl7.setForeground(Color.black);
	jl7.setBounds(950,70,250,50);
	jl7.setFont(new Font("Curlz MT", Font.BOLD, 25));
	jl7.setBackground(Color.black);
	ImageIcon ic7=new ImageIcon("i.png");
	Image im7=ic7.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	ic7=new ImageIcon(im7);
	JLabel l7=new JLabel(ic7);
	l7.setBounds(980,150,100,100);
	l.add(l7);
	l.setBorder(BorderFactory.createLineBorder(Color.black));

	l7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


jl7.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new showwin();
		jf.dispose();
		}
		});
	
l7.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		new showwin();
		jf.dispose();
		}
		});


	jl8=new JLabel(" Change Password ");
	l.add(jl8);
	jl8.setForeground(Color.black);
	jl8.setBounds(680,250,200,50);
	jl8.setFont(new Font("Curlz MT", Font.BOLD, 25));
	jl8.setBackground(Color.black);
	ImageIcon ic6=new ImageIcon("i.png");
	Image im6=ic6.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
	ic6=new ImageIcon(im6);
	JLabel l6=new JLabel(ic6);
	l6.setBounds(730,330,100,100);
	l.add(l6);
	l.setBorder(BorderFactory.createLineBorder(Color.black));
	

	ImageIcon ic1=new ImageIcon("c.png");
	Image im1=ic1.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	ic1=new ImageIcon(im1);
	JLabel l1=new JLabel(ic1);
	l1.setBounds(1160,10,30,30);
	l.add(l1);
	l1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	l1.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		jf.dispose();
		}
		});
	
	ImageIcon ic2=new ImageIcon("p.png");
	Image im2=ic2.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	ic2=new ImageIcon(im2);
	JLabel l2=new JLabel(ic2);										//backarrow
	l2.setBounds(10,10,40,40);
	l.add(l2);
	l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
	
	   l2.addMouseListener(new MouseAdapter()
	{
	public void mouseClicked(MouseEvent r)
	{
	new login();
	jf.dispose();
	}
	});

	jf.setVisible(true);

	}	

	public static void main(String [] ar)

	{
	
	new admin();
	

	}
}