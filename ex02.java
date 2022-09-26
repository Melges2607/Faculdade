import javax.swing.JOptionPane;

public class ex02 {
public static void main(String[] args) {

float nota1 , nota2 , nota3, media_Aritmetica;



System.out.print("***Digite suas notas****");

nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite a Nota 1: "));

nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite Nota 2: "));

nota3 = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite Nota 3: "));

media_Aritmetica= ((nota1 + nota2 + nota3)/3);

JOptionPane.showMessageDialog(null,"Sua média é: " + media_Aritmetica );

}
}