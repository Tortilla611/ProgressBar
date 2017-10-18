
package progressbar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class ProgressBar2 extends JFrame {
    JProgressBar Barra;
    public ProgressBar2(){
        this.setTitle("Cargando");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,250);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        Barra=new JProgressBar(0,100);
        Barra.setStringPainted(true);
        this.getContentPane().add(Barra,new AbsoluteConstraints(10,60,250,50));
        this.setVisible(true);
        
    }
    public static void main(String[]args){
        ProgressBar2 n=new ProgressBar2();
    }
}
