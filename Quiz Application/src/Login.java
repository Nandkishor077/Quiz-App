import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname;

    Login() {
        super();

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);


        JLabel heading = new JLabel("Best Brain");
        heading.setBounds(750, 50, 400, 45);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 50));
        heading.setForeground(new Color(30, 144, 255));
        add(heading);


        JLabel name = new JLabel("Enter your name ");
        name.setBounds(800, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 255));
        add(name);


        tfname = new JTextField();
        tfname.setBounds(730, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);


        rules = new JButton("Rules");
        rules.setBounds(730, 250, 120, 25);
        rules.setBackground(new Color(30, 144, 230));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);


        back = new JButton("Back");
        back.setBounds(910, 250, 120, 25);
        back.setBackground(new Color(30, 144, 230));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }


    


    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();

            setVisible(false);
            new Rules(name);


        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
}


