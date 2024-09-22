package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SignUP extends JFrame implements ActionListener, KeyListener {
    private static final long serialVersionUID = 1L;
    long random;
    JFrame f1;
    JLabel personal, name, fname, dob, gender, email, mobile, marital, address, city, state, pincode;
    JTextField nameText, fnameText, emailText, mobileText, pinText, addressText, cityText, stateText, dobText;
    JRadioButton male, female, married, unmarried;
    JButton next;
//	JDateChooser dobChooser;

    public SignUP() {
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L)+1000L);

//		Random r = new Random(4);
//		System.out.println(r);
//		fno = new JLabel("Application Form no."+r);

        personal = new JLabel("Page 1: Personal Details", SwingConstants.CENTER);
        personal.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        personal.setBounds(150, 10, 500, 50);
        personal.setForeground(Color.white);

        name = new JLabel("Name:");
        name.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        name.setBounds(100, 100, 150, 30);
        name.setForeground(Color.white);

        nameText = new JTextField();
        nameText.addKeyListener(this);
//		nameText.setPreferredSize(nameText.getPreferredSize());
//		nameText.setText("");
        nameText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        nameText.setBounds(270, 100, 430, 30);
        nameText.setForeground(Color.decode("#141d28"));

        fname = new JLabel("Father's Name:");
        fname.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        fname.setBounds(100, 150, 150, 30);
        fname.setForeground(Color.white);

        fnameText = new JTextField();
        fnameText.addKeyListener(this);
        fnameText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        fnameText.setBounds(270, 150, 430, 30);
        fnameText.setForeground(Color.decode("#141d28"));

        dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        dob.setBounds(100, 200, 150, 30);
        dob.setForeground(Color.white);

//	    dobChooser = new JDateChooser();
//	    dobChooser.setBounds(270, 200, 430, 30);
//	    dobChooser.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
//	    dobChooser.setForeground(Color.black);
//	    dobChooser.setForeground(Color.decode("#141d28"));

        gender = new JLabel("Gender:");
        gender.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        gender.setBounds(100, 250, 150, 30);
        gender.setForeground(Color.white);

        male = new JRadioButton("Male");
        male.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        male.setBounds(270, 250, 215, 30);
        male.setForeground(Color.decode("#141d28"));
        male.setSelected(true);
//		male.setBackground(Color.);

        female = new JRadioButton("Female");
        female.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        female.setBounds(485, 250, 215, 30);
        female.setForeground(Color.decode("#141d28"));
//		female.setBackground(Color.white);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        email = new JLabel("Email:");
        email.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        email.setBounds(100, 300, 150, 30);
        email.setForeground(Color.white);

        emailText = new JTextField();
        emailText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        emailText.setBounds(270, 300, 430, 30);
        emailText.setForeground(Color.decode("#141d28"));

        mobile = new JLabel("Mobile No: ");
        mobile.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        mobile.setBounds(100, 350, 150, 30);
        mobile.setForeground(Color.white);

        mobileText = new JTextField();
        mobileText.addKeyListener(this);
        mobileText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        mobileText.setBounds(270, 350, 430, 30);
        mobileText.setForeground(Color.decode("#141d28"));

        marital = new JLabel("Marital Status:");
        marital.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        marital.setBounds(100, 400, 150, 30);
        marital.setForeground(Color.white);

        married = new JRadioButton("Married");
        married.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        married.setBounds(270, 400, 215, 30);
