
    import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


    class Thread1 extends Thread{ @Override
    public void run() {
        new About();
    }
    }
    public class About extends JFrame implements ActionListener{
        JButton b1;
        About(){
            setBounds(600, 200, 700,600);
            setLayout(null);


            JLabel l3 = new JLabel("You will find the help here");
            l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
            l3.setBounds(150, 130, 500, 300);
            add(l3);

            b1 = new JButton("OK");
            b1.setBounds(580, 500, 80, 25);
            b1.addActionListener(this);
            add(b1);
            setVisible(true);

        }

        public void actionPerformed(ActionEvent ae){
            this.setVisible(false);
        }}



