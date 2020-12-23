import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
	
class login
{
	 JFrame jf;
	 JPanel jp,jp1,jp2;
	JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,l5,jl9,jl10;
	JTextField jt,jt1,jt2,jt3,jt4;
	JButton jb,jb1,jb2;
	static String x,y,b,c,d;
	Object f;
	JComboBox jcb;
	int a;
	login()
	{
	jf=new JFrame();
         jf.setBounds(100,100,1200,600);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true); 
		
	
	jp=new JPanel();
	jf.add(jp);							//admin
	jp.setBounds(340,100,500,400);	
	jp.setLayout(null); 
	jp.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jp1=new JPanel();
	jf.add(jp1);
	jp1.setBounds(340,150,500,300);					//main	 
	jp1.setLayout(null);
	jp1.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jp.setVisible(false);	
	jp2=new JPanel();
	jf.add(jp2);							//user
	jp2.setBounds(340,70,500,450);	 
	jp2.setLayout(null);
	jp2.setBackground(new Color(.05f,.05f,.05f,0.5f));
	jp2.setVisible(false);	
	
	jl=new JLabel("User ID");
	jl.setBounds(20,80,150,20);
	jp.add(jl);
	jl.setForeground(Color.white);	
	jl.setFont(new Font("courier",Font.BOLD,22));
	jl1=new JLabel("Password");
	jl1.setBounds(20,160,150,20);
	jp.add(jl1);
	jl1.setForeground(Color.white);	
	jl1.setFont(new Font("courier",Font.BOLD,22));
	jl2=new JLabel("WELCOME Please Login");
	jl2.setBounds(170,20,350,40);
	jp.add(jl2);
	jl2.setForeground(Color.white);	
	jl2.setFont(new Font("Curlz MT",Font.BOLD,22));
	jl3=new JLabel("WELCOME Please Provide Details");
	jl3.setBounds(120,50,350,40);
	jp2.add(jl3);
	jl3.setForeground(Color.white);	
	jl3.setFont(new Font("Curlz MT",Font.BOLD,22));
	jl4=new JLabel("Enter Your Name");
	jl4.setBounds(10,120,350,40);
	jp2.add(jl4);
	jl4.setForeground(Color.white);	
	jl4.setFont(new Font("Curlz MT",Font.BOLD,22));
	jl5=new JLabel("Nick Name / AKA");
	jl5.setBounds(10,180,350,40);
	jp2.add(jl5);
	jl5.setForeground(Color.white);	
	jl5.setFont(new Font("Curlz MT",Font.BOLD,22));
	jl6=new JLabel("Enter Your Email");
	jl6.setBounds(10,240,350,40);
	jp2.add(jl6);
	jl6.setForeground(Color.white);	
	jl6.setFont(new Font("Curlz MT",Font.BOLD,22));
	jl7=new JLabel();
	jl7.setBounds(20,370,170,2);
	jp2.add(jl7);
	jl7.setBorder(BorderFactory.createLineBorder(Color.white));
	jl8=new JLabel();
	jl8.setBounds(300,370,170,2);
	jp2.add(jl8);
	jl8.setBorder(BorderFactory.createLineBorder(Color.white));
	jl9=new JLabel();
	jl9.setBounds(20,320,170,2);
	jp.add(jl9);
	jl9.setBorder(BorderFactory.createLineBorder(Color.white));
	jl10=new JLabel();
	jl10.setBounds(300,320,170,2);
	jp.add(jl10);
	jl10.setBorder(BorderFactory.createLineBorder(Color.white));
	
	jt=new JTextField();
	jt.setBounds(170,80,280,30);
	jp.add(jt);
	jt.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jt.setBackground(new Color(.05f,.05f,.05f));
	jt1=new JTextField();
	jt1.setBounds(170,160,280,30);
	jp.add(jt1);
	jt1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jt1.setBackground(new Color(.05f,.05f,.05f));
	jt.setForeground(Color.white);	
	jt1.setForeground(Color.white);	
	jt.setFont(new Font("Curlz MT",Font.BOLD,15));
	jt1.setFont(new Font("Curlz MT",Font.BOLD,15));
	
	jt2=new JTextField();
	jt2.setBounds(210,120,280,40);
	jp2.add(jt2);
	jt2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jt2.setBackground(new Color(.05f,.05f,.05f));
	jt3=new JTextField();
	jt3.setBounds(210,180,280,40);
	jp2.add(jt3);
	jt3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jt3.setBackground(new Color(.05f,.05f,.05f));
	jt4=new JTextField();
	jt4.setBounds(210,240,280,40);
	jp2.add(jt4);
	jt4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jt4.setBackground(new Color(.05f,.05f,.05f));
	jt2.setForeground(Color.white);	
	jt3.setForeground(Color.white);	
	jt4.setForeground(Color.white);	
	jt2.setFont(new Font("Curlz MT",Font.BOLD,22));
	jt3.setFont(new Font("Curlz MT",Font.BOLD,22));
	jt4.setFont(new Font("Curlz MT",Font.BOLD,22));		
	
	jcb=new JComboBox();
	jcb.setBounds(20,160,460,30);
	jp1.add(jcb);
	jcb.addItem("Please Select Type");
	jcb.addItem("ADMIN");
	jcb.addItem("USER");
	jcb.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jcb.setBackground(new Color(.05f,.05f,.05f,.5f));
	jcb.setForeground(Color.white);	
	jcb.setOpaque(true);
	jcb.setFont(new Font("Curlz MT",Font.BOLD,30));
	jcb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	ImageIcon i3=new ImageIcon("e.png");
	Image m3=i3.getImage().getScaledInstance(70,30,Image.SCALE_SMOOTH);
	i3 =new ImageIcon(m3);
	jb=new JButton(i3);
	jb.setBounds(320,220,100,30);
	jp.add(jb);
	//jb.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	jb.setBackground(new Color(.05f,.05f,.05f,1.0f));
	//jb.setForeground(Color.white);	

