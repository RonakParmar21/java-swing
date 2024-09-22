package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Credit extends JFrame implements ActionListener, KeyListener {
    JFrame f1;
    JLabel text, lastTransaction;
    JTextField amountText;
    JButton credit, exit, back;
    String pinNumber;

    public Credit(String pinNumber) {

        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        text = new JLabel("Enter The Amount You Want to Credit", SwingConstants.CENTER);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        text.setBounds(100, 10, 600, 50);
        text.setForeground(Color.white);
        f1.add(text);

        amountText = new JTextField(SwingConstants.CENTER);
        amountText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        amountText.setBounds(150, 70, 500, 30);
        amountText.addKeyListener(this);
        amountText.setForeground(Color.decode("#141d28"));
        f1.add(amountText);

        credit = new JButton("Credit");
        credit.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        credit.setBounds(500, 200, 150, 50);
        credit.setBackground(Color.black);
        credit.setForeground(Color.white);
        credit.addActionListener(this);
        f1.add(credit);



        back = new JButton("Back");
        back.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
//		back.setBounds(500, 320, 150, 50);
        back.setBounds(500, 260, 150, 50);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        f1.add(back);

        exit = new JButton("Exit");
        exit.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
//		exit.setBounds(500, 260, 150, 50);
        exit.setBounds(500, 320, 150, 50);
        exit.setBackground(Color.black);
//		exit.setForeground(Color.white);
        exit.addActionListener(this);
        f1.add(exit);


        f1.getContentPane().setLayout(null);
//		f1.getContentPane().setBackground(Color.white);
        f1.getContentPane().setBackground(Color.decode("#141d28"));
        f1.setSize(800, 730);
        f1.setLocation(250, 20);
        f1.setEnabled(true);
//		f1.setExtendedState(DISPOSE_ON_CLOSE);
        f1.setUndecorated(true);
        f1.setVisible(true);

    }

    @SuppressWarnings("unused")
    public void keyPressed(KeyEvent ke) {
        if(ke.getSource() == amountText) {

            char c;

            String amt = amountText.getText();
            int length = amt.length();

            c = ke.getKeyChar();

            if((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                if(length < 7) {
                    amountText.setEditable(true);
                } else {
                    amountText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    amountText.setEditable(true);
                } else {
                    amountText.setEditable(false);
                }
            }

        }
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back) {
            setVisible(false);
            new Main(pinNumber).setVisible(true);
        } else if(ae.getSource() == credit) {

            String number = amountText.getText();
//			int length = number.length();

            Date date = new Date();
            if(number.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter the Amount You Want to Credit");
            }
//			else if() {
//
//			}
            else {
                try {
                    Connection c1 = new Connection();
                    String query = "insert into bank values('"+pinNumber+"','"+date+"','Credit','"+number+"')";
                    c1.stm.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, number + " is Credited Successfully...");
                    setVisible(false);
                    new ViewBalance(pinNumber).setVisible(true);
//					new Main(pinNumber).setVisible(true);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }

        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Credit("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//
//	}

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
