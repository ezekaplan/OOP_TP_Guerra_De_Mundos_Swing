package oop.tp.guerrademundos;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ekapl1 on 5/22/17.
 */
public class Configuracion {
    private JButton JUGARButton;
    private JTextField txtCantJugadores;
    private JTextField txtCantPlanetas;
    private JPanel panelMain;

    public static void main(String[] args) {
        //open in a new thread
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });

        JFrame frame = new JFrame("Guerra de Mundos!");
        frame.setContentPane(new Configuracion().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
