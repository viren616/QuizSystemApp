import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
  class quiztype
	{
	JFrame jf;
static	JPanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp12,jp13;
static	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl12,jl13,jl14;
static	String h,f;
String name;
int panel_count = 5, count=0;
int i,q=10,j,ss,r=610; 

	JPanel [] jpanel = new JPanel[panel_count];
      	JLabel jll [] =new JLabel[panel_count];

	quiztype()
{
	jf=new JFrame();
         jf.setBounds(50,100,1250,600);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true); 
	

   


	ImageIcon ic=new ImageIcon("1.png");
	Image im=ic.getImage().getScaledInstance(1250,1200,Image.SCALE_SMOOTH);
	ic=new ImageIcon(im);
	JLabel l=new JLabel(ic);
	l.setBounds(0,0,1250,1200);
	jf.add(l);
	
	jl8=new JLabel();
	jl8.setBounds(350,450,170,2);
	l.add(jl8);
	jl8.setBorder(BorderFactory.createLineBorder(Color.black));
	jl9=new JLabel();
	jl9.setBounds(670,450,170,2);
	l.add(jl9);
	jl9.setBorder(BorderFactory.createLineBorder(Color.black));
			

	jl=new JLabel("WELCOME Please Select Quiz Type ");
	jl.setBounds(400,10,500,40);
	l.add(jl);
	jl.setForeground(Color.black);	
	jl.setFont(new Font("Curlz MT",Font.BOLD,25));



JScrollBar s=new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0,600);  
	s.setBounds(1220,50,30,1150);  
	l.add(s);  
  
 	s.addAdjustmentListener(new AdjustmentListener() {  
                public void adjustmentValueChanged(AdjustmentEvent e) {  
        	l.setBounds(0,-s.getValue(),1250,1200);
	        jf.repaint();
		jf.revalidate();
		l.repaint();
                }  
            });  






	jp=new JPanel();
	jp.setBounds(10,130,300,100);
	l.add(jp);	
	jp.setLayout(null);
	jp.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl1=new JLabel("Java Quiz");
	jl1.setBounds(100,10,500,40);
	jp.add(jl1);
	jl1.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl1.setForeground(Color.white);	
	
	jl1.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from question where no=?";
		
		new quiz();
		jf.dispose();
		}
		});
		
	
	jp1=new JPanel();
	jp1.setBounds(10,250,300,100);
	l.add(jp1);	
	jp1.setLayout(null);
	jp1.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl2=new JLabel("C Quiz");
	jl2.setBounds(100,10,500,40);
	jp1.add(jl2);
	jl2.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl2.setForeground(Color.white);	
	jl2.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from c where no=?";
		new quiz();
		jf.dispose();
		}
		});





	jp2=new JPanel();
	jp2.setBounds(10,370,300,100);
	l.add(jp2);	
	jp2.setLayout(null);
	jp2.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl3=new JLabel("C++ Quiz");
	jl3.setBounds(100,10,500,40);
	jp2.add(jl3);
	jl3.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl3.setForeground(Color.white);	
	jl3.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from cplusplus where no=?";
		new quiz();
		jf.dispose();
		}
		});
	


	
	jp3=new JPanel();
	jp3.setBounds(10,490,300,100);
	l.add(jp3);	
	jp3.setLayout(null);
	jp3.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl4=new JLabel("HTML Quiz ");
	jl4.setBounds(80,10,500,40);
	jp3.add(jl4);
	jl4.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl4.setForeground(Color.white);	
	jl4.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from html where no=?";
		new quiz();
		jf.dispose();
		}
		});
	


	jp4=new JPanel();
	jp4.setBounds(890,130,300,100);
	l.add(jp4);	
	jp4.setLayout(null);
	jp4.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl5=new JLabel("MySql Quiz");
	jl5.setBounds(80,10,500,40);
	jp4.add(jl5);
	jl5.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl5.setForeground(Color.white);	
	jl5.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from mmysql where no=?";
		new quiz();
		jf.dispose();
		}
		});


	jp5=new JPanel();
	jp5.setBounds(890,250,300,100);
	l.add(jp5);	
	jp5.setLayout(null);
	jp5.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl6=new JLabel("Python Quiz");
	jl6.setBounds(80,10,500,40);
	jp5.add(jl6);
	jl6.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl6.setForeground(Color.white);	
	jl6.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from python where no=?";
		new quiz();
		jf.dispose();
		}
		});
	

	jp6=new JPanel();
	jp6.setBounds(890,370,300,100);
	l.add(jp6);	
	jp6.setLayout(null);
	jp6.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl7=new JLabel("VisualBasic Quiz");
	jl7.setBounds(80,10,500,40);
	jp6.add(jl7);
	jl7.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl7.setForeground(Color.white);	
	jl7.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from visualbasic where no=?";
		new quiz();
		jf.dispose();
		}
		});

	jp7=new JPanel();
	jp7.setBounds(890,490,300,100);
	l.add(jp7);	
	jp7.setLayout(null);
	jp7.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl10=new JLabel("Css Quiz");
	jl10.setBounds(100,10,500,40);
	jp7.add(jl10);
	jl10.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl10.setForeground(Color.white);	
	
	jl10.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
			h="select * from css where no=?";
		new quiz();
		jf.dispose();
		}
		});

	jp12=new JPanel();
	jp12.setBounds(320,490,270,100);
	l.add(jp12);	
	jp12.setLayout(null);
	jp12.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl12=new JLabel("NULL");
	jl12.setBounds(80,10,500,40);
	jp12.add(jl12);
	jl12.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl12.setForeground(Color.white);	
	jl12.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		//	h="select * from python where no=?";
		new quiz();
		jf.dispose();
		}
		});

	jp13=new JPanel();
	jp13.setBounds(610,490,270,100);
	l.add(jp13);	
	jp13.setLayout(null);
	jp13.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jl13=new JLabel("NULL");
	jl13.setBounds(80,10,500,40);
	jp13.add(jl13);
	jl13.setFont(new Font("Curlz MT",Font.BOLD,25));
	jl13.setForeground(Color.white);	
	jl13.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
		//	h="select * from python where no=?";
		new quiz();
		jf.dispose();
		}
		});
	

	jl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jl10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   
	 


