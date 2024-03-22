package com.mycompany.proyecto;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Cliente extends JFrame{
   private JButton btnAgregarUsuario;
   private JButton btnIniciarSesion;
   private JButton btnCerrarSesion;
    
public Cliente() {
        super("Fide App");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        setSize(400, 200);
        setVisible(true);
    }    


    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        btnAgregarUsuario = new JButton("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir una ventana para que el usuario registre sus datos
                JOptionPane.showMessageDialog(null, "Ventana de registro de usuario");
            }
        });
        panel.add(btnAgregarUsuario);

        btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir una ventana para que el usuario inicie sesión
                JOptionPane.showMessageDialog(null, "Ventana de inicio de sesión");
            }
        });
        panel.add(btnIniciarSesion);

        btnCerrarSesion = new JButton("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la lógica para cerrar sesión del usuario
                JOptionPane.showMessageDialog(null, "Cerrar Sesión");
            }
        });
        panel.add(btnCerrarSesion);
        getContentPane().add(panel);
    
    }
}//Fin de la  clase
