package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Help extends JFrame implements ActionListener, KeyListener {
    JFrame f1, f2;
    JLabel en, nm, em, mo, sub, msg, pinNo, text;
    JTextField card, nmText, emText, moText, subText;
    JTextArea msgText, f2Text;
    JButton submit, cancel, ok;
    JComboBox<?> inquiry;
    String pinNumber;

    public Help(String pinNumber) {
        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        text = new JLabel("How we can help you?", SwingConstants.CENTER);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        text.setForeground(Color.white);
        text.setBounds(150, 10, 500, 50);
        f1.add(text);

        en = new JLabel("Enquiry: ");
        en.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        en.setForeground(Color.white);
        en.setBounds(100, 100, 150, 30);
        f1.add(en);

        String rel[] = {"Complaint", "Query"};
        inquiry = new JComboBox<Object>(rel);
        inquiry.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        inquiry.setBounds(270, 100, 430, 30);
        inquiry.setBackground(Color.white);
//		inquiry.setForeground(Color.decode("#141d28"));
        f1.add(inquiry);

        nm = new JLabel("Name: ");
        nm.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        nm.setForeground(Color.white);
        nm.setBounds(100, 150, 150, 30);
        f1.add(nm);

        nmText = new JTextField();
        nmText.addKeyListener(this);
        nmText.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        nmText.setForeground(Color.decode("#141d28"));
        nmText.setBounds(270, 150, 430, 30);
        f1.add(nmText);

        em = new JLabel("Email: ");
        em.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        em.setForeground(Color.white);
        em.setBounds(100, 200, 150, 30);
        f1.add(em);

        emText = new JTextField();
        emText.addKeyListener(this);
//		int charLimit = 10;
        emText.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        emText.setForeground(Color.decode("#141d28"));
        emText.setBounds(270, 200, 430, 30);
        f1.add(emText);

        mo = new JLabel("Mobile No: ");
        mo.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        mo.setForeground(Color.white);
        mo.setBounds(100, 250, 150, 30);
        f1.add(mo);

        moText = new JTextField();
        moText.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        moText.setForeground(Color.decode("#141d28"));
        moText.setBounds(270, 250, 430, 30);
        f1.add(moText);

        sub = new JLabel("Subject: ");
        sub.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        sub.setForeground(Color.white);
        sub.setBounds(100, 300, 150, 30);
        f1.add(sub);

        subText = new JTextField();
        subText.addKeyListener(this);
        subText.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        subText.setForeground(Color.decode("#141d28"));
        subText.setBounds(270, 300, 430, 30);
        f1.add(subText);

        msg = new JLabel("Message: ");
        msg.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        msg.setForeground(Color.white);
        msg.setBounds(100, 350, 150, 30);
        f1.add(msg);

        msgText = new JTextArea();
        msgText.addKeyListener(this);
        msgText.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        msgText.setForeground(Color.decode("#141d28"));
        msgText.setBounds(270, 350, 430, 30);
        f1.add(msgText);

        submit = new JButton("Submit");
        submit.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        submit.setForeground(Color.decode("#141d28"));
        submit.setBackground(Color.white);
        submit.setBounds(200, 500, 150, 40);
        submit.addActionListener(this);
        f1.add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        cancel.setForeground(Color.decode("#141d28"));
        cancel.setBackground(Color.white);
        cancel.setBounds(450, 500, 150, 40);
        cancel.addActionListener(this);
        f1.add(cancel);

        f1.getContentPane().setLayout(null);
//		f1.getContentPane().setBackground(Color.white);
        f1.getContentPane().setBackground(Color.decode("#141d28"));
        f1.setSize(800, 730);
        f1.setLocation(250, 20);
//		f1.setEnabled(true);
//		f1.setExtendedState(DISPOSE_ON_CLOSE);
        f1.setUndecorated(true);
        f1.setVisible(true);

        f2 = new JFrame();
        f2.setFont(new Font("SansSerif", Font.BOLD, 16));
        f2.getContentPane().setFont(new Font("SANS_SERIF", Font.BOLD, 20));

        String text =
                "\t We can Send You solution of your" +

                        "\n query or complaint in your mobile or email." +
                        "\n\n\t Thank You.";

        f2Text = new JTextArea(text);
        f2Text.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        f2Text.setForeground(Color.white);
        f2Text.setBackground(Color.decode("#141d28"));
        f2Text.setBounds(1, 10, 798, 200);
        f2.add(f2Text);

        ok = new JButton("OK");
        ok.setBounds(350, 250, 100, 40);
        ok.setBackground(Color.white);
//		ok.setForeground(Color.orange);
        ok.setForeground(Color.decode("#141D28"));
        ok.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        ok.addActionListener(this);
        ok.addActionListener(this);
        f2.add(ok);

        f2.getContentPane().setLayout(null);
        f2.getContentPane().setBackground(Color.decode("#141d28"));
        f2.setSize(800, 400);
        f2.setLocation(250, 20);
        f2.setUndecorated(true);
//		f2.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == cancel) {
            System.exit(0);
        } else if(ae.getSource() == ok) {
            f2.setVisible(false);
//			f1.setVisible(true);
            new Main(pinNumber);
        } else if(ae.getSource() == submit) {

            String inq = (String) inquiry.getSelectedItem();
            String name = nmText.getText();
            String email = emText.getText();
            String mobile = moText.getText();
            int length = mobile.length();
            if (length == 10 && mobile.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Mobile number must be contains 10 digits");
                moText.requestFocus();
                return;
            }
            String subject = subText.getText();
            String message = msgText.getText();

            try {
                Connection c1 = new Connection();
                String query = "select * from login where pin = '"+pinNumber+"'";
                c1.stm.executeQuery(query);

//				if(query.equals("pinNumber")) {
                System.out.println("Success");

                if(name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Your Name");
                    nmText.requestFocus();
                } else if(email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Your Email ID");
                    emText.requestFocus();
                } else if(mobile.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Your Mobile No");
                    moText.requestFocus();

//						int length = mobile.length();
//						if (length == 10 && mobile.matches("\\d+")) {
//
//						} else {
//							JOptionPane.showMessageDialog(null, "Mobile number must be contains 10 digits");
//							moText.requestFocus();
//							return;
//						}

                } else if(subject.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Your Subject according Complaint or Query");
                    subText.requestFocus();
                } else if(message.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Your Message");
                    msgText.requestFocus();
                } else {

                    String query1 = "insert into help values('"+pinNumber+"', '"+inq+"', '"+name+"', '"+email+"', '"+mobile+"', '"+subject+"', '"+message+"')";
                    c1.stm.executeUpdate(query1);

                    f1.setVisible(false);
                    f2.setVisible(true);
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Help("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @SuppressWarnings("unused")
    @Override
    public void keyPressed(KeyEvent ke) {
        // TODO Auto-generated method stub

        char c;

        if(ke.getSource() == nmText) {

            String nm = nmText.getText();
            int length = nm.length();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    nmText.setEditable(true);
                } else {
                    nmText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    nmText.setEditable(true);
                } else {
                    nmText.setEditable(false);
                }
            }

        } else if(ke.getSource() == emText) {

            String em = emText.getText();
            int length = em.length();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32 || ke.getKeyChar() == 64 || ke.getKeyChar() == 46) {
                if(length < 30) {
                    emText.setEditable(true);
                } else {
                    emText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    emText.setEditable(true);
                } else {
                    emText.setEditable(false);
                }
            }

        } else if(ke.getSource() == subText) {

            String sub = subText.getText();
            int length = sub.length();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    subText.setEditable(true);
                } else {
                    subText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    subText.setEditable(true);
                } else {
                    subText.setEditable(false);
                }
            }

        } else if(ke.getSource() == msgText) {

            String msg = msgText.getText();
            int length = msg.length();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    msgText.setEditable(true);
                } else {
                    msgText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    msgText.setEditable(true);
                } else {
                    msgText.setEditable(false);
                }
            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
