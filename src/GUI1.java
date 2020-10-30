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

    JTextArea textAreaBank = new JTextArea(2, 10);
    JTextArea textAreaCustomer = new JTextArea(2, 10);
    //Customer customer;
    Account account;

    GUI1(Account account){
        this.account = account;


        textAreaBank.setText("För salod, välj 1 och enter, för uttag, välj 2 och enter");
        JPanel p = new JPanel();
        setLayout(new BorderLayout());
        add("North", bankMessage);
        add("Center", customerMessage);
        add("South", buttons);

        bankMessage.add(textAreaBank);
        customerMessage.add(textAreaCustomer);
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
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        cancel.addActionListener(this);
        exit.addActionListener(this);
        enter.addActionListener(this);

        this.pack();
        this.setLocation(200, 200);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        //final int button1=1, button2=2;
        if (e.getSource().equals(button1)) {
            textAreaBank.setText("Saldot är " + account.getBalance());
        }
        if (e.getSource().equals(button2)) {
            GUIuttag guiUttag = new GUIuttag(account, "Ange hur stort uttag Du vill göra");
        }






        if (label.getText().equalsIgnoreCase("Hej")){
            label.setText("Hopp");
            //GUI2 gui2 = new GUI2(customer);
        }
        else{
            label.setText("Hej");
        }
    }



}