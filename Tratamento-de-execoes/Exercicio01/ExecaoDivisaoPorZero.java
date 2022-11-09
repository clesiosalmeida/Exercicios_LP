package Exercicio01;
import javax.swing.JOptionPane;

public class ExecaoDivisaoPorZero {
  public static void main(String[] args) throws Exception {
    int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro numero"));
    int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo numero"));

    Divisao divisao = new Divisao();

    try {
      JOptionPane.showMessageDialog(null, divisao.calcula(A, B));
    } catch (ArithmeticException e1) {
      JOptionPane.showMessageDialog(null, "Não pode dividir por zero!");
    }
  }
}