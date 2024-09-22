package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener  {
    JFrame f1;
    JLabel text;
    JButton rs100, rs500, rs1000, rs2000, rs5000, rs10000, back;
    String pinNumber;

    public FastCash(String pinNumber) {

        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        text = new JLabel("Please Select Your Transaction", SwingConstants.CENTER);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        text.setBounds(150, 10, 500, 50);
        text.setForeground(Color.white);
        f1.add(text);

        rs100 = new JButton("RS 100");
        rs100.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rs100.setBounds(100, 100, 250, 50);
        rs100.setBackground(Color.white);
        rs100.setForeground(Color.decode("#141d28"));
        rs100.addActionListener(this);
        f1.add(rs100);

        rs500 = new JButton("RS 500");
        rs500.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rs500.setBounds(450, 100, 250, 50);
        rs500.setBackground(Color.white);
        rs500.setForeground(Color.decode("#141d28"));
        rs500.addActionListener(this);
        f1.add(rs500);

        rs1000 = new JButton("RS 1000");
        rs1000.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rs1000.setBounds(100, 200, 250, 50);
        rs1000.setBackground(Color.white);
        rs1000.setForeground(Color.decode("#141d28"));
        rs1000.addActionListener(this);
        f1.add(rs1000);

        rs2000 = new JButton("RS 2000");
        rs2000.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rs2000.setBounds(450, 200, 250, 50);
        rs2000.setBackground(Color.white);
        rs2000.setForeground(Color.decode("#141d28"));
        rs2000.addActionListener(this);
        f1.add(rs2000);

        rs5000 = new JButton("RS 5000");
        rs5000.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rs5000.setBounds(100, 300, 250, 50);
        rs5000.setBackground(Color.white);
        rs5000.setForeground(Color.decode("#141d28"));
        rs5000.addActionListener(this);
        f1.add(rs5000);

        rs10000 = new JButton("RS 10000");
        rs10000.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rs10000.setBounds(450, 300, 250, 50);
        rs10000.setBackground(Color.white);
        rs10000.setForeground(Color.decode("#141d28"));
        rs10000.addActionListener(this);
        f1.add(rs10000);

        back = new JButton("Back");
        back.setFont(new Font("SANS_SEFIF", Font.BOLD, 20));
        back.setBounds(450, 500, 250, 50);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        f1.add(back);

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
            setVisible(false);
            new Main(pinNumber).setVisible(true);
        } else {

            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Connection c1 = new Connection();

            try {

                ResultSet rs = c1.stm.executeQuery("select * from bank where pin = '"+pinNumber+"'");

                int balance = 0;

                while(rs.next()) {
                    if(rs.getString("type").equals("Credit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if(ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();

                String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'Debit', '"+amount+"')";
                c1.stm.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully");

                setVisible(false);
                new Main(pinNumber).setVisible(true);

            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new FastCash("");
    }
}