	ImageIcon i1=new ImageIcon("e.png");
	Image m1=i1.getImage().getScaledInstance(70,30,Image.SCALE_SMOOTH);
	i1 =new ImageIcon(m1);
	jb1=new JButton(i1);
	jb1.setBounds(400,300,70,30);
	jp2.add(jb1);
	jb1.setBackground(new Color(.05f,.05f,.05f,1.0f));
	jb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	jb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	

	

	
     jcb.addItemListener(new ItemListener()
         {
 public void itemStateChanged(ItemEvent event) {
      if (event.getStateChange()==ItemEvent.SELECTED) {
         f = event.getItem();
         if(f.equals("ADMIN"))
               {
		a=1;			
		jp.setVisible(true);
		jp1.setVisible(false);
		l5.setVisible(true);		            	

	   }										//comboboxbedroom
            else if(f.equals("USER"))
             {
		a=2;            	
                jp2.setVisible(true);
		jp1.setVisible(false);
		l5.setVisible(true);		
	}
       }
    }    
});  


jb1.addActionListener(new ActionListener ()
	{
	public void actionPerformed(ActionEvent ae)
	{
	if(jt2.getText().equals("") ||	jt3.getText().equals("")|| jt4.getText().equals(""))
	{	
	JOptionPane.showMessageDialog(jf," Please Enter The Details"); 
         }
	else
	{
	b=jt2.getText();
	c=jt3.getText();
	d=jt4.getText();
	new quiztype();
	jf.dispose();
	}
	}
	});

	 jb.addActionListener(new ActionListener()
         	{
                  public void actionPerformed(ActionEvent ae) 
                  {
                         try
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "select *from admin");
                         int f=0;
                         while(sr.next())
                         {
                               x=sr.getString(1);
                               y=sr.getString(2);
                               if(x .equals(jt.getText())) 
                               {
                                 if(y.equals(jt1.getText()))                                 
                                 { 
                                     f=1;  
                                     break; 
                                 }
                              }                                
                         } 
           if(f==1) 
{
	new admin(); 
       jf.dispose(); 
	        
}  
        else
              JOptionPane.showMessageDialog(jf," Please Enter Correct ID Or Password "); 
                        }catch(Exception e){System.out.println(e);} 
                  }      	
         });


	ImageIcon ic1=new ImageIcon("4.jpg");
	Image im1=ic1.getImage().getScaledInstance(1200,600,Image.SCALE_SMOOTH);
	ic1 =new ImageIcon(im1);
	JLabel l=new JLabel(ic1);
	l.setBounds(0,0,1200,600);
	jf.add(l);

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
		jf.dispose();
		}
		});
	


	ImageIcon ic2=new ImageIcon("j3.png");
	Image im2=ic2.getImage().getScaledInstance(50,80,Image.SCALE_SMOOTH);
	ic1=new ImageIcon(im2);
	JLabel l1=new JLabel(ic1);
	l1.setBounds(30,0,50,80);
	jp.add(l1);

	ImageIcon ic3=new ImageIcon("f2.png");
	Image im3=ic3.getImage().getScaledInstance(120,140,Image.SCALE_SMOOTH);
	ic2=new ImageIcon(im3);
	JLabel l2=new JLabel(ic2);
	l2.setBounds(190,0,120,140);
	jp1.add(l2);

	ImageIcon ic4=new ImageIcon("h1.png");
	Image im4=ic4.getImage().getScaledInstance(100,120,Image.SCALE_SMOOTH);
	ic3=new ImageIcon(im4);
	JLabel l3=new JLabel(ic3);
	l3.setBounds(10,0,100,120);
	jp2.add(l3);

	ImageIcon ic5=new ImageIcon("logo.png");
	Image im5=ic5.getImage().getScaledInstance(50,70,Image.SCALE_SMOOTH);
	ic4=new ImageIcon(im5);
	JLabel l4=new JLabel(ic4);							
	l4.setBounds(220,340,50,70);
	jp2.add(l4);
												//mid	logo
	ImageIcon ic7=new ImageIcon("logo.png");
	Image im7=ic7.getImage().getScaledInstance(50,70,Image.SCALE_SMOOTH);
	ic7=new ImageIcon(im7);
	JLabel l6=new JLabel(ic7);
	l6.setBounds(220,280,50,70);
	jp.add(l6);

	ImageIcon ic6=new ImageIcon("p.png");
	Image im6=ic6.getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH);
	ic5=new ImageIcon(im6);
	 l5=new JLabel(ic5);										//backarrow
	l5.setBounds(10,10,40,40);
	l.add(l5);
	l5.setVisible(false);
	l5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
	
   l5.addMouseListener(new MouseAdapter()
	{
	public void mouseClicked(MouseEvent r)
	{
	if(a==1)
	{
	System.out.println(a);
new login();	
jf.dispose();

	}
	else{
	System.out.println(a);
new login();	
jf.dispose();
	
	}
	}
	});
	
	jf.repaint();
	jf.revalidate();
	jp.repaint();
	jp.revalidate();
	jt.repaint();
	jt.revalidate();
	jf.setVisible(true);
	}


	

public static void main(String [] arg)
 	{
new login();
}
}