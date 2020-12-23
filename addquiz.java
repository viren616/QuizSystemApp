import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.lang.Object;
import java.lang.Math;

class addquiz

{
	static JFrame jf;
 	static	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	JComboBox jcb1;	
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	int a;
	JButton jb1;
	addquiz()
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
	

	jl1=new JLabel(" Welcome to Add Quiz Page ");
	l.add(jl1);
	jl1.setForeground(Color.black);
	jl1.setBounds(400,10,700,50);
	jl1.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	jl3=new JLabel("Please Enter Quiz Name  ");
	l.add(jl3);
	jl3.setForeground(Color.black);
	jl3.setBounds(180,70,1000,50);
	jl3.setFont(new Font("Curlz MT", Font.BOLD, 30));


	ImageIcon ic3=new ImageIcon("i.png");
	Image im3=ic3.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH);
	ic3=new ImageIcon(im3);
	JLabel l3=new JLabel(ic3);
	l3.setBounds(350,150,400,400);
	l.add(l3);
	l.setBorder(BorderFactory.createLineBorder(Color.black));
   	tf1=new JTextField();  
    	tf1.setBounds(550,80,300,30);  
	l.add(tf1);
	tf1.setFont(new Font("Curlz MT", Font.BOLD, 30));
			
	jb1=new JButton("Proceed To Add Question");
	jb1.setForeground(Color.red);
	jb1.setBounds(800,500,280,30);
	jb1.setFont(new Font("Curlz MT", Font.BOLD, 20));
	jb1.setBackground(Color.black);
	l.add(jb1);


   jb1.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     

                          try
                        {  
			
     			    Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren"); 
           	  String str="CREATE TABLE "+tf1.getText()+" " +
                   "(no INT not NULL, " +
                   " ques VARCHAR(255), " + 
                   " opt1 VARCHAR(255), " + 
                   " opt2 VARCHAR(255), " + 
                   "opt3 VARCHAR(255), " +
		   "opt4 VARCHAR(255), " +
		   "ans VARCHAR(255))"; 

       PreparedStatement pt=con.prepareStatement(str); 

  
		                pt.executeUpdate();
			jf.dispose();
			new addques();
	        
                        }catch(Exception e){System.out.println(e);}                       
                 }      	
         });









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
	new admin();
	jf.dispose();
	}
	});

	jf.setVisible(true);

	}	

	public static void main(String [] ar)

	{
	new addquiz();
	}
}