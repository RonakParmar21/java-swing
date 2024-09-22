package bankmanagementsystem;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class ViewBalance extends JFrame implements ActionListener {
    JFrame f1;
    JLabel viewBal;
    JButton back;
    String pinNumber;

    public ViewBalance(String pinNumber) {

        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        back = new JButton("Back");
        back.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        back.setBounds(500, 320, 150, 50);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        f1.add(back);

        Connection c1 = new Connection();
        int balance = 0;
        try {
            String query1 = "select * from bank where pin = '"+pinNumber+"'";
            ResultSet rs = c1.stm.executeQuery(query1);

            while(rs.next()) {
                if(rs.getString("type").equals("Credit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }

            }
        } catch(Exception e) {
            System.out.println(e);
        }
        viewBal = new JLabel("Your Current Balance is: " + balance);
//		viewBal.setForeground(Color.w);
//		viewBal.setBackground(Color.black);
        viewBal.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        viewBal.setBounds(100, 200, 600, 50);
        viewBal.setForeground(Color.white);
        f1.add(viewBal);





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

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back) {
            f1.setVisible(false);
            new Main(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ViewBalance("");
    }
}
