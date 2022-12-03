package cont_decisoes;
import javax.swing.JOptionPane;
public class exe4 {
	public static void main(String[] args) {
		
		
		double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado A: "));
		double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado B: "));
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado C: "));
		
		if (A==B && B==C){
			JOptionPane.showMessageDialog(null, "O triângulo é equilátero.");}
		if (A==B && B!=C){
			JOptionPane.showMessageDialog(null, "O triângulo é isósceles.");}
		if (A!=B && B!=C){
			JOptionPane.showMessageDialog(null, "O triângulo é escaleno.");}
		
		
		

	}

}
