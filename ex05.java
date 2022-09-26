import javax.swing.JOptionPane;

public class ex05 {
public static void main(String[] args) {

float salarioBase , salarioAReceber ;



System.out.print("***Salario Atualizado****");

salarioBase = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite o seu salário base: "));


salarioAReceber = ((salarioBase * 1.05f) -(salarioBase*0.07f)  ) ;

JOptionPane.showMessageDialog(null,"Salario a receber: " + salarioAReceber  );

}
}