import javax.swing.JOptionPane;

public class ex04 {
public static void main(String[] args) {

float salario , novoSalario ;



System.out.print("***Salario Atualizado****");

salario = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite o seu salário: "));


novoSalario = (salario * 1.25f) ;

JOptionPane.showMessageDialog(null,"Salario atualizado: " + novoSalario  );

}
}