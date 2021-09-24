package Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
//import java.awt.event.*;
import java.awt.event.WindowListener;

class MyCal extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, lb3, lb4, lb5, lb6;
    Button btn, btn1, btn2, btn3, btn4;
    TextField tf1, tf2;

    public MyCal() {

        setVisible(true);
        setName("Calculator by @BAKI");
        setBackground(Color.GRAY);
        setBounds(100, 80, 400, 500);
        setLayout(null);

        Font font = new Font("serif", Font.PLAIN, 20);

        lb1 = new Label("Enter First Number");
        lb1.setBounds(20, 50, 180, 30);
        lb1.setForeground(Color.red);
        lb1.setFont(font);
        add(lb1);

        tf1 = new TextField();
        tf1.setBounds(200, 50, 150, 30);
        tf1.setForeground(Color.red);
        tf1.setFont(font);
        add(tf1);

        lb2 = new Label("Enter Second Number");
        lb2.setBounds(20, 90, 180, 30);
        lb2.setForeground(Color.red);
        lb2.setFont(font);
        add(lb2);

        tf2 = new TextField();
        tf2.setBounds(200, 90, 150, 30);
        tf2.setForeground(Color.red);
        tf2.setFont(font);
        add(tf2);

        btn = new Button("Addition");
        btn.setBounds(40, 180, 110, 40);
        btn.setBackground(Color.red);
        btn.setFont(font);
        add(btn);

        lb3 = new Label();
        lb3.setBounds(160, 180, 150, 30);
        lb3.setForeground(Color.RED);
        lb3.setFont(font);
        add(lb3);

        btn1 = new Button("Substraction");
        btn1.setBounds(40, 230, 110, 40);
        btn1.setBackground(Color.red);
        btn1.setFont(font);
        add(btn1);

        lb4 = new Label();
        lb4.setBounds(160, 230, 150, 30);
        lb4.setForeground(Color.RED);
        lb4.setFont(font);
        add(lb4);

        btn2 = new Button("Multiply");
        btn2.setBounds(40, 280, 110, 40);
        btn2.setBackground(Color.red);
        btn2.setFont(font);
        add(btn2);

        lb5 = new Label();
        lb5.setBounds(160, 280, 150, 30);
        lb5.setForeground(Color.RED);
        lb5.setFont(font);
        add(lb5);

        btn3 = new Button("Division");
        btn3.setBounds(40, 330, 110, 40);
        btn3.setBackground(Color.red);
        btn3.setFont(font);
        add(btn3);

        lb6 = new Label();
        lb6.setBounds(160, 330, 150, 30);
        lb6.setForeground(Color.RED);
        lb6.setFont(font);
        add(lb6);
        
        btn4 = new Button("CLEAR");
        btn4.setBounds(160, 380, 110, 40);
        btn4.setBackground(Color.red);
        btn4.setFont(font);
        add(btn4);

        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String x = tf1.getText();
        String y = tf2.getText();

        float a = Float.parseFloat(x);
        float b = Float.parseFloat(y);

        float c = a + b;
        float d = a - b;
        float w = a * b;
        float q = a / b;

        if (e.getSource() == btn) {
            this.lb3.setText("Result=" + c);
        }

        if (e.getSource() == btn1) {
            lb4.setText("Result=" + d);
            
        }
        if (e.getSource() == btn2) {
            lb5.setText("Result=" + w);
        }

        if (e.getSource() == btn3) {
            lb6.setText("Result=" + q);
        }
        
        if (e.getSource() == btn4) {
            tf1.setText("");
            tf2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

public class Calculator {

    public static void main(String args[]) {
        new MyCal();
    }

}
