package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PinChange extends JFrame implements ActionListener, KeyListener {
    JFrame f1;
    JLabel text, pinText, rePinText;
    JPasswordField pin, rePin;
    JButton change, back;
    String pinNumber;

    public PinChange(String pinNumber) {

        this.pinNumber = pinNumber;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        text = new JLabel("Change Your Pin", SwingConstants.CENTER);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        text.setBounds(100, 10, 600, 50);
        text.setForeground(Color.white);
        f1.add(text);

        pinText = new JLabel("Enter New Pin");
        pinText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pinText.setBounds(100, 100, 150, 30);
        pinText.setForeground(Color.white);
        f1.add(pinText);

        pin = new JPasswordField();
        pin.addKeyListener(this);
        pin.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pin.setBounds(270, 100, 430, 30);
        pin.setFocusable(true);
        pin.setForeground(Color.decode("#141d28"));
        f1.add(pin);

        rePinText = new JLabel("Re-Enter Pin");
        rePinText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rePinText.setBounds(100, 150, 150, 30);
        rePinText.setForeground(Color.white);
        f1.add(rePinText);

        rePin = new JPasswordField();
        rePin.addKeyListener(this);
        rePin.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        rePin.setBounds(270, 150, 430, 30);
        f1.add(rePin);

        change = new JButton("Change");
        change.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        change.setBounds(500, 200, 150, 50);
        change.setBackground(Color.black);
        change.setForeground(Color.white);
        change.addActionListener(this);
        f1.add(change);

        back = new JButton("Back");
        back.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        back.setBounds(500, 260, 150, 50);
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

    public void actionPerformed(ActionEvent ae) {
//		if(ae.getSource() == back) {
//			setVisible(false);
//			new Main(pinNumber).setVisible(true);
//		}
        if(ae.getSource() == change) {
            try {

                char[] pinn1 = pin.getPassword();
                String newPin = new String(pinn1);
//				int length = newPin.length(

                char[] pinn2 = rePin.getPassword();
                String rPin = new String(pinn2);

//				String newPin = pin.getText();
//				String rPin = rePin.getText();

                if(!newPin.equals(rPin)) {
                    JOptionPane.showMessageDialog(null, "Both pin does not match");
//					System.out.println("Jane");
                    return;
//					f1.setVisible(false);
//					new PinChange(pinNumber).setVisible(true);
                } else if(newPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Pin");
//					f1.setVisible(false);
//					new PinChange(pinNumber).setVisible(true);
                    return;
                } else if(rPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter Pin");
//					f1.setVisible(false);
//					new PinChange(pinNumber).setVisible(true);
                    return;
                }

//				if(newPin.equals(rPin)) {
//				if(newPin != rPin) {
//					JOptionPane.showMessageDialog(null, "Both pin does not match");

//					return;
//				}
                else if(newPin.equals(rPin)) {
                    Connection c1 = new Connection();

                    String query1 = "update bank set pin = '"+newPin+"' where pin = '"+pinNumber+"'";
                    String query2 = "update login set pin = '"+newPin+"' where pin = '"+pinNumber+"'";
                    String query3 = "update signuptwo set pin = '"+newPin+"' where pin = '"+pinNumber+"'";
                    String query4 = "update help set pin = '"+newPin+"' where pin = '"+pinNumber+"'";

                    c1.stm.executeUpdate(query1);
                    c1.stm.executeUpdate(query2);
                    c1.stm.executeUpdate(query3);
                    c1.stm.executeUpdate(query4);

                    JOptionPane.showMessageDialog(null, "Pin Changed Successfully...");

                    setVisible(false);
                    new Main(rPin).setVisible(true);

                }


            } catch(Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Main(pinNumber).setVisible(true);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new PinChange("");
//		new PinChange("").setVisible(true);
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
        if(ke.getSource() == pin) {

            char[] pinn1 = pin.getPassword();
            String newPin = new String(pinn1);
            int length = newPin.length();

            c  = ke.getKeyChar();

            if((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                if(length < 30) {
                    pin.setEditable(true);
                } else {
                    pin.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    pin.setEditable(true);
                } else {
                    pin.setEditable(false);
                }
            }

        } else if(ke.getSource() == rePin) {

            char[] pinn2 =rePin.getPassword();
            String newPin = new String(pinn2);
            int length = newPin.length();

            c  = ke.getKeyChar();

            if((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                if(length < 30) {
                    rePin.setEditable(true);
                } else {
                    rePin.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    rePin.setEditable(true);
                } else {
                    rePin.setEditable(false);
                }
            }

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
