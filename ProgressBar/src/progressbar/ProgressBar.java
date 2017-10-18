package progressbar;

import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class ProgressBar extends JFrame {

    JLabel etiNombre, etiApellido, etiContraseña, etiCorreo;
    JButton btnAceptar, btnCancelar;
    JTextField txtNombre, txtApellido, txtCorreo, txtContraseña;

    public ProgressBar() {
        this.setTitle("Nuevo Correo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());

        etiNombre = new JLabel("Nombre");
        this.getContentPane().add(etiNombre, new AbsoluteConstraints(10, 25, 80, 10));
        etiApellido = new JLabel("Apellido");
        this.getContentPane().add(etiApellido, new AbsoluteConstraints(15, 45, 80, 10));
        etiCorreo = new JLabel("Correo");
        this.getContentPane().add(etiCorreo, new AbsoluteConstraints(20, 65, 80, 10));
        etiContraseña = new JLabel("Contraseña");
        this.getContentPane().add(etiContraseña, new AbsoluteConstraints(25, 85, 80, 10));
        btnAceptar = new JButton("Aceptar");
        this.getContentPane().add(btnAceptar, new AbsoluteConstraints(60, 120, 150, 30));
        btnCancelar = new JButton("Cancelar");
        this.getContentPane().add(btnCancelar, new AbsoluteConstraints(250, 120, 155, 30));
        txtNombre=new JTextField();
        this.getContentPane().add(txtNombre,new AbsoluteConstraints(60,20,200,15));
        txtApellido=new JTextField();
        this.getContentPane().add(txtApellido,new AbsoluteConstraints(60,40,200,15));
        txtCorreo=new JTextField();
        this.getContentPane().add(txtCorreo,new AbsoluteConstraints(60,60,200,15));
        txtContraseña=new JTextField();
        this.getContentPane().add(txtContraseña,new AbsoluteConstraints(85,85,200,15));
        
        this.setVisible(true);
        
        

    }

    public static void main(String[] args) {
        ProgressBar v = new ProgressBar();

    }
}
