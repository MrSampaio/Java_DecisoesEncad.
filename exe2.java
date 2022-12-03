package cont_decisoes;
import javax.swing.JOptionPane;
public class exe2 {
public static void main(String[]args){
	
	double litrosG = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de litros de gasolina: "));
	double litrosA = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de litros de álcool: "));
	
	double val_gaso = litrosG * 3.30;
	double val_alco = litrosA * 2.90;
	
	double total_gaso = 0;
	double total_alco = 0;
	
	double porcentagemG1 = 0;
	double porcentagemA1 = 0;
	double porcentagemG2 = 0;
	double porcentagemA2 = 0;
	
	if (litrosG <= 20.0){
		porcentagemG1 = 3/100;
		total_gaso = val_gaso - ( porcentagemG1 * val_gaso);}// fim se gaso<=20
	
	if (litrosG>20.0){
		porcentagemG2 = 5/100;
		total_gaso = val_gaso - ( porcentagemG2 * val_gaso);}// fim se gaso>20
	
	if (litrosA<=20.0){
		porcentagemA1 = 4/100;
		total_alco = val_alco - (porcentagemA1 * val_alco);}// fim se alco<=20
	
	if (litrosA>20.0){
		porcentagemA2 = 6/100;
		total_alco = val_alco - (porcentagemA2 * val_alco);}// fim se alco>20
	
	JOptionPane.showMessageDialog(null, "O valor de gasolina a ser pago será de: R$" + total_gaso + "\nO valor de álcool a ser pago será de: R$" + total_alco);
		
	
	
	
	
	
	
}
}