for(int j=1;j<6;j++){
	for(i = 1; i < panel_count; i++){
            jpanel[i] = new JPanel();
	    jpanel[i].setBounds(q,r,270,100);
	    q=q+310;
	    jpanel[i].setBackground(new Color(.05f,.05f,.05f,0.5f));
	    l.add(jpanel[i]);


	jll[i]=new JLabel(count+"");
	jll[i].setBounds(80,10,500,40);
	jpanel[i].add(jll[i]);
	jll[i].setFont(new Font("Curlz MT",Font.BOLD,25));
	jll[i].setForeground(Color.white);	
	count=count+1;

			
}
       r=r+120; 
       q=10;
	}



  try                                                                                                                       //jcombobox
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "show tables");
			while (sr.next()) {
    			f= sr.getString(1);

  			 }
                         

	
                         }catch(Exception e){System.out.println(e);} 




        


ImageIcon ic1=new ImageIcon("i.png");
	Image im1=ic1.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH);
	ic1=new ImageIcon(im1);
	JLabel l1=new JLabel(ic1);
	l1.setBounds(450,150,300,300);
	l.add(l1);
	
	ImageIcon ic2=new ImageIcon("j3.png");
	Image im2=ic2.getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH);
	ic2=new ImageIcon(im2);
	JLabel l2=new JLabel(ic2);
	l2.setBounds(20,20,70,70);
	l.add(l2);
	
	ImageIcon ic3=new ImageIcon("c.png");
	Image im3=ic3.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	ic3=new ImageIcon(im3);
	JLabel l3=new JLabel(ic3);
	l3.setBounds(1210,10,30,30);
	l.add(l3);
	l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	l3.addMouseListener(new MouseAdapter()
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
	new quiztype();
	}
}		