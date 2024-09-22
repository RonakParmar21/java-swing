package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SignUP2 extends JFrame implements ActionListener {
    JFrame f1;
    JLabel accountDetail, accountType, cardNo, cardVal, pinNo, pinVal, servicesRequired;
    JRadioButton at1, at2, at3, at4, at5;
    JCheckBox service1, service2, service3, service4, service5, service6, service7, ckAccept1;
    JButton submit, cancel;
    String formno;

    public SignUP2(String formno) {
        this.formno = formno;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        accountDetail = new JLabel("Page 3: Account Details", SwingConstants.CENTER);
        accountDetail.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        accountDetail.setBounds(150, 10, 500, 50);
        accountDetail.setForeground(Color.white);
        f1.add(accountDetail);

        accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        accountType.setBounds(100, 100, 150, 30);
        accountType.setForeground(Color.white);
        f1.add(accountType);

        at1 = new JRadioButton("Saving Account");
        at1.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        at1.setBounds(100, 130, 180, 20);
        at1.setSelected(true);
        at1.setBackground(Color.decode("#141d28"));
        at1.setForeground(Color.white);
//		at1.setBackground(Color.white);
        f1.add(at1);

        at2 = new JRadioButton("Current Account");
        at2.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        at2.setBounds(320, 130, 180, 20);
        at2.setBackground(Color.decode("#141d28"));
        at2.setForeground(Color.white);
//		at2.setBackground(Color.white);
        f1.add(at2);

        at3 = new JRadioButton("Demat Account");
        at3.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        at3.setBounds(540, 130, 180, 20);
        at3.setBackground(Color.decode("#141d28"));
        at3.setForeground(Color.white);
//		at3.setBackground(Color.white);
        f1.add(at3);

        at4 = new JRadioButton("Fixed Deposit Account");
        at4.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        at4.setBounds(100, 150, 220, 20);
        at4.setBackground(Color.decode("#141d28"));
        at4.setForeground(Color.white);
        f1.add(at4);

        at5 = new JRadioButton("Recurring Deposit Account");
        at5.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        at5.setBounds(320, 150, 250, 20);
        at5.setBackground(Color.decode("#141d28"));
        at5.setForeground(Color.white);
        f1.add(at5);

        ButtonGroup bg = new ButtonGroup();
        bg.add(at1);
        bg.add(at2);
        bg.add(at3);
        bg.add(at4);
        bg.add(at5);

//		100, 200, 150, 30 radio button pacchhina bounds
        cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        cardNo.setBounds(100, 200, 150, 30);
        cardNo.setForeground(Color.white);
        f1.add(cardNo);

        cardVal = new JLabel("XXXX-XXXX-XXXX-1234");
        cardVal.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        cardVal.setBounds(270, 200, 430, 30);
        cardVal.setForeground(Color.white);
        f1.add(cardVal);

        pinNo = new JLabel("Pin Number:");
        pinNo.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pinNo.setBounds(100, 250, 150, 30);
        pinNo.setForeground(Color.white);
        f1.add(pinNo);

        pinVal = new JLabel("XXXX");
        pinVal.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pinVal.setBounds(270, 250, 430, 30);
        pinVal.setForeground(Color.white);
        f1.add(pinVal);

        servicesRequired = new JLabel("Services:");
        servicesRequired.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        servicesRequired.setBounds(100, 300, 150, 30);
        servicesRequired.setForeground(Color.white);
        f1.add(servicesRequired);

        service1 = new JCheckBox("ATM Card");
        service1.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service1.setBounds(100, 330, 150, 20);
        service1.setBackground(Color.decode("#141d28"));
        service1.setForeground(Color.white);
        f1.add(service1);

        service2 = new JCheckBox("Creadit Card"); // internet banking
        service2.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service2.setBounds(250, 330, 150, 20);
        service2.setBackground(Color.decode("#141d28"));
        service2.setForeground(Color.white);
        f1.add(service2);

        service3 = new JCheckBox("SMS Alerts"); // mobile banking
        service3.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service3.setBounds(400, 330, 150, 20);
        service3.setBackground(Color.decode("#141d28"));
        service3.setForeground(Color.white);
        f1.add(service3);

        service4 = new JCheckBox("Cheque Book"); // chequebook
        service4.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service4.setBounds(550, 330, 150, 20);
        service4.setBackground(Color.decode("#141d28"));
        service4.setForeground(Color.white);
        f1.add(service4);

        service5 = new JCheckBox("Locker"); // email & sms alerts
        service5.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service5.setBounds(100, 350, 150, 20);
        service5.setBackground(Color.decode("#141d28"));
        service5.setForeground(Color.white);
        f1.add(service5);

        service6 = new JCheckBox("E-Statement");
        service6.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service6.setBounds(250, 350, 150, 20);
        service6.setBackground(Color.decode("#141d28"));
        service6.setForeground(Color.white);
        f1.add(service6);

        service7 = new JCheckBox("UPI Payment");
        service7.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        service7.setBounds(400, 350, 150, 20);
        service7.setBackground(Color.decode("#141d28"));
        service7.setForeground(Color.white);
        f1.add(service7);

        ckAccept1 = new JCheckBox("I hereby declares that the above details are true to the best of my knowledge");
        ckAccept1.setFont(new Font("SANS_SERIF", Font.BOLD, 14));
        ckAccept1.setBounds(100, 400, 600, 20);
        ckAccept1.setBackground(Color.decode("#141d28"));
        ckAccept1.setForeground(Color.white);
        ckAccept1.setSelected(true);
        ckAccept1.addActionListener(this);
        f1.add(ckAccept1);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        submit.setBounds(500, 630, 200, 40);
        submit.addActionListener(this);
        f1.add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        cancel.setBounds(100, 630, 200, 40);
        cancel.addActionListener(this);
        f1.add(cancel);

        f1.getContentPane().setLayout(null);
//		f1.getContentPane().setBackground(Color.white);
        f1.getContentPane().setBackground(Color.decode("#141d28"));
        f1.setSize(800, 730);
        f1.setLocation(250, 20);
        f1.setEnabled(true);
        f1.setUndecorated(true);
//		f1.setExtendedState(DISPOSE_ON_CLOSE);
        f1.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit) {
            String accountType = null;
            if(at1.isSelected()) {
                accountType = "Saving Account";
            } else if(at2.isSelected()) {
                accountType = "Current Account";
            } else if(at3.isSelected()) {
                accountType = "Demat Account";
            } else if(at4.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if(at5.isSelected()) {
                accountType = "Recurring Deposit Account";
            }


            Random rand = new Random();
            String cardNo = "" + Math.abs((rand.nextLong() % 90000000L) + 1234567800000000L);
            String pinNo = "" + Math.abs((rand.nextLong() % 9000L) + 1000L);
            String service = "";
            if(service1.isSelected()) {
                service = service + "ATM Card";
            } else if(service2.isSelected()) {
                service = service + "Creadit Card";
            } else if(service3.isSelected()) {
                service = service + "SMS Alerts";
            } else if(service4.isSelected()) {
                service = service + "Cheque Book";
            } else if(service5.isSelected()) {
                service = service + "Locker";
            } else if(service6.isSelected()) {
                service = service + "E-Statemet";
            } else if(service7.isSelected()) {
                service = service + "UPI Payment";
            }

            String ckAccept = "";
            if(ckAccept1.isSelected()) {
                ckAccept = "Accepted";
            } else {
//				JOptionPane.showMessageDialog(null, "Please Select Information is true","System Message", JOptionPane.INFORMATION_MESSAGE);
            }

            try {

                if(accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Select A/C Type","System Message", JOptionPane.INFORMATION_MESSAGE);
//					accountType.requestFocus();
                    at1.requestFocus();
                } else if(ckAccept.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Accept Codition","System Message", JOptionPane.INFORMATION_MESSAGE);
                    ckAccept1.requestFocus();
                }else {


                    Connection c1 = new Connection();
                    String query = "insert into signuptwo values('"+formno+"','"+accountType+"','"+cardNo+"','"+pinNo+"','"+service+"')";
                    String query1 = "insert into login values('"+formno+"','"+cardNo+"','"+pinNo+"')";

                    c1.stm.executeUpdate(query);
                    c1.stm.executeUpdate(query1);


                    JOptionPane.showMessageDialog(null, "Card Number is: "+cardNo+"\n Pin Number is: "+pinNo+"","System Message", JOptionPane.INFORMATION_MESSAGE);

                    f1.setVisible(false);
                    new Credit(pinNo).setVisible(true);
                }

            } catch(Exception e) {
                System.out.println(e);
            }


        } else if(ae.getSource() == cancel) {
            f1.setVisible(false);
            new Login().setVisible(true);
//			System.exit(0);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new SignUP2("");
    }
}
