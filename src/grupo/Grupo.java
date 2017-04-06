/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author danco
 */
public class Grupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maior,menor;
        Integer[] num = new Integer[5];
        
        for(int n=0; n<=4; n++)
        {
            num[n] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro:"));
            if(n == 4)
            {
            Arrays.sort(num);
            maior = num[n];
            Arrays.sort(num, Collections.reverseOrder());
            menor = num[n];
            JOptionPane.showMessageDialog(null, "Maior numero é: " + maior + "\n Menor numero é: " + menor);
            }
        }
    }
    
}
