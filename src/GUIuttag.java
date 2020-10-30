import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUIuttag extends JFrame implements ActionListener {


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

    GUIuttag(Account account, String message) {
        this.account = account;


        textAreaBank.setText(message);
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

    public void actionPerformed(ActionEvent e) {
        StringBuilder amount = new StringBuilder();


        if (e.getSource().equals(button1)) {
            amount.append("1");
            textAreaCustomer.setText(amount.toString());
        }
        if (e.getSource().equals(button2)) {
            amount.append("2");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button3)) {
            amount.append("3");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button4)) {
            amount.append("4");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button5)) {
            amount.append("5");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button6)) {
            amount.append("6");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button7)) {
            amount.append("7");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button8)) {
            amount.append("8");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button9)) {
            amount.append("9");
            textAreaCustomer.setText(amount.toString());
        }

        if (e.getSource().equals(button0)) {
            amount.append("0");
            textAreaCustomer.setText(amount.toString());
        }


        if (e.getSource().equals(enter)) {

            System.out.println("Stringbuilder: " + amount.toString());
            System.out.println("textArea " + textAreaCustomer.getText());

            //if (Integer.parseInt(amount.toString()) > account.getBalance()){
            if (Integer.parseInt(textAreaCustomer.getText()) > account.getBalance()) {
                System.out.println("Too large amount. The balance is " + account.getBalance() + ". Try again");
                GUIuttag guIuttag = new GUIuttag(account, "Too large amount. The balance is " + account.getBalance() + ". Try again");

            } else if (Integer.parseInt(textAreaCustomer.getText()) <= account.getBalance()) {
                account.setBalance(account.getBalance() - Integer.parseInt(textAreaCustomer.getText()));
                textAreaBank.setText("Here are your money. The balance after the withdrawal is " + account.getBalance());
            }


        }


    }
}