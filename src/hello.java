import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
class TicTactoeGame{
    public static void main(String args[])
    {
        JFrame f=new JFrame("water park");
        JLabel l1=new JLabel();
        l1.setIcon(new ImageIcon("D:\\wt1.jpg"));
        Dimension size = l1.getPreferredSize();
        l1.setBounds(0,0,1400,900);
        f.add(l1);
        //f.getContentPane().setBackground(Color.GREEN);
        JLabel l=new JLabel(" M.R WATER PARK , PATNA");
        l.setBounds(300,10,1000,100);
        l.setFont(new Font("serif",Font.BOLD,60));
        l.setForeground(Color.black);
        JLabel l0=new JLabel(" PRESENTED BY:- RAVI KUMAR");
        l0.setBounds(390,235,700,80);
        l0.setFont(new Font("algerian",Font.BOLD,35));
        l0.setForeground(Color.red);
        JLabel l3=new JLabel(" PRESENTED BY:- MOHIT KUMAR");
        l3.setBounds(390,160,700,80);
        l3.setFont(new Font("algerian",Font.BOLD,35));
        l3.setForeground(Color.BLACK);
        JButton b=new JButton("OK");
        b.setFont(new Font ("serif",Font.BOLD,25));
        b.setBounds(600,550,90,75);
        f.add(b);
        f.setSize(1400,1400);
        f.setLayout(null);
        f.setVisible(true);
        l1.add(l);
        l1.add(l0);
        l1.add(l3);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame f2=new JFrame("hello");
                f2.getContentPane().setBackground(Color.green);
                JLabel l=new JLabel("(1) TICKET BOOKING");
                JButton bu=new JButton("GO");
                bu.setFont(new Font ("serif",Font.BOLD,25));
                bu.setBounds(890,89,90,75);
                f2.add(bu);

                bu.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JFrame f3=new JFrame("hello");

                        //TO ADD THE BOUTTON (PAY MOD)
                        JButton b5=new JButton("PAY");
                        b5.setFont(new Font ("serif",Font.BOLD,25));
                        b5.setBounds(650,500,90,75);
                        f3.add(b5);

                        //TO ADD THE QR COD OF BUTTON PAY
                        b5.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                JFrame f0=new JFrame("hello");JLabel l1=new JLabel();
                                l0.setIcon(new ImageIcon("D:\\mohit2.jpg"));
                                Dimension size = l0.getPreferredSize();
                                l0.setBounds(400,100,750,600);

                                //button in QR pay
                                JButton bm=new JButton("OK");
                                bm.setFont(new Font ("serif",Font.BOLD,25));
                                bm.setBounds(1050,330,90,75);
                                f0.add(bm);

                                bm.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        JFrame f01=new JFrame("WATER PARK");
                                        JLabel l1=new JLabel();
                                        f01.getContentPane().setBackground(Color.GREEN);
                                        //f.getContentPane().setBackground(Color.GREEN);
                                        JLabel l=new JLabel("WELCOME TO M.R WATER PARK , PATNA");
                                        l.setBounds(300,10,1000,80);
                                        l.setFont(new Font("serif",Font.BOLD,40));
                                        l.setForeground(Color.RED);
                                        JLabel l2=new JLabel("YOUR TICKET HAS BEEN CONFIRMED.");
                                        l2.setBounds(300,200,1000,250);
                                        l2.setFont(new Font("serif",Font.BOLD,40));
                                        l2.setForeground(Color.WHITE);

                                        JLabel l3=new JLabel("PAYMENT SUCCESSFUL");
                                        l3.setBounds(435,130,1000,160);
                                        l3.setFont(new Font("serif",Font.BOLD,40));
                                        l3.setForeground(Color.BLACK);


                                        JLabel l4=new JLabel("THANK YOU");
                                        l4.setBounds(540,400,1000,160);
                                        l4.setFont(new Font("serif",Font.BOLD,50));
                                        l4.setForeground(Color.BLUE);

                                        f01.add(l);
                                        f01.add(l3);
                                        f01.add(l4);
                                        f01.add(l2);
                                        f01.setSize(1400,1400);
                                        f01.setLayout(null);
                                        f01.setVisible(true);
                                        bm.add(f01);
                                    }});


                                //To add the lable in fo page

                                JLabel m=new JLabel("ONLINE PAYMENT SCANNER");
                                m.setBounds(400,10,600,80);
                                m.setFont(new Font("serif",Font.BOLD,40));
                                m.setForeground(Color.red);



          /*JButton b5=new JButton("OK");
         b5.setFont(new Font ("serif",Font.BOLD,25));
         b5.setBounds(650,500,90,75);
         f0.add(b5);*/

                                f0.add(m);
                                f0.add(l0);
                                f0.getContentPane().setBackground(Color.green);
                                f0.setSize(1400,1400);
                                f0.setLayout(null);
                                f0.setVisible(true);
                                b5.add(f0);
                            }});

                        f3.getContentPane().setBackground(Color.green);
                        //to add the lable f3 (1)
                        JLabel la=new JLabel("(1) NAME");
                        la.setBounds(270,80,600,80);
                        la.setFont(new Font("serif",Font.BOLD,37));
                        la.setForeground(Color.red);
                        f3.add(la);

                        //ADD THE TEXTFILD F3 (1)
                        TextField t=new TextField();
                        t.setBounds(850,89,400,50);
                        t.setBackground(Color.PINK);
                        t.setFont(new Font ("serif",Font.BOLD,40));
                        t.getText();
                        f3.add(t);

                        //to add the lable f3 (2)
                        JLabel la1=new JLabel("(2) MOBILE NO.");
                        la1.setBounds(270,170,600,80);
                        la1.setFont(new Font("serif",Font.BOLD,37));
                        la1.setForeground(Color.BLUE);
                        f3.add(la1);

                        //ADD THE TEXTFILD F3 (2)
                        TextField t1=new TextField();
                        t1.setBounds(850,180,400,50);
                        t1.setBackground(Color.PINK);
                        t1.setFont(new Font ("serif",Font.BOLD,40));
                        t1.getText();
                        f3.add(t1);

                        //to add the lable f3 (3)
                        JLabel la2=new JLabel("(3) NUMBER OF TICKET");
                        la2.setBounds(270,260,600,80);
                        la2.setFont(new Font("serif",Font.BOLD,37));
                        la2.setForeground(Color.MAGENTA);
                        f3.add(la2);

                        //ADD THE TEXTFILD F3 (3)
                        TextField t2=new TextField();
                        t2.setBounds(850,270,400,50);
                        t2.setBackground(Color.PINK);
                        t2.setFont(new Font ("serif",Font.BOLD,40));
                        t2.getText();
                        f3.add(t2);

                        //to add the lable f3 (4)
                        JLabel la3=new JLabel("(4) DATE OF BOOKING");
                        la3.setBounds(270,340,600,80);
                        la3.setFont(new Font("serif",Font.BOLD,37));
                        la3.setForeground(Color.BLACK);
                        f3.add(la3);

                        //ADD THE TEXTFILD F3 (4)
                        TextField t3=new TextField();
                        t3.setBounds(850,350,400,50);
                        t3.setBackground(Color.PINK);
                        t3.setFont(new Font ("serif",Font.BOLD,40));
                        t3.getText();
                        f3.add(t3);



                        f3.setSize(1400,1400);
                        f3.setLayout(null);
                        f3.setVisible(true);
                        bu.add(f3);
                    }});

        /*TextField t=new TextField();
        t.setBounds(750,89,400,50);
        t.setBackground(Color.PINK);
        t.setFont(new Font ("serif",Font.BOLD,28));
        t.getText();
        f3.add(t);*/

                l.setBounds(300,80,600,80);
                l.setFont(new Font("serif",Font.BOLD,37));
                l.setForeground(Color.RED);
                f2.setSize(1400,1400);
                f2.setLayout(null);
                f2.setVisible(true);
                f2.add(l);

                //start ticket cancle

                JLabel l1=new JLabel("(3)  CANCLE TICKET NUMBER ");
                l1.setBounds(300,200,600,80);
                l1.setFont(new Font("serif",Font.BOLD,37));
                l1.setForeground(Color.BLUE);
                f2.add(l1);

                JButton b1=new JButton("GO");
                b1.setFont(new Font ("serif",Font.BOLD,25));
                b1.setBounds(890,200,90,75);
                f2.add(b1);

                //add action button
                b1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JFrame z=new JFrame("hello");JLabel l1=new JLabel();
                        z.getContentPane().setBackground(Color.green);
                        Dimension size = l0.getPreferredSize();
                        l0.setBounds(400,100,750,600);
                        //to add the lable f3 (1)
                        JLabel c=new JLabel("(1) NAME");
                        c.setBounds(270,80,600,80);
                        c.setFont(new Font("serif",Font.BOLD,37));
                        c.setForeground(Color.red);
                        z.add(c);

                        //ADD THE TEXTFILD F3 (1)
                        TextField t=new TextField();
                        t.setBounds(850,89,400,50);
                        t.setBackground(Color.PINK);
                        t.setFont(new Font ("serif",Font.BOLD,40));
                        t.getText();
                        z.add(t);

                        //TICKET CANCLE DATE

                        JLabel c1=new JLabel("(2) MOBILE NO.");
                        c1.setBounds(270,170,600,80);
                        c1.setFont(new Font("serif",Font.BOLD,37));
                        c1.setForeground(Color.BLUE);
                        z.add(c1);

                        //ADD THE TEXTFILD z (2)
                        TextField t1=new TextField();
                        t1.setBounds(850,180,400,50);
                        t1.setBackground(Color.PINK);
                        t1.setFont(new Font ("serif",Font.BOLD,40));
                        t1.getText();
                        z.add(t1);

                        JLabel la3=new JLabel("(3) DATE OF BOOKING");
                        la3.setBounds(270,260,600,80);
                        la3.setFont(new Font("serif",Font.BOLD,37));
                        la3.setForeground(Color.MAGENTA);
                        z.add(la3);

                        //ADD THE TEXTFILD F3 (3)
                        TextField t3=new TextField();
                        t3.setBounds(850,270,400,50);
                        t3.setBackground(Color.PINK);
                        t3.setFont(new Font ("serif",Font.BOLD,40));
                        t3.getText();
                        z.add(t3);

                        JLabel la4=new JLabel("(4)  DATE OF CANCLE");
                        la4.setBounds(270,340,600,80);
                        la4.setFont(new Font("serif",Font.BOLD,37));
                        la4.setForeground(Color.BLACK);
                        z.add(la4);

                        //ADD THE TEXTFILD F3 (4)
                        TextField ta4=new TextField();
                        ta4.setBounds(850,350,400,50);
                        ta4.setBackground(Color.PINK);
                        ta4.setFont(new Font ("serif",Font.BOLD,40));
                        ta4.getText();
                        z.add(ta4);

                        //ADD THE NEXT BUTTON OK
                        JButton b=new JButton("OK");
                        b.setFont(new Font ("serif",Font.BOLD,25));
                        b.setBounds(650,550,100,95);
                        z.add(b);

                        //cancle ok big
                        b.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                JFrame z1=new JFrame("hello");
                                z1.getContentPane().setBackground(Color.GREEN);

                                //to add the CHOICE LABLE

                                JLabel c=new JLabel("(1) CANCELLATION REASON");
                                c.setBounds(250,80,600,80);
                                c.setFont(new Font("serif",Font.BOLD,37));
                                c.setForeground(Color.red);
                                z1.add(c);

                                Choice c1=new Choice();
                                c1.add("REASON FOR CANCELLATION");
                                c1.add("I HAVE CHANGE MY MIND");
                                //c1.add("china");
                                c1.add("THE WEATHER IS COLD");
                                c1.add("TIME IS NOT GOOD");
                                c1.setBounds(850,90,430,95);
                                c1.setFont(new Font("Arial",Font.BOLD,25));
                                z1.add(c1);

                                //MONEY REFONDING NUMBER
                                JLabel c2=new JLabel("(2) MONEY REFUNDING NUMBER");
                                c2.setBounds(215,170,600,80);
                                c2.setFont(new Font("serif",Font.BOLD,30));
                                c2.setForeground(Color.BLUE);
                                z1.add(c2);

                                //ADD THE TEXTFILD z (2)
                                TextField t1=new TextField();
                                t1.setBounds(850,180,400,50);
                                t1.setBackground(Color.PINK);
                                t1.setFont(new Font ("serif",Font.BOLD,40));
                                t1.getText();
                                z1.add(t1);
                                //TO ADD THE BUTTON
                                JButton d=new JButton("OK");
                                d.setFont(new Font ("serif",Font.BOLD,25));
                                d.setBounds(650,550,100,95);
                                z1.add(d);

                                d.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        JFrame z2=new JFrame("hello");
                                        z2.getContentPane().setBackground(Color.GREEN);

                                        JLabel l=new JLabel("BRTTER LUCK NEXT TIME");
                                        l.setBounds(400,10,1000,80);
                                        l.setFont(new Font("serif",Font.BOLD,40));
                                        l.setForeground(Color.RED);
                                        JLabel l2=new JLabel("YOUR TICKET HAS BEEN CANCEL.");
                                        l2.setBounds(350,200,1000,250);
                                        l2.setFont(new Font("serif",Font.BOLD,40));
                                        l2.setForeground(Color.WHITE);

                                        JLabel l3=new JLabel(" YOUR PAYMENT REFUND SUCCESSFUL");
                                        l3.setBounds(290,130,1000,160);
                                        l3.setFont(new Font("serif",Font.BOLD,40));
                                        l3.setForeground(Color.BLACK);


                                        JLabel l4=new JLabel("THANK YOU");
                                        l4.setBounds(540,400,1000,160);
                                        l4.setFont(new Font("serif",Font.BOLD,50));
                                        l4.setForeground(Color.BLUE);


                                        z2.add(l);
                                        z2.add(l2);
                                        z2.add(l3);
                                        z2.add(l4);

                                        z2.setSize(1400,1400);
                                        z2.setLayout(null);
                                        z2.setVisible(true);

                                    }});


                                //ADD THE TEXTFILD F3 (1)
        /*TextField t=new TextField();
        t.setBounds(850,89,400,50);
        t.setBackground(Color.PINK);
        t.setFont(new Font ("serif",Font.BOLD,40));
        t.getText();
          z1.add(t);*/


                                z1.setSize(1400,1400);
                                z1.setLayout(null);
                                z1.setVisible(true);

                            }});



                        z.setSize(1400,1400);
                        z.setLayout(null);
                        z.setVisible(true);
                        b1.add(z);


                    }});


                //stop

                // TO ADD THE LAVALE
                //START 2
                JLabel l2=new JLabel("(3) EXPANDED REGISTRATION");
                l2.setBounds(300,325,600,80);
                l2.setFont(new Font("serif",Font.BOLD,37));
                l2.setForeground(Color.YELLOW);
                f2.add(l2);

                // TO ADD BOUTTON L2
                JButton b2=new JButton("GO");
                b2.setFont(new Font ("serif",Font.BOLD,25));
                b2.setBounds(890,325,90,75);
                f2.add(b2);

                b2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JFrame f=new JFrame("hello");
                        f.getContentPane().setBackground(Color.GREEN);

                        JLabel la=new JLabel("(1) DATE");
                        la.setBounds(270,80,600,80);
                        la.setFont(new Font("serif",Font.BOLD,37));
                        la.setForeground(Color.red);
                        f.add(la);

                        //ADD THE TEXTFILD F3 (1)
                        TextField t=new TextField();
                        t.setBounds(850,89,400,50);
                        t.setBackground(Color.PINK);
                        t.setFont(new Font ("serif",Font.BOLD,40));
                        t.getText();
                        f.add(t);

                        //to add the lable f3 (2)
                        JLabel la1=new JLabel("(2) NUMBER OF SEET");
                        la1.setBounds(270,170,600,80);
                        la1.setFont(new Font("serif",Font.BOLD,37));
                        la1.setForeground(Color.BLUE);
                        f.add(la1);

                        //ADD THE TEXTFILD F3 (2)
                        TextField t1=new TextField();
                        t1.setBounds(850,180,400,50);
                        t1.setBackground(Color.PINK);
                        t1.setFont(new Font ("serif",Font.BOLD,40));
                        t1.getText();
                        f.add(t1);

                        //to add the lable f3 (3)
                        JLabel la2=new JLabel("(3) DISCOUNT");
                        la2.setBounds(270,260,600,80);
                        la2.setFont(new Font("serif",Font.BOLD,37));
                        la2.setForeground(Color.MAGENTA);
                        f.add(la2);

                        //ADD THE TEXTFILD F3 (3)
                        TextField t2=new TextField();
                        t2.setBounds(850,270,400,50);
                        t2.setBackground(Color.PINK);
                        t2.setFont(new Font ("serif",Font.BOLD,40));
                        t2.getText();
                        f.add(t2);

                        //to add the lable f3 (4)
                        JLabel la3=new JLabel("(4) REFERENCE");
                        la3.setBounds(270,340,600,80);
                        la3.setFont(new Font("serif",Font.BOLD,37));
                        la3.setForeground(Color.BLACK);
                        f.add(la3);

                        //to add the button

                        JButton da=new JButton("OK");
                        da.setFont(new Font ("serif",Font.BOLD,25));
                        da.setBounds(650,550,100,95);
                        f.add(da);

                        da.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                JFrame f2=new JFrame("hello");
                                f2.getContentPane().setBackground(Color.GREEN);

                                JLabel l=new JLabel(" M.R WATER PARK , PATNA");
                                l.setBounds(300,10,1000,100);
                                l.setFont(new Font("serif",Font.BOLD,60));
                                l.setForeground(Color.blue);

                                //to add the lable expendad rejishtation

                                JLabel c=new JLabel("(1) MODE OF PAYMENT");
                                c.setBounds(250,200,600,80);
                                c.setFont(new Font("serif",Font.BOLD,37));
                                c.setForeground(Color.red);
                                f2.add(c);

                                //to add the choise button
                                Choice c1=new Choice();
                                c1.add("MODE OF PAYMENT");
                                c1.add("ADVANCE PAYMRNT");
                                //c1.add("china");
                                c1.add("FULL PAYMENT");
                                c1.setBounds(850,235,430,95);
                                c1.setFont(new Font("Arial",Font.BOLD,25));

                                //T0 ADD THE LABLE
                                JLabel c2=new JLabel("(2) TYPE OF PAYMENT");
                                c2.setBounds(250,350,600,80);
                                c2.setFont(new Font("serif",Font.BOLD,37));
                                c2.setForeground(Color.red);
                                f2.add(c2);
                                //payment button
                                JButton e2=new JButton("PAY");
                                e2.setFont(new Font ("serif",Font.BOLD,25));
                                e2.setBounds(650,550,100,95);
                                f2.add(e2);

                                e2.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        JFrame k=new JFrame("hello");
                                        k.getContentPane().setBackground(Color.GREEN);
                                        l0.setIcon(new ImageIcon("D:\\mohit2.jpg"));
                                        Dimension size = l0.getPreferredSize();
                                        l0.setBounds(400,100,750,600);

                                        JLabel g=new JLabel(" ACCEPTS ALL TYPES OF PAYMENT QR CODE");
                                        g.setBounds(130,10,1200,100);
                                        g.setFont(new Font("serif",Font.BOLD,50));
                                        g.setForeground(Color.black);

                                        //to add the qr code  ok button

                                        JButton l=new JButton("OK");
                                        l.setFont(new Font ("serif",Font.BOLD,25));
                                        l.setBounds(1100,350,90,75);

                                        l.addActionListener(new ActionListener(){
                                            public void actionPerformed(ActionEvent e){
                                                JFrame k1=new JFrame("hello");
                                                k1.getContentPane().setBackground(Color.GREEN);

                                                //to add lable
                                                JLabel l=new JLabel("YOUR PAYMENT SUCCESSFUL");
                                                l.setBounds(400,10,1000,80);
                                                l.setFont(new Font("serif",Font.BOLD,40));
                                                l.setForeground(Color.RED);
                                                JLabel l2=new JLabel(" EXPANDED REGISTRATION SUCCESSFUL");
                                                l2.setBounds(280,100,1000,250);
                                                l2.setFont(new Font("serif",Font.BOLD,40));
                                                l2.setForeground(Color.WHITE);

                                                JLabel l3=new JLabel(" YOUR SEAT CONFIRM");
                                                l3.setBounds(500,300,1000,160);
                                                l3.setFont(new Font("serif",Font.BOLD,40));
                                                l3.setForeground(Color.BLACK);


                                                JLabel l4=new JLabel("THANK YOU");
                                                l4.setBounds(600,490,1000,160);
                                                l4.setFont(new Font("serif",Font.BOLD,50));
                                                l4.setForeground(Color.BLUE);


                                                k1.add(l);
                                                k1.add(l2);
                                                k1.add(l3);
                                                k1.add(l4);


                                                k1.setSize(1400,1400);
                                                k1.setLayout(null);
                                                k1.setVisible(true);

                                            }});

                                        k.add(l);
                                        k.add(g);
                                        k.add(l0);
                                        k.setSize(1400,1400);
                                        k.setLayout(null);
                                        k.setVisible(true);

                                    }});
                                //to add the choise button
                                Choice ca=new Choice();
                                ca.add("TYPE OF PAYMENT");
                                ca.add("(G) PAY");
                                ca.add("PHONE PAY");
                                ca.add("BHIM UPI");
                                ca.add("PAYTM");
                                ca.add("AMAZONE PAY");
                                ca.add("BITCOIN");
                                ca.add("POYPOL");
                                ca.add("NETBANKING");
                                ca.add("SEPA");
                                ca.add("RIA");
                                ca.add("STRIPE");
                                ca.setBounds(850,375,430,95);
                                ca.setFont(new Font("Arial",Font.BOLD,25));


                                f2.add(ca);
                                f2.add(c1);
                                f2.add(l);
                                f2.setSize(1400,1400);
                                f2.setLayout(null);
                                f2.setVisible(true);



                            }});

                        //ADD THE TEXTFILD F3 (4)START
                        TextField t3=new TextField();
                        t3.setBounds(850,350,400,50);
                        t3.setBackground(Color.PINK);
                        t3.setFont(new Font ("serif",Font.BOLD,40));
                        t3.getText();
                        f.add(t3);

                        //TO ADD THE BUTTON

                        f.setSize(1400,1400);
                        f.setLayout(null);
                        f.setVisible(true);

                    }});

                //CLOSE2

                // TO ADD THE LAVALE  start
                JLabel l3=new JLabel("(4) CORPORATE BOOKING");
                l3.setBounds(300,425,600,80);
                l3.setFont(new Font("serif",Font.BOLD,37));
                l3.setForeground(Color.BLACK);
                f2.add(l3);

                // TO ADD BOUTTON L2
                JButton b3=new JButton("GO");
                b3.setFont(new Font ("serif",Font.BOLD,25));
                b3.setBounds(890,425,90,75);
                f2.add(b3);

                b3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JFrame f=new JFrame("hello");
                        f.getContentPane().setBackground(Color.GREEN);

                        JLabel la=new JLabel("(1) NAME OF COMPNEY");
                        la.setBounds(270,80,600,80);
                        la.setFont(new Font("serif",Font.BOLD,37));
                        la.setForeground(Color.red);
                        f.add(la);

                        //ADD THE TEXTFILD F3 (1)
                        TextField t=new TextField();
                        t.setBounds(850,89,400,50);
                        t.setBackground(Color.PINK);
                        t.setFont(new Font ("serif",Font.BOLD,40));
                        t.getText();
                        f.add(t);

                        //to add the lable f3 (2)
                        JLabel la1=new JLabel("(2)  NUMBER OF SEET.");
                        la1.setBounds(270,170,600,80);
                        la1.setFont(new Font("serif",Font.BOLD,37));
                        la1.setForeground(Color.BLUE);
                        f.add(la1);

                        //ADD THE TEXTFILD F3 (2)
                        TextField t1=new TextField();
                        t1.setBounds(850,180,400,50);
                        t1.setBackground(Color.PINK);
                        t1.setFont(new Font ("serif",Font.BOLD,40));
                        t1.getText();
                        f.add(t1);

                        //to add the lable f3 (3)
                        JLabel la2=new JLabel("(3) COMPNET EMAIL ID");
                        la2.setBounds(270,260,600,80);
                        la2.setFont(new Font("serif",Font.BOLD,37));
                        la2.setForeground(Color.MAGENTA);
                        f.add(la2);

                        //ADD THE TEXTFILD F3 (3)
                        TextField t2=new TextField();
                        t2.setBounds(850,270,400,50);
                        t2.setBackground(Color.PINK);
                        t2.setFont(new Font ("serif",Font.BOLD,40));
                        t2.getText();
                        f.add(t2);

                        //to add the lable f3 (4)
                        JLabel la3=new JLabel("(4) DATE OF BOOKING");
                        la3.setBounds(270,340,600,80);
                        la3.setFont(new Font("serif",Font.BOLD,37));
                        la3.setForeground(Color.BLACK);
                        f.add(la3);

                        TextField ta4=new TextField();
                        ta4.setBounds(850,350,400,50);
                        ta4.setBackground(Color.PINK);
                        ta4.setFont(new Font ("serif",Font.BOLD,40));
                        ta4.getText();
                        f.add(ta4);

                        //to add the button
                        JButton x=new JButton("GO");
                        x.setFont(new Font ("serif",Font.BOLD,25));
                        x.setBounds(600,500,90,75);
                        f.add(x);

                        x.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                JFrame f1=new JFrame("hello");
                                f1.getContentPane().setBackground(Color.GREEN);

                                JLabel l=new JLabel(" M.R WATER PARK , PATNA");
                                l.setBounds(300,10,1000,100);
                                l.setFont(new Font("serif",Font.BOLD,60));
                                l.setForeground(Color.blue);

                                //to add the lable expendad rejishtation

                                JLabel c=new JLabel("(1) MODE OF PAYMENT");
                                c.setBounds(250,200,600,80);
                                c.setFont(new Font("serif",Font.BOLD,37));
                                c.setForeground(Color.red);
                                f2.add(c);

                                //to add the choise button
                                Choice c0=new Choice();
                                c0.add("MODE OF PAYMENT");
                                c0.add("ADVANCE PAYMRNT");
                                //c1.add("china");
                                c0.add("FULL PAYMENT");
                                c0.setBounds(850,235,430,95);
                                c0.setFont(new Font("Arial",Font.BOLD,25));

                                //coice button 2


                                JLabel cx=new JLabel("(2) TYPE OF PAYMENY");
                                cx.setBounds(250,350,600,80);
                                cx.setFont(new Font("serif",Font.BOLD,37));
                                cx.setForeground(Color.red);
                                f1.add(cx);

                                Choice cb=new Choice();
                                cb.add("TYPE OF PAYMENT");
                                cb.add("(G) PAY");
                                cb.add("PHONE PAY");
                                cb.add("BHIM UPI");
                                cb.add("PAYTM");
                                cb.add("AMAZONE PAY");
                                cb.add("BITCOIN");
                                cb.add("POYPOL");
                                cb.add("NETBANKING");
                                cb.add("SEPA");
                                cb.add("RIA");
                                cb.add("STRIPE");
                                cb.setBounds(850,375,430,95);
                                cb.setFont(new Font("Arial",Font.BOLD,25));

                                //to add the button framre f1
                                JButton v=new JButton("pay");
                                v.setFont(new Font ("serif",Font.BOLD,25));
                                v.setBounds(600,500,90,75);
                                f1.add(v);
                                // to add the action

                                v.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        JFrame h=new JFrame("hello");
                                        h.getContentPane().setBackground(Color.GREEN);

                                        //k.getContentPane().setBackground(Color.GREEN);
                                        l0.setIcon(new ImageIcon("D:\\mohit2.jpg"));
                                        Dimension size = l0.getPreferredSize();
                                        l0.setBounds(400,100,750,600);

                                        JLabel g=new JLabel(" ACCEPTS ALL TYPES OF PAYMENT QR CODE");
                                        g.setBounds(130,10,1200,100);
                                        g.setFont(new Font("serif",Font.BOLD,50));
                                        g.setForeground(Color.black);
                                        //to add the butoon

                                        JButton s=new JButton("OK");
                                        s.setFont(new Font ("serif",Font.BOLD,25));
                                        s.setBounds(1100,350,90,75);

                                        s.addActionListener(new ActionListener(){
                                            public void actionPerformed(ActionEvent e){
                                                JFrame i=new JFrame("hello");
                                                i.getContentPane().setBackground(Color.GREEN);

                                                JLabel l=new JLabel("YOUR PAYMENT SUCCESSFUL");
                                                l.setBounds(400,10,1000,80);
                                                l.setFont(new Font("serif",Font.BOLD,40));
                                                l.setForeground(Color.RED);
                                                JLabel l2=new JLabel(" corprote booking SUCCESSFUL");
                                                l2.setBounds(280,100,1000,250);
                                                l2.setFont(new Font("serif",Font.BOLD,40));
                                                l2.setForeground(Color.WHITE);

                                                JLabel l3=new JLabel(" YOUR SEAT CONFIRM");
                                                l3.setBounds(500,300,1000,160);
                                                l3.setFont(new Font("serif",Font.BOLD,40));
                                                l3.setForeground(Color.BLACK);


                                                JLabel l4=new JLabel("THANK YOU");
                                                l4.setBounds(600,490,1000,160);
                                                l4.setFont(new Font("serif",Font.BOLD,50));
                                                l4.setForeground(Color.BLUE);


                                                i.add(l);
                                                i.add(l2);
                                                i.add(l3);
                                                i.add(l4);


                                                i.setSize(1400,1400);
                                                i.setLayout(null);
                                                i.setVisible(true);

                                            }});

                                        h.add(l0);
                                        h.add(s);
                                        h.add(g);
                                        h.setSize(1400,1400);
                                        h.setLayout(null);
                                        h.setVisible(true);

                                    }});


                                f1.add(cb);
                                f1.add(c0);
                                f1.add(l);
                                f1.add(c);
                                f1.setSize(1400,1400);
                                f1.setLayout(null);
                                f1.setVisible(true);

                            }});








                        f.setSize(1400,1400);
                        f.setLayout(null);
                        f.setVisible(true);

                    }});




            }});







    }
}