package cont_decisoes;
import javax.swing.JOptionPane;
public class exe4 {
	public static void main(String[] args) {
		
		
		double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado A: "));
		double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado B: "));
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado C: "));
		
		if (A==B && B==C){
			JOptionPane.showMessageDialog(null, "O tri�ngulo � equil�tero.");}
		if (A==B && B!=C){
			JOptionPane.showMessageDialog(null, "O tri�ngulo � is�sceles.");}
		if (A!=B && B!=C){
			JOptionPane.showMessageDialog(null, "O tri�ngulo � escaleno.");}
		
		
		

	}

}
