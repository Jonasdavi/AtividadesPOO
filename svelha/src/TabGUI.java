import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class TabGUI {
    private JFrame jPrinc;
    private JPanel jp[];
    private JButton jb[];
    private ImageIcon imgX, imgO;

    public TabGUI(){
        jPrinc= new JFrame("Jogo Da Velha");

        jp= new JPanel[9];
        jb= new JButton[9];
        imgX= new ImageIcon("src/X.png");
        imgO= new ImageIcon("src/O.png");

        jPrinc.getContentPane().setLayout(new GridLayout(3,3, 10, 10));

        for (int i=0; i<jp.length; i++) {
            jp[i]= new JPanel();
            jb[i]= new JButton();
            
            jb[i].setBackground(Color.BLACK);
            jp[i].setBackground(Color.BLACK);

            jp[i].setLayout(new BorderLayout());

            jp[i].add(jb[i]);
            jPrinc.add(jp[i], i);
        }
        
        jPrinc.setSize(600,600);
        jPrinc.setVisible(true);

        this.zerarTabuleiroGUI();
    }

    public void addCaractere(int linha, int coluna, char caractere){
        jb[linha*3+coluna].setIcon(caractere=='X'? imgX : imgO);
    }

    public void zerarTabuleiroGUI(){
        for(int i=0; i< jb.length; i++){
            jb[i].setIcon(null);
        }
    }

}
