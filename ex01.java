import javax.swing.JOptionPane;

public class ex01 {
public static void main(String[] args) {

int dias , meses, anos , idade_Em_Dias;



System.out.print("***Digite sua idade em anos, meses e dias****");

anos = Integer.parseInt(JOptionPane.showInputDialog(null,
"Digite sua idade em anos: "));

meses = Integer.parseInt(JOptionPane.showInputDialog(null,
"Digite sua idade em meses: "));

dias = Integer.parseInt(JOptionPane.showInputDialog(null,
"Digite sua idade em dias: "));

idade_Em_Dias = ((anos * 365) + (meses * 30) + dias);

JOptionPane.showMessageDialog(null,"Sua idade em dias é: " + idade_Em_Dias + " dias.");

}
}
