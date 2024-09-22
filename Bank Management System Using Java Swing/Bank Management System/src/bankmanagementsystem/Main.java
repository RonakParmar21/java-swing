package bankmanagementsystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame implements ActionListener {
    JFrame f1;
    JLabel text, viewBal;
    JButton credit, debit, viewBalance, transfer, statement, loanInfo, investment, changeMobileNo, changePin, help, exit, fastCash;
    String pinNumber;

    public Main(String pinNumber) {
        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        text = new JLabel("Please Select Your Transaction", SwingConstants.CENTER);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        text.setForeground(Color.white);
        text.setBounds(150, 10, 500, 50);
        f1.add(text);

        credit = new JButton("Credit");
        credit.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        credit.setBounds(100, 100, 280, 50);
        credit.setBackground(Color.white);
        credit.setForeground(Color.black);
        credit.addActionListener(this);
        f1.add(credit);

        debit = new JButton("Debit");
        debit.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        debit.setBounds(420, 100, 280, 50);
        debit.setBackground(Color.white);
        debit.setForeground(Color.black);
        debit.addActionListener(this);
        f1.add(debit);

        viewBalance = new JButton("View Balance");
        viewBalance.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        viewBalance.setBounds(100, 160, 280, 50);
        viewBalance.setBackground(Color.white);
        viewBalance.setForeground(Color.black);
        viewBalance.addActionListener(this);
        f1.add(viewBalance);

        transfer = new JButton("Transfer");
        transfer.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        transfer.setBounds(420, 160, 280, 50);
        transfer.setBackground(Color.white);
        transfer.setForeground(Color.black);
        transfer.addActionListener(this);
        f1.add(transfer);

        statement = new JButton("Statement");
        statement.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        statement.setBounds(100, 220, 280, 50);
        statement.setBackground(Color.white);
        statement.setForeground(Color.black);
        statement.addActionListener(this);
        f1.add(statement);

        fastCash = new JButton("Fast Cash");
        fastCash.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        fastCash.setBounds(420, 220, 280, 50);
        fastCash.setBackground(Color.white);
        fastCash.setForeground(Color.black);
        fastCash.addActionListener(this);
        f1.add(fastCash);




        changePin = new JButton("Change Pin");
        changePin.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        changePin.setBounds(100, 280, 280, 50);
        changePin.setBackground(Color.white);
        changePin.setForeground(Color.black);
        changePin.addActionListener(this);
        f1.add(changePin);

        changeMobileNo = new JButton("Change Mobile No");
        changeMobileNo.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        changeMobileNo.setBounds(420, 280, 280, 50);
        changeMobileNo.setBackground(Color.white);
        changeMobileNo.setForeground(Color.black);
        changeMobileNo.addActionListener(this);
        f1.add(changeMobileNo);



        loanInfo = new JButton("Loan Info");
        loanInfo.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        loanInfo.setBounds(420, 220, 280, 50);
        loanInfo.setBackground(Color.white);
        loanInfo.setForeground(Color.black);
        loanInfo.addActionListener(this);
//		f1.add(loanInfo);

        investment = new JButton("Investment");
        investment.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        investment.setBounds(100, 280, 280, 50);
        investment.setBackground(Color.white);
        investment.setForeground(Color.black);
        investment.addActionListener(this);
//		f1.add(investment);

        help = new JButton("Help");
        help.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        help.setBounds(100, 340, 280, 50);
        help.setBackground(Color.white);
        help.setForeground(Color.black);
        help.addActionListener(this);
        f1.add(help);

        exit = new JButton("Exit");
        exit.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        exit.setBounds(240, 540, 280, 50);
        exit.setBackground(Color.white);
        exit.setForeground(Color.black);
        exit.addActionListener(this);
        f1.add(exit);








        f1.getContentPane().setLayout(null);
        f1.getContentPane().setBackground(Color.decode("#141d28"));
        f1.setSize(800, 730);
        f1.setLocation(250, 20);
        f1.setEnabled(true);
//		f1.setExtendedState(DISPOSE_ON_CLOSE);
        f1.setUndecorated(true);
        f1.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit) {
            System.exit(0);
        } else if(ae.getSource() == credit) {
            f1.setVisible(false);
            new Credit(pinNumber).setVisible(true);
        } else if(ae.getSource() == debit) {
            f1.setVisible(false);
            new Debit(pinNumber).setVisible(true);
        } else if(ae.getSource() == fastCash) {
            f1.setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        } else if(ae.getSource() == changePin) {
            f1.setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        } else if(ae.getSource() == viewBalance) {
            f1.setVisible(false);
            new ViewBalance(pinNumber).setVisible(true);
        } else if(ae.getSource() == statement) {
            f1.setVisible(false);
            new MiniStatement(pinNumber).setVisible(true);
        } else if(ae.getSource() == help) {
            f1.setVisible(false);
            new Help(pinNumber).setVisible(true);
        } else if(ae.getSource() == changeMobileNo) {
            f1.setVisible(false);
            new ChangeMobile(pinNumber).setVisible(true);
        } else if(ae.getSource() == fastCash) {
            f1.setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Main("");
    }
}
