import javax.swing.JOptionPane;

public class ex03 {
public static void main(String[] args) {

float valorPrestacao , multa , qtdeDias, prestacao;



System.out.print("***Calculo Prestação****");

valorPrestacao = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite o valor da parcela: "));

multa = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite a porcentagem da multa: "));

qtdeDias = Float.parseFloat(JOptionPane.showInputDialog(null,
"Digite a quantidade de dias de atraso: "));

prestacao =  valorPrestacao + (valorPrestacao*(multa/100)*qtdeDias) ;

JOptionPane.showMessageDialog(null,"Valor da prestação atualizado: " + prestacao  );

}
}