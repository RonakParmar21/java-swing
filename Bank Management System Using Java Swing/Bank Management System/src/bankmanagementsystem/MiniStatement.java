package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class MiniStatement extends JFrame implements ActionListener {
    JFrame f1;
    JLabel bankName, card, mini, balance;
    String pinNumber;

    public MiniStatement(String pinNumber) {

        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        mini = new JLabel("",SwingConstants.CENTER);
        mini.setBounds(100, 140, 630, 40);
        mini.setFont(new Font("SansSerif", Font.BOLD, 10));
//		f1.setBackground(new Color(255, 255, 255));
        f1.setForeground(Color.white);
        f1.add(mini);


        bankName = new JLabel("SBI Bank", SwingConstants.CENTER);
        bankName.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        bankName.setBounds(100, 10, 600, 50);
        bankName.setForeground(Color.white);
        f1.add(bankName);

        card = new JLabel();
        card.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        card.setBounds(100, 100, 600, 30);
//		card.setBackground(Color.white);
//		card.setForeground(Color.decode("#141d28"));
        card.setForeground(Color.white);
        f1.add(card);

//		balance = new JLabel();
//		balance.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
//		balance.setBounds(100, 650, 600, 30);
//		balance.setForeground(Color.white);
//		balance.setBackground(Color.black);
//		f1.add(balance);

//		Connection c1 = new Connection();
        try {
            Connection c1 = new Connection();
            ResultSet rs = c1.stm.executeQuery("select * from login where pin = '"+pinNumber+"'");

            while(rs.next()) {
                card.setText("Card Number: " + rs.getString("cardNumber").substring(0, 4)+"XXXXXXXX"+rs.getString("cardNumber").substring(12));
                card.setForeground(Color.white);
            }

        } catch(Exception e) {
            System.out.println(e);
        }

        try {

            Connection c1 = new Connection();
            int bal = 0;
            ResultSet rs = c1.stm.executeQuery("select * from bank where pin = '"+pinNumber+"'");

            while(rs.next()) {
                mini.setText(mini.getText() + rs.getString("date") + rs.getString("type") + rs.getString("amount"));
                mini.setForeground(Color.white);

//				mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br></html>");

                if(rs.getString("type").equals("Credit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }

            balance = new JLabel("Your Current Balance is: " + bal, SwingConstants.CENTER);
            balance.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
            balance.setBounds(100, 640, 600, 50);
            balance.setForeground(Color.white);
            f1.add(balance);

        } catch(Exception e) {
            System.out.println(e);
        }




        f1.getContentPane().setLayout(null);
//		f1.getContentPane().setBackground(Color.white);
        f1.getContentPane().setBackground(Color.decode("#141d28"));
        f1.setSize(800, 730);
        f1.setLocation(250, 20);
        f1.setEnabled(true);
        f1.setExtendedState(DISPOSE_ON_CLOSE);
//		f1.setUndecorated(true);
        f1.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MiniStatement("");
    }
}