//		married.setBackground(Color.white);
        married.setForeground(Color.decode("#141d28"));

        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        unmarried.setBounds(485, 400, 215, 30);
        unmarried.setBackground(Color.white);
        unmarried.setForeground(Color.decode("#141d28"));
        unmarried.setSelected(true);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(married);
        bg1.add(unmarried);

        address = new JLabel("Address:");
        address.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        address.setBounds(100, 450, 150, 30);
        address.setForeground(Color.white);

        addressText = new JTextField();
        addressText.addKeyListener(this);
        addressText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        addressText.setBounds(270, 450, 430, 30);
        addressText.setForeground(Color.decode("#141d28"));

        city = new JLabel("City:");
        city.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        city.setBounds(100, 500, 150, 30);
        city.setForeground(Color.white);

        cityText = new JTextField();
        cityText.addKeyListener(this);
        cityText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        cityText.setBounds(270, 500, 430, 30);
        cityText.setForeground(Color.decode("#141d28"));

        state = new JLabel("State:");
        state.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        state.setBounds(100, 550, 150, 30);
        state.setForeground(Color.white);

        stateText = new JTextField();
        stateText.addKeyListener(this);
        stateText.setBounds(270, 550, 430, 30);
        stateText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        stateText.setForeground(Color.decode("#141d28"));

        pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pincode.setBounds(100, 600, 150, 30);
        pincode.setForeground(Color.white);

        pinText = new JTextField();
        pinText.addKeyListener(this);
        pinText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pinText.setBounds(270, 600, 430, 30);
        pinText.setForeground(Color.decode("#141d28"));

        next = new JButton("Next");
//		next.addKeyListener(this);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(550, 640, 150, 40);
        next.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        next.addActionListener(this);

        f1.getContentPane().add(personal);

        f1.getContentPane().add(name);
        f1.getContentPane().add(nameText);

        f1.getContentPane().add(fname);
        f1.getContentPane().add(fnameText);


        f1.getContentPane().add(dob);
