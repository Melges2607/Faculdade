import javax.swing.JOptionPane;

public class ex06 {
public static void main(String[] args) {

float base , altura , area;



System.out.print("***Area do triângulo (em cm)****");

base = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite a base do triângulo: "));

altura = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite a altura do triângulo: "));

area =  (base * altura)/2 ;

JOptionPane.showMessageDialog(null,"Área: " + area );

}
}
