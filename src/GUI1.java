import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI1 extends JFrame implements ActionListener{



    JLabel label = new JLabel("Hej");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");
    JButton cancel = new JButton("Cancel");
    JButton exit = new JButton("Exit");
    JButton enter = new JButton("Enter");
    JButton space1 = new JButton("");
    JButton space2 = new JButton("");

    JPanel bankMessage = new JPanel();
    JPanel customerMessage = new JPanel();
    JPanel buttons = new JPanel();

    JTextArea textAreaBank = new JTextArea();
    JTextArea textAreaCustomer = new JTextArea();
    Customer customer;

    GUI1(Customer customer){
        //textAreaBank.setText("Hallå");
        this.customer = customer;
        JPanel p = new JPanel();
        setLayout(new BorderLayout());
        add("North", bankMessage);
        add("Center", customerMessage);
        add("South", buttons);

        buttons.setLayout(new GridLayout(4, 4));

        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(cancel);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(exit);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(enter);
        buttons.add(space1);
        buttons.add(button0);
        buttons.add(space2);


        button1.addActionListener(this);


        ;
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (label.getText().equalsIgnoreCase("Hej")){
            label.setText("Hopp");
            //GUI2 gui2 = new GUI2(customer);
        }
        else{
            label.setText("Hej");
        }
    }



}