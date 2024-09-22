package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;
public class ChangeMobile extends JFrame implements ActionListener, KeyListener {
    JFrame f1;
    JLabel text, no, reNo, oldNo;
    JTextField noText, reNoText, oldNoText;
    JButton change, back;
    String pinNumber;

    public ChangeMobile(String pinNumber) {

        this.pinNumber = pinNumber;

        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        text = new JLabel("Change Your Mobile Number", SwingConstants.CENTER);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        text.setBounds(100, 10, 600, 50);
        text.setForeground(Color.white);
        f1.add(text);

        no = new JLabel("New Phone No");
        no.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        no.setBounds(100, 100, 150, 30);
        no.setForeground(Color.white);
        f1.add(no);

        noText = new JTextField();
        noText.addKeyListener(this);
        noText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        noText.setBounds(270, 100, 430, 30);
        noText.setForeground(Color.decode("#141d28"));
        f1.add(noText);

        reNo = new JLabel("Re-Phone No");
        reNo.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        reNo.setBounds(100, 150, 150, 30);
        reNo.setForeground(Color.white);
        f1.add(reNo);

        reNoText = new JTextField();
        reNoText.addKeyListener(this);
        reNoText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        reNoText.setBounds(270, 150, 430, 30);
        reNoText.setForeground(Color.decode("#141d28"));
        f1.add(reNoText);

        oldNo = new JLabel("old No");
        oldNo.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        oldNo.setBounds(100, 200, 150, 30);
        oldNo.setForeground(Color.white);
        f1.add(oldNo);

        oldNoText = new JTextField();
        oldNoText.addKeyListener(this);
        oldNoText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        oldNoText.setBounds(270, 200, 430, 30);
        oldNoText.setForeground(Color.decode("#141d28"));
        f1.add(oldNoText);


        change = new JButton("Change");
        change.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        change.setBounds(500, 300, 150, 50);
        change.setBackground(Color.black);
        change.setForeground(Color.white);
        change.addActionListener(this);
        f1.add(change);

        back = new JButton("Back");
        back.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        back.setBounds(500, 400, 150, 50);
//		back.setBounds(500, 320, 150, 50);
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
//		f1.setUndecorated(true);
        f1.setVisible(true);

    }

    @SuppressWarnings("unlikely-arg-type")
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == back) {
            setVisible(false);
            new Main(pinNumber).setVisible(true);
        }

        if(ae.getSource() == change) {
            String mo = noText.getText();
            int length1 = mo.length();
            if (length1 == 10 && mo.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Mobile number must be contains 10 digits");
                noText.requestFocus();
                return;
            }

            String reMo = reNoText.getText();
            int length2 = reMo.length();
            if (length2 == 10 && reMo.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Mobile number must be contains 10 digits");
                reNoText.requestFocus();
                return;
            }

            String oldMo = oldNoText.getText();
            int length3 = oldMo.length();
            if (length3 == 10 && oldMo.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Mobile number must be contains 10 digits");
                oldNoText.requestFocus();
                return;
            }

            try {

                if(noText.equals("")) {
                    JOptionPane.showMessageDialog(null, "Mobile No is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    noText.requestFocus();
                } else if(reNoText.equals("")) {
                    JOptionPane.showMessageDialog(null, "Re Entered Mobile No is Empty", "System Message", JOptionPane.INFORMATION_MESSAGE);
                    reNoText.requestFocus();
                } else if(oldNoText.equals("")) {
                    JOptionPane.showMessageDialog(null, "Old Mobile No is Empty", "System Message", JOptionPane.INFORMATION_MESSAGE);
                    oldNoText.requestFocus();
                } else if(mo.equals(reMo)) {

                    Connection c1 = new Connection();

                    ResultSet rs = null;
                    String variable = null;

                    String sql = "SELECT formno FROM login WHERE pin = '"+pinNumber+"'";
                    rs = c1.stm.executeQuery(sql);

                    if(rs.next()) {
                        String formno = rs.getString("formno");
                        variable = formno;
                        System.out.println("Variable: " + variable);
                    }

                    String query1 = "update signup set mobile = '"+reMo+"' where formno = '"+variable+"' and mobile = '"+oldMo+"'";

                    c1.stm.executeUpdate(query1);

                    JOptionPane.showMessageDialog(null, "Mobile Number Changed Successfully...");

                    setVisible(false);
                    new Main(pinNumber).setVisible(true);
                } else if(!mo.equals(reMo)) {
                    JOptionPane.showMessageDialog(null, "Both new Numbers are not matched");
                    noText.requestFocus(true);
                }
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ChangeMobile("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        // TODO Auto-generated method stub
        if(ke.getSource() == noText) {
            String mo = noText.getText();
            int length = mo.length();
            ke.getKeyChar();

            if((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                if(length < 10) {
                    noText.setEditable(true);
                } else {
                    noText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    noText.setEditable(true);
                } else {
                    noText.setEditable(false);
                }
            }
        } else if(ke.getSource() == reNoText) {
            String mo1 = reNoText.getText();
            int length = mo1.length();
            ke.getKeyChar();

            if((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                if(length < 10) {
                    reNoText.setEditable(true);
                } else {
                    reNoText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    reNoText.setEditable(true);
                } else {
                    reNoText.setEditable(false);
                }
            }
        } else if(ke.getSource() == oldNoText) {
            String mo2 = oldNoText.getText();
            int length = mo2.length();
            ke.getKeyChar();

            if(ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57) {
                if(length < 10) {
                    oldNoText.setEditable(true);
                } else {
                    oldNoText.setEditable(false);
                }
            } else  {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    oldNoText.setEditable(true);
                } else {
                    oldNoText.setEditable(false);
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
