package progressbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cProgressBar implements ActionListener {

    ProgressBar v;
    ProgressBar2 n;
    ProgressBar3 m;
    String u = "", p = "", a = "", c = "";

    public cProgressBar() {
        v = new ProgressBar();
        v.btnAceptar.addActionListener(this);
        v.btnCancelar.addActionListener(this);

    }

    public static void main(String[] args) {
        cProgressBar c = new cProgressBar();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.btnAceptar) {
            u = v.etiNombre.getText();
            a = v.etiApellido.getText();
            c = v.etiCorreo.getText();
            p = v.txtContraseña.getText();
            n = new ProgressBar2();
            n.setVisible(true);
            v.setVisible(false);
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    int l = 0;
                    while (l <= 100) {
                        try {
                            n.Barra.setValue(l);
                            Thread.sleep(100);
                            l++;
                        } catch (InterruptedException ex) {
                        }
                        if (l > 100) {
                            m=new ProgressBar3();
                            m.setVisible(true);
                            n.setVisible(false);
                        }
                    }
                }
            });
            t.start();
            {
            }


        }
        if (e.getSource() == v.btnCancelar ) {
            System.exit(0);
        }
    }
}
