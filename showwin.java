import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.lang.Object;
import java.lang.Math;

class showwin

{
	static JFrame jf;
 	static	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	JComboBox jcb1;	
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	int a;
 DefaultListModel<String> l1,l2 ;
	JButton jb1;
	showwin()
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
	

	jl1=new JLabel(" Welcome to Winner Page ");
	l.add(jl1);
	jl1.setForeground(Color.black);
	jl1.setBounds(400,10,700,50);
	jl1.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	jl2=new JLabel(" Winners Name / Aka ");
	l.add(jl2);
	jl2.setForeground(Color.black);
	jl2.setBounds(300,70,700,50);
	jl2.setFont(new Font("Curlz MT", Font.BOLD, 25));
	

	jl3=new JLabel(" Scores");
	l.add(jl3);
	jl3.setForeground(Color.black);
	jl3.setBounds(700,70,700,50);
	jl3.setFont(new Font("Curlz MT", Font.BOLD, 25));
	

	 l1 = new DefaultListModel<>();  
           l2 = new DefaultListModel<>();  
          

 try                                                                                                                       //jcombobox
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select aka,score from winner order by score desc limit 10");
                         while(sr.next())  
                         {
   System.out.println(sr.getString(1)+" "+sr.getString(2));  
	  l1.addElement(" "+sr.getString(1));
          JList<String> list = new JList<>(l1);  
          list.setBounds(300,150, 250,290);  
	list.setFont(new Font("Courier", Font.BOLD, 20));
	list.setBorder(BorderFactory.createLineBorder(Color.black));
	list.setBackground(Color.pink);
	
	l2.addElement("                "+sr.getString(2));
          JList<String> list2 = new JList<>(l2);  
          list2.setBounds(550,150, 270,290);  
	list2.setFont(new Font("Courier", Font.BOLD, 20));
	list2.setBorder(BorderFactory.createLineBorder(Color.black));
	list2.setBackground(Color.pink);
	
          l.add(list);  
    
                   l.add(list2);                     
                         }
                         }catch(Exception e){System.out.println(e);} 



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
	new showwin();
	}
}