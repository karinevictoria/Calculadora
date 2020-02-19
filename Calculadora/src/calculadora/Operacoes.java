
package calculadora;
import javax.swing.JOptionPane;
public class Operacoes {
    
    public void soma (double numero1, double numero2){
        JOptionPane.showMessageDialog(null,"A soma dos numeros é:  " + (numero1+numero2));
    }
    
    public void subtraçao (double numero1, double numero2){
            JOptionPane.showMessageDialog(null,"A subtraçao dos numeros é:  " + (numero1-numero2));
          
    }
    
    public void multiplicacao (double numero1, double numero2){
        JOptionPane.showMessageDialog(null
                ,"A multiplicacao dos numeros é:  " + (numero1*numero2));
        
    }
    
     public void divisao (double numero1, double numero2){
         JOptionPane.showMessageDialog(null,"A divisao dos numeros é:  " + (numero1/numero2));
         
     }

           
    
}
