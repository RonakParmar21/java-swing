package bankmanagementsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SignUP1 extends JFrame implements ActionListener, KeyListener {
    private static final long serialVersionUID = 1L;
    long random;
    JFrame f1;
    JLabel additionDetail, religion, category, income, eq, eqq, occupation, pan, aadhar, sc, existingAcc;
    JTextField panText, aadharText;
    JRadioButton scyes, scno, exyes, exno;
    JButton next;
    JComboBox<?> religion1, category1, income1, eq1, occupation1;
    String formno;

    //	@SuppressWarnings("unchecked")
    public SignUP1(String formno) {
        this.formno = formno;
        f1 = new JFrame();
        f1.setForeground(new Color(0, 0, 0));
        f1.setFont(new Font("SansSerif", Font.BOLD, 20));
        f1.setBackground(new Color(255, 255, 255));
        f1.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 20));

        additionDetail = new JLabel("Page 2: Additional Details", SwingConstants.CENTER);
        additionDetail.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        additionDetail.setBounds(150, 10, 500, 50);
        additionDetail.setForeground(Color.white);

        religion = new JLabel("Religion:");
        religion.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        religion.setBounds(100, 100, 150, 30);
        religion.setForeground(Color.white);

        String rel[] = { "Hindu", "Muslim", "Sikh", "Other" };
        religion1 = new JComboBox<Object>(rel);
        religion1.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        religion1.setBounds(270, 100, 430, 30);
        religion1.setBackground(Color.white);
        religion1.setForeground(Color.decode("#141d28"));

        category = new JLabel("Category:");
        category.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        category.setBounds(100, 150, 150, 30);
        category.setForeground(Color.white);

        String cat[] = { "OBC", "General", "SC", "ST", "Other" };
        category1 = new JComboBox<Object>(cat);
        category1.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        category1.setBounds(270, 150, 430, 30);
        category1.setBackground(Color.white);
        category1.setForeground(Color.decode("#141d28"));

        income = new JLabel("Income:");
        income.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        income.setBounds(100, 200, 150, 30);
        income.setForeground(Color.white);

        String in[] = { "NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "UPTO 5,00,000" };
        income1 = new JComboBox<Object>(in);
        income1.setBounds(270, 200, 430, 30);
        income1.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        income1.setBackground(Color.white);
        income1.setForeground(Color.decode("#141d28"));

        eq = new JLabel("Educational");
        eq.setForeground(Color.white);
        eqq = new JLabel("Qualification:");
        eqq.setForeground(Color.white);
        eq.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        eqq.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        eq.setBounds(100, 250, 150, 30);
        eqq.setBounds(100, 280, 150, 30);

        String e[] = { "Non-Graduation", "Graduate", "Post-Graduation", "Other" };
        eq1 = new JComboBox<Object>(e);
        eq1.setBounds(270, 265, 430, 30);
        eq1.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        eq1.setBackground(Color.white);
        eq1.setForeground(Color.decode("#141d28"));

//		emailText.setBounds(270, 300, 430, 30);

        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        occupation.setBounds(100, 350, 150, 30);
        occupation.setForeground(Color.white);

        String oc[] = { "Self-Employee", "Bussiness", "Student", "Job", "Retired", "Other" };
        occupation1 = new JComboBox<Object>(oc);
        occupation1.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        occupation1.setBounds(270, 350, 430, 30); // 0,0,250,0
        occupation1.setBackground(Color.white);
        occupation1.setForeground(Color.decode("#141d28"));

        pan = new JLabel("Pan Card No:");
        pan.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        pan.setBounds(100, 400, 150, 30);
        pan.setForeground(Color.white);

        panText = new JTextField();
        panText.addKeyListener(this);
        panText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        panText.setBounds(270, 400, 430, 30);
        panText.setForeground(Color.decode("#141d28"));

        aadhar = new JLabel("Aadhar No:");
        aadhar.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        aadhar.setBounds(100, 450, 150, 30);
        aadhar.setForeground(Color.white);

        aadharText = new JTextField();
        aadharText.addKeyListener(this);
        aadharText.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        aadharText.setBounds(270, 450, 430, 30);
        aadharText.setForeground(Color.decode("#141d28"));

        sc = new JLabel("Senior Citizen:");
        sc.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        sc.setBounds(100, 500, 150, 30);
        sc.setForeground(Color.white);

        scyes = new JRadioButton("Yes");
        scyes.setBounds(270, 500, 215, 30);
        scyes.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        scyes.setBackground(Color.white);
        scyes.setForeground(Color.decode("#141d28"));

        scno = new JRadioButton("No");
        scno.setBounds(485, 500, 215, 30);
        scno.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        scno.setBackground(Color.white);
        scno.setSelected(true);
        scno.setForeground(Color.decode("#141d28"));

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(scyes);
        bg1.add(scno);

        existingAcc = new JLabel("Existing A/C:");
        existingAcc.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        existingAcc.setBounds(100, 550, 150, 30);
        existingAcc.setForeground(Color.white);

        exyes = new JRadioButton("Yes");
        exyes.setBounds(270, 550, 215, 30);
        exyes.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        exyes.setBackground(Color.white);
        exyes.setForeground(Color.decode("#141d28"));

        exno = new JRadioButton("No");
        exno.setBounds(485, 550, 215, 30);
        exno.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        exno.setBackground(Color.white);
        exno.setSelected(true);
        exno.setForeground(Color.decode("#141d28"));

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(exyes);
        bg2.add(exno);

        next = new JButton("Next");
        next.addActionListener(this);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(550, 630, 150, 40);
        next.setFont(new Font("SANS_SERIF", Font.BOLD, 20));
        next.addActionListener(this);

        f1.getContentPane().add(additionDetail);

        f1.getContentPane().add(religion);
        f1.getContentPane().add(religion1);

        f1.getContentPane().add(category);
        f1.getContentPane().add(category1);

        f1.getContentPane().add(income);
        f1.getContentPane().add(income1);

        f1.getContentPane().add(eq);
        f1.getContentPane().add(eqq);
        f1.getContentPane().add(eq1);

        f1.getContentPane().add(occupation);
        f1.getContentPane().add(occupation1);

        f1.getContentPane().add(pan);
        f1.getContentPane().add(panText);

        f1.getContentPane().add(aadhar);
        f1.getContentPane().add(aadharText);

        f1.getContentPane().add(sc);
        f1.getContentPane().add(scyes);
        f1.getContentPane().add(scno);

        f1.getContentPane().add(existingAcc);
        f1.getContentPane().add(exyes);
        f1.getContentPane().add(exno);

        f1.getContentPane().add(next);

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

    public void keyPressed(KeyEvent ke) {

//		char c;
//		if (ke.getSource() == aadharText) {
//
//			String aadhar = aadharText.getText();
//			int length = aadhar.length();
//
//			c = ke.getKeyChar();
//
//			if ((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
//				if (length < 12) {
//					aadharText.setEditable(true);
//				} else {
//					aadharText.setEditable(false);
//				}
//			} else {
//				if (ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
//						|| ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
//					aadharText.setEditable(true);
//				} else {
//					aadharText.setEditable(false);
//				}
//			}
//
//		} else if (ke.getSource() == panText) {
//
//			String pan = panText.getText();
//			int length = pan.length();
//
//			c = ke.getKeyChar();
//
//			if ((ke.getKeyChar() >= 48 && ke.getKeyChar() <= 57)) {
//				if (length < 15) {
//					panText.setEditable(true);
//				} else {
//					panText.setEditable(false);
//				}
//			} else {
//				if (ke.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE
//						|| ke.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
//					panText.setEditable(true);
//				} else {
//					panText.setEditable(false);
//				}
//			}
//
//		}

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == next) {
            String rel = (String) religion1.getSelectedItem();
            String cat = (String) category1.getSelectedItem();
            String inc = (String) income1.getSelectedItem();
            String edu = (String) eq1.getSelectedItem();
            String occ = (String) occupation1.getSelectedItem();
            String senior = null;
            if (scyes.isSelected()) {
                senior = "Yes";
            } else if (scno.isSelected()) {
                senior = "No";
            }
            String existing = null;
            if (exyes.isSelected()) {
                existing = "Yes";
            } else if (exno.isSelected()) {
                existing = "No";
            }
            String pan = panText.getText();
            int length = pan.length();
            if (length == 15 && pan.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Pan number must be contains 15 digits");
                panText.requestFocus();
                return;
            }

            String aadhar = aadharText.getText();
            int length1 = aadhar.length();
            if (length1 == 12 && aadhar.matches("\\d+")) {

            } else {
                JOptionPane.showMessageDialog(null, "Aadhar number must be contains 12 digits");
                aadharText.requestFocus();
                return;
            }

            try {

//			if(rel.equals("")) {
//				JOptionPane.showMessageDialog(null, "Religion is not selected","System Message", JOptionPane.INFORMATION_MESSAGE);
//				nameText.requestFocus();
//			} else if (cat.equals("")) {
//				JOptionPane.showMessageDialog(null, "Category is not selected","System Message", JOptionPane.INFORMATION_MESSAGE);
//				fnameText.requestFocus();
//			} else if (inc.equals("")) {
//				JOptionPane.showMessageDialog(null, "Income is not selected","System Message", JOptionPane.INFORMATION_MESSAGE);
//				dobText.requestFocus();
//			} else if (edu.equals("")) {
//				JOptionPane.showMessageDialog(null, "Education Qualification is not Selected","System Message", JOptionPane.INFORMATION_MESSAGE);
//				emailText.requestFocus();
//			} else if (occ.equals("")) {
//				JOptionPane.showMessageDialog(null, "Occupation is not Selected","System Message", JOptionPane.INFORMATION_MESSAGE);
//				addressText.requestFocus();
//			} else if (senior.equals("")) {
//				JOptionPane.showMessageDialog(null, "Senior is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);
//				cityText.requestFocus();
//			}
                if (pan.equals("")) {
                    JOptionPane.showMessageDialog(null, "Pan Card No is Empty", "System Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    panText.requestFocus();
                } else if (aadhar.equals("")) {
                    JOptionPane.showMessageDialog(null, "Aadhar Card No is Empty", "System Message",
                            JOptionPane.INFORMATION_MESSAGE);
                    aadharText.requestFocus();
                } else {
//				JOptionPane.showMessageDialog(null, "Date of Birth is Empty","System Message", JOptionPane.INFORMATION_MESSAGE);

                    Connection c1 = new Connection();
                    String query = "insert into signupone values('" + formno + "','" + rel + "','" + cat + "','" + inc
                            + "','" + edu + "','" + occ + "','" + pan + "','" + aadhar + "','" + senior + "','"
                            + existing + "')";

                    c1.stm.executeUpdate(query);
                    setVisible(false);
                    // object of signup2
                    new SignUP2(formno).setVisible(true);

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        new SignUP1("");
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