//		f1.getContentPane().add(dobChooser);
        /*f1.getContentPane().add(dobText);
         */
        /* f1.add(dateChooser); */

        f1.getContentPane().add(gender);
        f1.getContentPane().add(male);
        f1.getContentPane().add(female);

        f1.getContentPane().add(email);
        f1.getContentPane().add(emailText);

        f1.getContentPane().add(mobile);
        f1.getContentPane().add(mobileText);

        f1.getContentPane().add(marital);
        f1.getContentPane().add(married);
        f1.getContentPane().add(unmarried);

        f1.getContentPane().add(address);
        f1.getContentPane().add(addressText);

        f1.getContentPane().add(city);
        f1.getContentPane().add(cityText);

        f1.getContentPane().add(state);
        f1.getContentPane().add(stateText);

        f1.getContentPane().add(pincode);
        f1.getContentPane().add(pinText);

        f1.getContentPane().add(next);


        f1.getContentPane().setLayout(null);
        f1.getContentPane().setBackground(Color.decode("#141d28"));
        f1.setSize(800, 730);
        f1.setLocation(250, 20);
        f1.setEnabled(true);
        f1.setExtendedState(DISPOSE_ON_CLOSE);
        f1.setVisible(true);
    }

    public void keyPressed(KeyEvent ke) {

        @SuppressWarnings("unused")
        char c;
        if(ke.getSource() == nameText) {

            String name = nameText.getText();
            int length = name.length();

            c  = ke.getKeyChar();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    nameText.setEditable(true);
                } else {
                    nameText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    nameText.setEditable(true);
                } else {
                    nameText.setEditable(false);
                }
            }

        } else if(ke.getSource() == fnameText) {

            String fname = fnameText.getText();
            int length = fname.length();

            c = ke.getKeyChar();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    fnameText.setEditable(true);
                } else {
                    fnameText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    fnameText.setEditable(true);
                } else {
                    fnameText.setEditable(false);
                }
            }

        } else if(ke.getSource() == addressText) {

            String add = addressText.getText();
            int length = add.length();

            c = ke.getKeyChar();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    addressText.setEditable(true);
                } else {
                    addressText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    addressText.setEditable(true);
                } else {
                    addressText.setEditable(false);
                }
            }

        } else if(ke.getSource() == cityText) {

            String city = cityText.getText();
            int length = city.length();

            c = ke.getKeyChar();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    cityText.setEditable(true);
                } else {
                    cityText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    cityText.setEditable(true);
                } else {
                    cityText.setEditable(false);
                }
            }

        } else if(ke.getSource() == stateText) {

            String state = stateText.getText();
            int length = state.length();

            c = ke.getKeyChar();

            if((ke.getKeyChar() >= 65 && ke.getKeyChar() <= 90) || (ke.getKeyChar() >= 97 && ke.getKeyChar() <= 122) || ke.getKeyChar() == 32) {
                if(length < 30) {
                    stateText.setEditable(true);
                } else {
                    stateText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    stateText.setEditable(true);
                } else {
                    stateText.setEditable(false);
                }
            }

        } else if(ke.getSource() == mobileText) {
            String mo = mobileText.getText();
            int length = mo.length();
            c = ke.getKeyChar();

            if((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
                if(length < 10) {
                    mobileText.setEditable(true);
                } else {
                    mobileText.setEditable(false);
                }
            } else {
                if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                    mobileText.setEditable(true);
                } else {
                    mobileText.setEditable(false);
                }
            }
        } else if (ke.getSource() == pinText) {

//		    String pin = pinText.getText();
//		    int length = pin.length();
//		    c = ke.getKeyChar();
//
//		    if (Character.isDigit(c)) {
//		        if (length < 6) {
//		            pinText.setEditable(true);
//		        } else {
//		            pinText.setEditable(false);
//		        }
//		    } else {
//				if(ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
//					stateText.setEditable(true);
//				} else {
//					stateText.setEditable(false);
//				}
//			}
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == next) {
            String formno = "" + random; // long
            String name = nameText.getText();
            String fname = fnameText.getText();
//			String dob = ((JTextField) dobChooser.getDateEditor().getUiComponent()).getText();

            String mo = mobileText.getText();
            int length1 = mo.length();
            if (length1 == 10 && mo.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Mobile number must be contains 10 digits");
                mobileText.requestFocus();
                return;
            }

            String gender = null;
            if(male.isSelected()) {
                gender= "Male";
            } else if(female.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(null, "Gender is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
            }

            String email = emailText.getText();

            String marital = null;
            if(married.isSelected()) {
                marital = "Married";
            } else if(unmarried.isSelected()) {
                marital = "Unmarried";
            } else {
                JOptionPane.showMessageDialog(null, "Marital Status is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
            }

            String address = addressText.getText();
            String city = cityText.getText();
            String state = stateText.getText();
            String pin = pinText.getText();
            int length = pin.length();

            if (length == 6 && pin.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Pin must be contains 6 digits");
                pinText.requestFocus();
                return;
            }

            try {

                if(name.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    nameText.requestFocus();
                } else if (fname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Father's Name is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    fnameText.requestFocus();
                } /*else if (dob.equals("")) {
					JOptionPane.showMessageDialog(null, "Date of Birth is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
					dobText.requestFocus();
				} */ else if (email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Email is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    emailText.requestFocus();
                } else if (address.equals("")) {
                    JOptionPane.showMessageDialog(null, "Address is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    addressText.requestFocus();
                } else if (city.equals("")) {
                    JOptionPane.showMessageDialog(null, "City is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    cityText.requestFocus();
                } else if (state.equals("")) {
                    JOptionPane.showMessageDialog(null, "State is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    stateText.requestFocus();
                } else if (pin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Pin Code is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    pinText.requestFocus();
                } else if(mo.equals("")) {
                    JOptionPane.showMessageDialog(null, "Mobile no is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
                    mobileText.requestFocus();
                } else {
//					JOptionPane.showMessageDialog(null, "Date of Birth is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);

                    Connection c1 = new Connection();
//					String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+mo+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                    String query = "insert into signup(formno, name, fname, gender, email, mobile, marital, address, city, state, pin) values('"+formno+"','"+name+"','"+fname+"','"+gender+"','"+email+"','"+mo+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";

                    c1.stm.executeUpdate(query);

                    setVisible(false);
                    new SignUP1(formno).setVisible(true);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new SignUP();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
