package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JFrame f1, f2;
    JLabel title, showTitle, name, password;
    JPanel msgPanel, loginPanel;
    JTextArea showText;
    JButton clear, login, signUP, cancel;
    JTextField nmText;
    JPasswordField passText;

    public Login() {

        Dimension  screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screenSize.getWidth()/2;
        int height = (int)screenSize.getHeight()/2;

        // welcome screen...
        try {

            String text =
                    "\t Welcome to our bank's desktop app! We are thrilled to have you as our valued customer." +

                            "\n\t Our app is designed to make your banking experience easy, convenient, and secure. With just a few taps, you can manage your accounts, transfer funds, pay bills, and much more, all from the comfort of your own device." +

                            "\n\t We take your security seriously and have implemented various measures to protect your information. Rest assured that your data is safe with us." +

                            "\n\t If you have any questions or need assistance, please do not hesitate to contact our customer service team. We are here to help you with any queries or concerns you may have." +
                            "\n\t Thank you for choosing our bank as your trusted financial partner. We look forward to serving you and making your banking experience a pleasant one.";


            String text1 = "Welcome to BANK";

            Thread.sleep(500);

            msgPanel = new JPanel();
            msgPanel.setLayout(new GridLayout(2, 1));
            msgPanel.setBounds(0, 0, 800, 600);
            msgPanel.setForeground(Color.white);
            msgPanel.setBackground(Color.orange);

            f2 = new JFrame();
            f2.setTitle("Details");
            f2.setLayout(null);

            showTitle = new JLabel(text1, SwingConstants.CENTER);
            showTitle.setBounds(300, 10, 500, 50);
            showTitle.setForeground(Color.white);
            showTitle.setFont(new Font("SANS_SERIF",  Font.BOLD, 38));
            showTitle.setBackground(Color.orange);

            showText = new JTextArea(text);
            showText.setWrapStyleWord(true);
            showText.setLineWrap(true);
            showText.setEditable(false);
            showText.setForeground(Color.blue);
            showText.setFont(new Font("SANS_SERIF",  Font.BOLD, 16));
            showText.setBackground(Color.orange);

            msgPanel.add(showTitle);
            msgPanel.add(showText);

            f2.add(msgPanel);

            f2.getContentPane().setBackground(Color.orange);
            f2.setSize(810, 610);
            f2.setLocation(300, 100);
            f2.setVisible(false);

//			Thread.sleep(5000);

            f2.setVisible(false);

//			Thread.sleep(1000);

        } catch(Exception e) {
            System.out.println(e);
        }

        f1 = new JFrame("Bank Management System");
        f1.setLayout(null);

        title = new JLabel("LOGIN");
        title.setForeground(Color.white);
        title.setFont(new Font("SANS_SERIF",  Font.BOLD, 40));
        title.setBounds(280, 10, 500, 50);

        name = new JLabel("Card No:");
        name.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        name.setForeground(Color.white);
        name.setBounds(120, 80, 400, 40);

        nmText = new JTextField();
        nmText.setEditable(true);
        nmText.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        nmText.setBounds(260, 80, 290, 40);

        password = new JLabel("Pin No:");
        password.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        password.setForeground(Color.white);
        password.setBounds(120, 140, 400, 40);

        passText = new JPasswordField();
        passText.setEditable(true);
        passText.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        passText.setBounds(260, 140, 290, 40);

        login = new JButton("Login");
        login.addActionListener(this);
        login.setBounds(180, 200, 140, 40);
        login.setBackground(Color.white);
//		login.setForeground(Color.orange);
        login.setForeground(Color.decode("#141D28"));
        login.addActionListener(this);
        login.setFont(new Font("SANS_SERIF", Font.BOLD, 28));

        clear = new JButton("Clear");
        clear.setBounds(340, 200, 140, 40);
        clear.setBackground(Color.white);
//		clear.setForeground(Color.orange);
        clear.setForeground(Color.decode("#141D28"));
        clear.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        clear.addActionListener(this);

        signUP = new JButton("SignUP");
        signUP.setBounds(180, 260, 140, 40);
        signUP.setBackground(Color.white);
//		signUP.setForeground(Color.orange);
        signUP.setForeground(Color.decode("#141D28"));
        signUP.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        signUP.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.setBounds(340, 260, 140, 40);
        cancel.setBackground(Color.white);
//		cancel.setForeground(Color.orange);
        cancel.setForeground(Color.decode("#141D28"));
        cancel.setFont(new Font("SANS_SERIF", Font.BOLD, 28));
        cancel.addActionListener(this);

        f1.add(title);

        f1.add(name);
        f1.add(nmText);

        f1.add(password);
        f1.add(passText);

        f1.add(login);
        f1.add(clear);
        f1.add(signUP);
        f1.add(cancel);

//		f1.getContentPane().setBackground(Color.orange);
        f1.getContentPane().setBackground(Color.decode("#141D28"));
        f1.setSize(width, height);
        f1.setLocation(350, 200);
        f1.setUndecorated(true);
//		f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        f1.setTitle("Login");
        f1.setVisible(true);

    }

    //	@SuppressWarnings("deprecation")
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == clear) {
            nmText.setText("");
            passText.setText("");
        } else if(ae.getSource() == login) {
            Connection c1 = new Connection();

            String cardNumber = nmText.getText();
            int length = cardNumber.length();
//			String pinNumber = passText.getText();
            char[] pin = passText.getPassword();
            String pinNumber = new String(pin);


//			int length1 = aadhar.length();  1234567843992322
            if (length == 16 && cardNumber.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Aadhar number must be contains 12 digits");
                nmText.requestFocus();
                return;
            }

            try {
                String query = "select * from login where cardNumber = '"+cardNumber+"' and pin = '"+pinNumber+"'";
                ResultSet rs = c1.stm.executeQuery(query);
                if(rs.next()) {
                    f1.setVisible(false);
                    JOptionPane.showInternalMessageDialog(null, "Login Success");
                    new Main(pinNumber).setVisible(true);
                } else {
                    JOptionPane.showInternalMessageDialog(null, "Incorrect card number and pin number");
                    return;
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        } else if(ae.getSource() == signUP) {
            f1.setVisible(false);
            new SignUP().setVisible(true);
        } else if(ae.getSource() == cancel) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Login();
    }
}
