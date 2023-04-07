package cal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadoraa extends JFrame implements ActionListener {

    JPanel fondo = new JPanel();
    JLabel jlKasio;
    JTextField display;
    double num1, num2;
    int operacion;
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb0, jblimpiar, jbigual, jbpunto, jbsuma, jbresta, jbmult, jbdiv;

    public Calculadoraa() {
        this.setSize(280, 410);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CALCULADORA BÁSICA");
        this.setIconImage(new ImageIcon(getClass().getResource("../img/icono.png")).getImage());
        this.setLocationRelativeTo(null);
        fondo.setBackground(Color.CYAN);
        fondo.setLayout(null);
        this.setContentPane(fondo);

        jlKasio = new JLabel();
        jlKasio.setText("KASIO");
        jlKasio.setBounds(30, 50, 70, 80);
        jlKasio.setFont(new Font("cooper black", Font.BOLD, 18));
        fondo.add(jlKasio);

        display = new JTextField(" ");
        display.setFont(new Font("Arial", Font.BOLD, 50));
        display.setBounds(10, 10, 240, 50);
        display.setEditable(false);
        fondo.add(display);

        jblimpiar = new JButton("C");
        jblimpiar.setBounds(200, 70, 50, 50);
        jblimpiar.setFont(new Font("Arial", Font.BOLD, 20));
        jblimpiar.setBackground(Color.GREEN);
        jblimpiar.addActionListener(this);
        fondo.add(jblimpiar);

        jb0 = new JButton("0");
        jb0.setBounds(80, 310, 50, 50);
        jb0.setFont(new Font("Arial", Font.BOLD, 20));
        jb0.addActionListener(this);
        fondo.add(jb0);

        jb1 = new JButton("1");
        jb1.setBounds(20, 250, 50, 50);
        jb1.setFont(new Font("Arial", Font.BOLD, 20));
        jb1.addActionListener(this);
        fondo.add(jb1);

        jb2 = new JButton("2");
        jb2.setBounds(80, 250, 50, 50);
        jb2.setFont(new Font("Arial", Font.BOLD, 20));
        jb2.addActionListener(this);
        fondo.add(jb2);

        jb3 = new JButton("3");
        jb3.setBounds(140, 250, 50, 50);
        jb3.setFont(new Font("Arial", Font.BOLD, 20));
        jb3.addActionListener(this);
        fondo.add(jb3);

        jb4 = new JButton("4");
        jb4.setBounds(20, 190, 50, 50);
        jb4.setFont(new Font("Arial", Font.BOLD, 20));
        jb4.addActionListener(this);
        fondo.add(jb4);

        jb5 = new JButton("5");
        jb5.setBounds(80, 190, 50, 50);
        jb5.setFont(new Font("Arial", Font.BOLD, 20));
        jb5.addActionListener(this);
        fondo.add(jb5);

        jb6 = new JButton("6");
        jb6.setBounds(140, 190, 50, 50);
        jb6.setFont(new Font("Arial", Font.BOLD, 20));
        jb6.addActionListener(this);
        fondo.add(jb6);

        jb7 = new JButton("7");
        jb7.setBounds(20, 130, 50, 50);
        jb7.setFont(new Font("Arial", Font.BOLD, 20));
        jb7.addActionListener(this);
        fondo.add(jb7);

        jb8 = new JButton("8");
        jb8.setBounds(80, 130, 50, 50);
        jb8.setFont(new Font("Arial", Font.BOLD, 20));
        jb8.addActionListener(this);
        fondo.add(jb8);

        jb9 = new JButton("9");
        jb9.setBounds(140, 130, 50, 50);
        jb9.setFont(new Font("Arial", Font.BOLD, 20));
        jb9.addActionListener(this);
        fondo.add(jb9);

        jbmult = new JButton("X");
        jbmult.setBounds(200, 250, 50, 50);
        jbmult.setFont(new Font("Arial", Font.BOLD, 20));
        jbmult.setBackground(Color.YELLOW);
        jbmult.addActionListener(this);
        fondo.add(jbmult);

        jbsuma = new JButton("+");
        jbsuma.setBounds(200, 130, 50, 50);
        jbsuma.setFont(new Font("Arial", Font.BOLD, 20));
        jbsuma.setBackground(Color.YELLOW);
        jbsuma.addActionListener(this);
        fondo.add(jbsuma);

        jbresta = new JButton("-");
        jbresta.setBounds(200, 190, 50, 50);
        jbresta.setFont(new Font("Arial", Font.BOLD, 20));
        jbresta.setBackground(Color.YELLOW);
        jbresta.addActionListener(this);
        fondo.add(jbresta);

        jbdiv = new JButton("/");
        jbdiv.setBounds(200, 310, 50, 50);
        jbdiv.setFont(new Font("Arial", Font.BOLD, 20));
        jbdiv.setBackground(Color.YELLOW);
        jbdiv.addActionListener(this);
        fondo.add(jbdiv);

        jbpunto = new JButton(".");
        jbpunto.setBounds(20, 310, 50, 50);
        jbpunto.setFont(new Font("Arial", Font.BOLD, 20));
        jbpunto.addActionListener(this);
        fondo.add(jbpunto);

        jbigual = new JButton("=");
        jbigual.setBounds(140, 310, 50, 50);
        jbigual.setFont(new Font("Arial", Font.BOLD, 20));
        jbigual.setMnemonic('='); // alt + = da el click
        jbigual.setBackground(Color.YELLOW);
        jbigual.addActionListener(this);
        fondo.add(jbigual);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Si el origen del evento ha sido el jbo hacer:
        if (ae.getSource() == jb0) {
            display.setText(display.getText() + "0");
        }

        if (ae.getSource() == jb1) {
            display.setText(display.getText() + "1");
        }

        if (ae.getSource() == jb2) {
            display.setText(display.getText() + "2");
        }

        if (ae.getSource() == jb3) {
            display.setText(display.getText() + "3");
        }

        if (ae.getSource() == jb4) {
            display.setText(display.getText() + "4");
        }

        if (ae.getSource() == jb5) {
            display.setText(display.getText() + "5");
        }

        if (ae.getSource() == jb6) {
            display.setText(display.getText() + "6");
        }

        if (ae.getSource() == jb7) {
            display.setText(display.getText() + "7");
        }

        if (ae.getSource() == jb8) {
            display.setText(display.getText() + "8");
        }

        if (ae.getSource() == jb9) {
            display.setText(display.getText() + "9");
        }

        if (ae.getSource() == jbpunto) {
            display.setText(display.getText() + ".");
        }

        if (ae.getSource() == jblimpiar) {
            display.setText(" ");
        }

        if (ae.getSource() == jbsuma) {
            num1 = Double.parseDouble(display.getText());
            operacion = 1;
            display.setText("");
        }

        if (ae.getSource() == jbresta) {
            num1 = Double.parseDouble(display.getText());
            operacion = 2;
            display.setText("");
        }

        if (ae.getSource() == jbmult) {
            num1 = Double.parseDouble(display.getText());
            operacion = 3;
            display.setText("");
        }

        if (ae.getSource() == jbdiv) {
            num1 = Double.parseDouble(display.getText());
            operacion = 4;
            display.setText("");
        }

        if (ae.getSource() == jbigual) {
            num2 = Double.parseDouble(display.getText());
            switch (operacion) {
                case 1:
                    display.setText(String.valueOf(num1 + num2));
                    break;
                case 2:
                    display.setText(String.valueOf(num1 - num2));
                    break;
                case 3:
                    display.setText(String.valueOf(num1 * num2));
                    break;
                case 4:

                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No es posible dividir por cero");
                        //jlresultado.setText("No es posible dividir por cero");
                    } else {
                        display.setText(String.valueOf(num1 / num2));
                    }
                    break;
            }
        }
    }

}
