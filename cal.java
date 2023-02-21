import javax.swing.JOptionPane;
public class cal {
    public static void main(String[]args){
        System.out.println("Calculadora hecho por un programador infuncional");
        JOptionPane.showMessageDialog(null,"Bienvenido a este programa de calculadora");
        String opcion = JOptionPane.showInputDialog("Pon un operador: ");
        switch(opcion){
            case"+":
            JOptionPane.showMessageDialog(null,"Has selecionado la opcion suma!");
            double num= Double.parseDouble(JOptionPane.showInputDialog("Pon el primer numero:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Pon el segundo numero: "));
            double result = num + num2;
            JOptionPane.showMessageDialog(null,"El resultado de tu suma es: "+result);
            System.exit(0);
            break;

            case"-":
            JOptionPane.showMessageDialog(null,"Has selecionado la opcion resta!");
            double num3= Double.parseDouble(JOptionPane.showInputDialog("Pon el primer numero:"));
            double num4 = Double.parseDouble(JOptionPane.showInputDialog("Pon el segundo numero: "));
            double restita = num3 - num4;
            JOptionPane.showMessageDialog(null,"El resultado de tu resta es: "+restita);
            System.exit(0);
            break;
            
            case"*":
            JOptionPane.showMessageDialog(null,"Has selecionado la opcion multiplicacion!");
            double nu5= Double.parseDouble(JOptionPane.showInputDialog("Pon el primer numero:"));
            double num6 = Double.parseDouble(JOptionPane.showInputDialog("Pon el segundo numero: "));
            double mult = nu5 * num6;
            JOptionPane.showMessageDialog(null,"El resultado de tu multiplicacion es: "+mult);
            System.exit(0);
            break;
            
            case"/":
            JOptionPane.showMessageDialog(null,"Has selecionado la opcion division!");
            double num7= Double.parseDouble(JOptionPane.showInputDialog("Pon el primer numero:"));
            double num8 = Double.parseDouble(JOptionPane.showInputDialog("Pon el segundo numero: "));
            double division = num7 + num8;
            JOptionPane.showMessageDialog(null,"El resultado de tu division es: "+division);
            System.exit(0);
            break;
        }
        
        JOptionPane.showMessageDialog(null,"Eso no es un operador, imbécil");
    }


}
