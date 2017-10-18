
package progressbar;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class ProgressBar3 extends JFrame {
    JLabel etiFin;
    JButton btnFinalizar;
    
    public ProgressBar3(){
       this.setTitle("Finalizar");
       this.setSize(500,200);
       this.setResizable(false);
       this.getContentPane().setLayout(new AbsoluteLayout());
       
       etiFin=new JLabel("Ya estas Registrado");
       this.getContentPane().add(etiFin,new AbsoluteConstraints(140,30,200,50));
       etiFin.setFont(new Font("Arial Black",1,15));
       btnFinalizar=new JButton("Finalizar");
       this.getContentPane().add(btnFinalizar,new AbsoluteConstraints(200,100,100,50));
       this.setVisible(true);
       
    }
    public static void main(String[]args){
        ProgressBar3 m=new ProgressBar3();
     
    }
}
