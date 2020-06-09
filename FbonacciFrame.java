/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

/**
 *
 * @author Lenovo
 */
import Fibon.Fibonacci;

public class FbonacciFrame extends javax.swing.JFrame {

    public FbonacciFrame() {

        initComponents();

        

    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        boton1 = new javax.swing.JButton();

        text = new javax.swing.JTextField();

        boton = new javax.swing.JButton();

        label = new javax.swing.JLabel();

        jScrollPane1 = new javax.swing.JScrollPane();

        TextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);

        boton1.setText("Borrar");

        boton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                boton1ActionPerformed(evt);

            }

        });

        getContentPane().add(boton1);

        boton1.setBounds(0, 79, 90, 23);

        text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        getContentPane().add(text);

        text.setBounds(240, 20, 72, 20);

        boton.setText("Mostrar");

        boton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                botonActionPerformed(evt);

            }

        });

        getContentPane().add(boton);

        boton.setBounds(0, 50, 90, 23);

        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        label.setText("Ingrese el numero de ciclos");

        getContentPane().add(label);

        label.setBounds(10, 20, 200, 20);

        TextArea.setColumns(20);

        TextArea.setRows(5);

        jScrollPane1.setViewportView(TextArea);

        getContentPane().add(jScrollPane1);

        jScrollPane1.setBounds(100, 50, 340, 52);

        pack();

    }// </editor-fold>

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {                                       

TextArea.setText(null);   

text.setText(null);

text.requestFocusInWindow();

    }                                      

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {                                      

        TextArea.setText(null);

        int a = 0, b = 1, c;

        int n = Integer.parseInt(text.getText());

        for (int i = 0; i < n; i++) {

            c = a + b;

            a = b;

            b = c;

            TextArea.append(a + "|");

        }

    }                                     

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new FbonacciFrame().setVisible(true);

            }

        });

    }

    // Declaracion de Variables

    private javax.swing.JTextArea TextArea;

    private javax.swing.JButton boton;

    private javax.swing.JButton boton1;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JLabel label;

    private javax.swing.JTextField text;

    // End of variables declaration

}