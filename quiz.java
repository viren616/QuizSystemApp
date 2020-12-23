import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.io.IOException;


class quiz extends Thread

{
	 JFrame jf;
	JRadioButton r1,r2,r3,r4;    
	ButtonGroup bg;
	String y;
	static JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
	String ques,opt1,opt2,opt3,opt4,ans,val1,val2,val3,val4,non;
	JButton b1,b2;
	JPanel jp,jp1,jp2,jp3;
	static int x=1,k,j,f,n=1,z=0;
	int i=1;	
	quiz()
	 {
       	jf=new JFrame();
         jf.setBounds(100,100,1200,600);
         jf.setLayout(null);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setUndecorated(true); 

	jp2=new JPanel();
	jp2.setLayout(null);
	jp2.setBounds(0,0,1370,770);				//main
	jf.add(jp2);
	jp2.setBorder(BorderFactory.createLineBorder(Color.black));
	jp2.setBackground(new Color(102,0,153));


	jp1=new JPanel();
	jp1.setBounds(1000,10,190,50);				//time					
	jp2.add(jp1);
	jp1.setForeground(Color.white);
        jp1.setBorder(BorderFactory.createLineBorder(Color.white));
	jp1.setBackground(new Color(102,0,153));

/*	jp3=new JPanel();					//container
	jp3.setLayout(null);
	jp3.setBounds(200,70,800,200);
	jp2.add(jp3);
        jp3.setBackground(new Color(153,102,0));	
        jp3.setBorder(BorderFactory.createLineBorder(Color.black));
	
*/         

	JTextArea ta=new JTextArea();
	ta.setBounds(200,70,800,200);
	ta.setEnabled(false);
	ta.setLineWrap(true);
	jp2.add(ta);
	 ta.setBackground(new Color(153,102,0));
	ta.setFont(new Font("Courier", Font.BOLD, 22));	
	
	jl1=new JLabel();
	//ta.add(jl1);//jp3.add(jl1);
	jl1.setForeground(Color.white);
	jl1.setBounds(50,0,1000,100);
	jl1.setFont(new Font("Courier", Font.BOLD, 18));
	jl2=new JLabel();					//question
	jl2.setForeground(Color.white);
	jl2.setFont(new Font("Courier", Font.BOLD, 22));	
	jp2.add(jl2);
	jl2.setBounds(30,90,100,100);
	jl2.setBackground(new Color(153,102,0));	
	jl2.setOpaque(true);
	jl2.setBorder(BorderFactory.createLineBorder(Color.white));
	
	


	jl3=new JLabel("Time:");
	jp1.add(jl3);
	jl3.setForeground(Color.white);
	jl3.setBounds(0,20,50,20);
	jl4=new JLabel("0");
	jp1.add(jl4);







	jl4.setBounds(0,20,20,20);
	jl7=new JLabel(":");
	jp1.add(jl7);
	jl7.setBounds(0,20,20,20);			//time
	jl5=new JLabel("0");
	jp1.add(jl5);
	jl5.setBounds(0,20,20,20);
	jl8=new JLabel(":");
	jp1.add(jl8);
	jl8.setBounds(0,20,20,20);	
	jl6=new JLabel("0");
	jp1.add(jl6);
	jl6.setBounds(0,20,20,20);
	
	jl9=new JLabel(" JAVA QUIZ ");
	jl9.setBounds(10,10,190,50);
	jp2.add(jl9);
	jl9.setFont(new Font("Courier", Font.BOLD, 26));
	jl9.setForeground(Color.white);
        jl9.setBorder(BorderFactory.createLineBorder(Color.white));
	jl4.setForeground(Color.white);
	jl7.setForeground(Color.white);
	jl8.setForeground(Color.white);
	jl5.setForeground(Color.white);
	jl6.setForeground(Color.white);
	
	jl11=new JLabel(" A");
	jp2.add(jl11);
	jl11.setBounds(200,300,70,100);
  	jl11.setBackground(new Color(153,102,0));	
	jl11.setOpaque(true);
	jl11.setFont(new Font("Courier", Font.BOLD, 36));
	jl11.setBorder(BorderFactory.createLineBorder(Color.black));
	r1=new JRadioButton();
	r1.setBounds(280,300,300,100);
	jp2.add(r1);	
	r1.setBackground(new Color(0,102,20));	
	r1.setBorder(BorderFactory.createLineBorder(Color.white));
	r1.setFont(new Font("Courier", Font.BOLD, 20));
	r1.setForeground(Color.white);	
	r1.setBorder (BorderFactory.createRaisedBevelBorder ());
	r1.setBorderPainted (true);
		

	jl12=new JLabel(" B");
	jp2.add(jl12);
	jl12.setBounds(590,300,70,100);
	jl12.setBackground(new Color(153,102,0));	
	jl12.setOpaque(true);
	jl12.setFont(new Font("Courier", Font.BOLD, 36));
	jl12.setBorder(BorderFactory.createLineBorder(Color.black));
	r2=new JRadioButton();
	r2.setBounds(670,300,330,100);
	jp2.add(r2);	
	r2.setBackground(new Color(102,51,0));	
	r2.setFont(new Font("Courier", Font.BOLD, 20));
	r2.setForeground(Color.white);	
	r2.setBorder (BorderFactory.createRaisedBevelBorder ());
	r2.setBorderPainted (true);
	
	jl13=new JLabel(" C");
	jp2.add(jl13);
	jl13.setBounds(200,420,70,100);
	jl13.setBackground(new Color(153,102,0));	
	jl13.setOpaque(true);
	jl13.setFont(new Font("Courier", Font.BOLD, 36));
	jl13.setBorder(BorderFactory.createLineBorder(Color.black));
	r3=new JRadioButton();
	r3.setBounds(280,420,300,100);
	jp2.add(r3);	
	r3.setBackground(new Color(255,0,40));	
	r3.setFont(new Font("Courier", Font.BOLD, 20));
	r3.setForeground(Color.white);	
	r3.setBorder (BorderFactory.createRaisedBevelBorder ());
	r3.setBorderPainted (true); 
	
	jl14=new JLabel(" D");
	jp2.add(jl14);
	jl14.setBounds(590,420,70,100);
	jl14.setBackground(new Color(153,102,0));	
	jl14.setOpaque(true);
	jl14.setFont(new Font("Courier", Font.BOLD, 36));
	jl14.setBorder(BorderFactory.createLineBorder(Color.black));
	r4=new JRadioButton();
	r4.setBounds(670,420,330,100);
	jp2.add(r4);	
	r4.setBackground(new Color(150,0,255));	
	r4.setFont(new Font("Courier", Font.BOLD, 20));
	r4.setForeground(Color.white);	
	r4.setBorder (BorderFactory.createRaisedBevelBorder ());
	r4.setBorderPainted (true);
	jl11.setForeground(new Color(0,102,20));
	jl12.setForeground(new Color(102,51,0));
	jl13.setForeground(new Color(255,0,40));
	jl14.setForeground(new Color(150,0,255));	

	bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	bg.add(r4);

	b1=new JButton("Next");
	b1.setBounds(800,540,200,50);
	jp2.add(b1);	
	b2=new JButton("Back");
	b2.setBounds(580,540,200,50);
	jp2.add(b2);	
	b1.setBackground(new Color(153,102,0));	
	b2.setBackground(new Color(153,102,0));	
	b2.setBorder(BorderFactory.createLineBorder(Color.black));
	b1.setBorder(BorderFactory.createLineBorder(Color.black));
	b1.setForeground(Color.white);
	b2.setForeground(Color.white);
	r1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	r2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	r3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	r4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


int q=1;


	JPanel jp=new JPanel();
            jp.setLayout(new GridLayout(50,3 ));    
            for(i=1;i<=3;i++)

            {
                   for(j=1;j<=50;j++)
			
	{
		jp.add(new JButton(q+""));
                         q++;
			}
                        
            }
            JScrollPane jsp=new JScrollPane(jp);
//            jf.add(jsp);              
            jsp.setBounds(860,0,500,600);


      try    {
                          
                          Class.forName("com.mysql.jdbc.Driver");
 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement(quiztype.h);
                                                               pt.setString(1,x+"");
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
				non=(sr.getString(1));
                                ques=(sr.getString(2)); 
				opt1=(sr.getString(3)); 
				opt2=(sr.getString(4)); 
				opt3=(sr.getString(5)); 
				opt4=(sr.getString(6)); 
				ans=(sr.getString(7));			                                 
                        	jl2.setText("   "+non);
				//jl1.setText(ques);
				ta.setText(ques);
			
				r1.setText(opt1);
				r2.setText(opt2);
				r3.setText(opt3);
				r4.setText(opt4);
				

                         }
                         }catch(Exception e){System.out.println(e);} 

         

