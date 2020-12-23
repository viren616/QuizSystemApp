import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.lang.Object;
import java.lang.Math;

class addques 

{
	static JFrame jf;
 	static	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	JComboBox jcb1;	
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	int a;
	JButton jb1;
	addques()
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
	

	jl1=new JLabel(" Welcome to Add Question Page ");
	l.add(jl1);
	jl1.setForeground(Color.black);
	jl1.setBounds(400,10,700,50);
	jl1.setFont(new Font("Curlz MT", Font.BOLD, 25));
	
	jl3=new JLabel("Please Select Quiz ");
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

	 jcb1=new JComboBox();
         jcb1.addItem("Select");
         l.add(jcb1);  
         jcb1.setBounds(550,80,300,30);
         jcb1.setCursor(new Cursor(Cursor.HAND_CURSOR));                                                          //combobox

     try                                                                                                                       //jcombobox
                        {
                             Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                       Statement st=con.createStatement();
                       ResultSet sr=st.executeQuery( "show tables");
                         while(sr.next())  
                         {
                               jcb1.addItem(sr.getString(1));                                  
                         }
                         }catch(Exception e){System.out.println(e);} 



	jl4=new JLabel("Question ID ");
	jl4.setForeground(Color.black);
	jl4.setBounds(20,70,1000,50);
	jl4.setFont(new Font("Curlz MT", Font.BOLD, 25));
    	tf1=new JTextField();  
    	tf1.setBounds(190,70, 50,40);  
	tf1.setEditable(false);

	jl5=new JLabel("Enter Your Question");
	jl5.setForeground(Color.black);
	jl5.setBounds(20,130,1000,50);
	jl5.setFont(new Font("Curlz MT", Font.BOLD, 25));
    	tf2=new JTextField();  
    	tf2.setBounds(270,130, 800,70);  
	
	jl6=new JLabel("Enter Your Options ");
	jl6.setForeground(Color.black);
	jl6.setBounds(20,230,400,70);
	jl6.setFont(new Font("Curlz MT", Font.BOLD, 25));   	

    	tf3=new JTextField();  
    	tf3.setBounds(300,230,150,40);  
    	tf4=new JTextField();  
    	tf4.setBounds(880,230, 150,40);  

  	tf5=new JTextField();  
    	tf5.setBounds(300,330,150,40);  
    	tf6=new JTextField();  
    	tf6.setBounds(880,330, 150,40);  

	jl7=new JLabel("Enter Answer");
	jl7.setForeground(Color.black);
	jl7.setBounds(20,400,400,70);
	jl7.setFont(new Font("Curlz MT", Font.BOLD, 25));
 	tf7=new JTextField();  
    	tf7.setBounds(600,400, 150,40);  



			l.add(jl4);  
			l.add(jl5);
			l.add(jl6);
			l.add(jl7);
      		 	l.add(tf1);   
  		 	l.add(tf2);
			l.add(tf3);   
  		 	l.add(tf4);
			l.add(tf5);   
		 	l.add(tf6);
		 	l.add(tf7);
                        jl4.setVisible(false);     
			jl5.setVisible(false);
			jl6.setVisible(false);
                	jl7.setVisible(false);
                        tf1.setVisible(false);     
			tf2.setVisible(false);
			tf3.setVisible(false);
                        tf4.setVisible(false);     
			tf5.setVisible(false);
			tf6.setVisible(false);	    
			tf7.setVisible(false);
		tf1.setFont(new Font("Curlz MT", Font.BOLD, 20));
		tf2.setFont(new Font("Curlz MT", Font.BOLD, 20));
		tf3.setFont(new Font("Curlz MT", Font.BOLD, 20));
		tf4.setFont(new Font("Curlz MT", Font.BOLD, 20));
		tf5.setFont(new Font("Curlz MT", Font.BOLD, 20));
		tf6.setFont(new Font("Curlz MT", Font.BOLD, 20));
		tf7.setFont(new Font("Curlz MT", Font.BOLD, 20));

			
	jb1=new JButton("Submit");
	jb1.setForeground(Color.black);
	jb1.setBounds(800,500,180,30);
	jb1.setFont(new Font("Curlz MT", Font.BOLD, 20));
	l.add(jb1);
	jb1.setVisible(false);
	    
	
      jcb1.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                    {     

                          try
                        {  
			
     			try                                                                                                                 //jcombobox
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren"); 
                            Statement st=con.createStatement();
                       	    ResultSet sr=st.executeQuery( "select * from "+jcb1.getSelectedItem()+"  ");
                         while(sr.next())  
                         {
	               	 a=Integer.parseInt(sr.getString(1));
			 }
			a=a+1;
       			tf1.setText(a+" ");
		        
                        }catch(Exception e){System.out.println(e);} 
                        jcb1.setVisible(false);     
			jl3.setVisible(false);
			l3.setVisible(false);	
	        jl4.setVisible(true);     
			jl5.setVisible(true);
			jl6.setVisible(true);	
			jl7.setVisible(true);
                
                        tf1.setVisible(true);     
			tf2.setVisible(true);
			tf3.setVisible(true);
                        tf4.setVisible(true);     
			tf5.setVisible(true);
			tf6.setVisible(true);
			tf7 .setVisible(true);
			jb1.setVisible(true);
                   }catch(Exception e){System.out.println(e);}                       
                 }      	
         });

 
     jb1.addActionListener(new ActionListener()
         {
                  public void actionPerformed(ActionEvent ae) 
                      {      
             try
                        {

                                if (tf2.getText().equals(""))  
                                 {
		JOptionPane.showMessageDialog(jf, "Please Enter Question First");
                              }  
                              else if(tf3.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Enter Option 1 ");

                         else  if(tf4.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Enter Option 2");
                         
                         else  if(tf5.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Enter Option 3");


                               else  if(tf6.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Enter Option 4");

                                else if(tf7.getText().equals(""))
                                   JOptionPane.showMessageDialog(jf, "Please Enter Answer");

			else{       
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");     
                            PreparedStatement pt=con.prepareStatement("insert into "+jcb1.getSelectedItem()+" values(?,?,?,?,?,?,?)");                           
                System.out.println(jcb1.getSelectedItem());
		 pt.setString(1,tf1.getText());       
		  pt.setString(2,tf2.getText());               
 		pt.setString(3,tf3.getText());
                 pt.setString(4,tf4.getText());
                pt.setString(5,tf5.getText());
                pt.setString(6,tf6.getText());
    		pt.setString(7,tf7.getText());
                                pt.executeUpdate();


              JOptionPane.showMessageDialog(jf," Update Sucessfully ");   
	}                                  
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
	new addques();
	}
}