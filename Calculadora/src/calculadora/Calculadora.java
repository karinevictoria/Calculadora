package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) 
    {
        String numero1 = JOptionPane.showInputDialog ("Digite o primeiro numero");
        String numero2 = JOptionPane.showInputDialog ("Digite o segundo numero");
        String operacao = JOptionPane.showInputDialog ("Digite: 1 - para adicao 2 - para subtracao 3 - para multiplicacao 4 - para divisao");        
        
        Double primeironumero = Double.parseDouble(numero1);
        Double segundonumero = Double.parseDouble(numero2);
        Integer op = Integer.parseInt(operacao);
        
        Operacoes ops = new Operacoes();
        
        if (op == 1){
            ops.soma(primeironumero, segundonumero);
        }
        
        if (op == 2){
        ops.subtraçao(primeironumero, segundonumero);
        
        }
        if (op == 3){ 
        ops.multiplicacao(primeironumero, segundonumero);
        
        }
        if (op == 4){
        ops.divisao(primeironumero, segundonumero);
        
        }
        
                        
    }
    
}