	val1=(r1.getText());
	val2=(r2.getText());
	val3=(r3.getText());
	val4=(r4.getText());


b2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent lk)
		{
	x--;
	n--;
	z--;
	if(z<0){
	z=0;
	}
	
   try    {
                          
                          Class.forName("com.mysql.jdbc.Driver");
 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement(quiztype.h);
                                                               pt.setString(1,x+"");
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
				non=(sr.getString(1));
                                ques=(sr.getString(2)); 
				opt1=(sr.getString(3)); 
				opt2=(sr.getString(4)); 
				opt3=(sr.getString(5)); 
				opt4=(sr.getString(6)); 
				ans=(sr.getString(7));			                                 
                        	jl2.setText("   "+non);
				//jl1.setText(ques);
				ta.setText(ques);
				r1.setText(opt1);
				r2.setText(opt2);
				r3.setText(opt3);
				r4.setText(opt4);
				
                                                    jf.repaint();

						jp2.repaint();
							
                         }
                         }catch(Exception e){System.out.println(e);} 
	val1=(r1.getText());
	val2=(r2.getText());
	val3=(r3.getText());
	val4=(r4.getText());

		}	
	});

	

 b1.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
             {		 
		x++;	
	 	
	if(x==11)
	{
	JOptionPane.showMessageDialog(jf,"You have completed the Quiz"); 
	new score();	
	jf.dispose();
	}
	bg.clearSelection();	
	try{
          Class.forName("com.mysql.jdbc.Driver");
 	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","viren");   
            Statement stmt = connection.createStatement();
              PreparedStatement pt=connection.prepareStatement(quiztype.h);
                                                               pt.setString(1,x+"");
			ResultSet sr=pt.executeQuery();                                      
                         while(sr.next())  
                         {
				non=(sr.getString(1));
                                ques=(sr.getString(2)); 
				opt1=(sr.getString(3)); 
				opt2=(sr.getString(4)); 
				opt3=(sr.getString(5)); 
				opt4=(sr.getString(6)); 
				ans=(sr.getString(7));			                                 
                        	jl2.setText("   "+non);
			//	jl1.setText(ques);
				ta.setText(ques);
				r1.setText(opt1);
				r2.setText(opt2);
				r3.setText(opt3);
				r4.setText(opt4);

				
                                                    jf.repaint();

						jp2.repaint();
                         }

	val1=(r1.getText());
	val2=(r2.getText());
	val3=(r3.getText());
	val4=(r4.getText());

                         }catch(Exception f){System.out.println(f);} 
		 
}
});



	 b1.addActionListener(new ActionListener()
           {
             public void actionPerformed(ActionEvent ae)
               {
				
                                                    jf.repaint();

						jp2.repaint();


        if (n==Integer.parseInt(non))
        {
                if((r1.isSelected()==true) && (val1.equals(ans)))
		{
	         System.out.println("1"); 
			
			z++;
	        }	
		else if((r2.isSelected()==true) && (val2.equals(ans)))
		{
			System.out.println("2");
			z++;
		
		}
		else if((r3.isSelected()==true) && (val3.equals(ans)))
		{
	
		
		System.out.println("3");
			z++;	
	}
		else if((r4.isSelected()==true) && (val4.equals(ans)))
		{
	
	System.out.println("3");
			z++;
	
	}			
	n++;
		}
	
	}
	});


	 ImageIcon ic1 = new ImageIcon("q.png");

        Image im1 = ic1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        ic1 = new ImageIcon(im1);


        JLabel l1 = new JLabel(ic1);

        l1.setBounds(30,300,100,100);

      	 jp2.add(l1);



	 ImageIcon ic2 = new ImageIcon("j2.png");

        Image im2 = ic2.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);

        ic2 = new ImageIcon(im2);


        JLabel l2 = new JLabel(ic2);

        l2.setBounds(1000,200,200,150);

      	 jp2.add(l2);



	 ImageIcon ic3 = new ImageIcon("h.png");

        Image im3 = ic3.getImage().getScaledInstance(200, 70, Image.SCALE_SMOOTH);

        ic3 = new ImageIcon(im3);


        JLabel l3 = new JLabel(ic3);

        l3.setBounds(200,0,200,70);

      	 jp2.add(l3);



	ImageIcon ic11=new ImageIcon("c.png");
	Image im11=ic11.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH);
	ic11=new ImageIcon(im11);
	JLabel l11=new JLabel(ic11);
	l11.setBounds(1160,70,30,30);
	jp2.add(l11);
	l11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	
	l11.addMouseListener(new MouseAdapter()
		{
		public void mouseClicked (MouseEvent e)
			{
              new quiztype();
		jf.dispose();
		}
		});
	

	jf.setVisible(true); 
        }
		
	public static void main(String [] ar)

	{
	new quiz();
      	new right().display();

	}
}


	class right extends Thread
	{
	public void display()
  	 {

	  int i=0;
         while(i<=60)
         {
                try
                {
                  Thread.sleep(1000);
                }catch(Exception  e){}
             quiz.jl6.setText(i+" ");
                i++;
		if(i==60)
		{
	int in=Integer.parseInt(quiz.jl5.getText());
	in++;
	quiz.jl5.setText(in+"");
	if(in==60)
	{
	in=0;
	quiz.jl5.setText(in+"");
	if(in==0)
	{
	int ini=Integer.parseInt(quiz.jl4.getText());
	ini++;
	quiz.jl4.setText(ini+"");
	if(ini==2)
	{

	}
	}
	}
	display();
		}
		}
	}	
}