
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



class Counter1 implements ActionListener
{
    JFrame frame = new JFrame();
    JLabel lblcount;
    TextField tfCount;
    Button btncount;
    int count = 0;

    public static void main(String[] args) {
        Counter1 n = new Counter1();
        n.frame1();
    }
    void frame1()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public Counter1() {
        frame.setLayout(new FlowLayout());


        lblcount = new JLabel("Counter");
        frame.add(lblcount);

        tfCount = new TextField(count + " "+ 10);
        tfCount.setVisible(true);
        frame.add(tfCount);

        btncount = new Button("Count");
        frame.add(btncount);
        btncount.addActionListener(this);

        frame.setSize(250,100);
        frame.setTitle("Counter");
        frame.setVisible(true);

        

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++count;
        tfCount.setText(count + "");

    }
    
}