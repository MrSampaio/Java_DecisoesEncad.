package decisoes_encadeadas;
import javax.swing.JOptionPane;
public class exe1 {
	public static void main(String[] args) {
		
		
		double element1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o elemento um: "));
		double element2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o elemento dois: "));
		double element3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o elemento três: "));
		
		
		double media = (element1 + element2 + element3)/3;
		JOptionPane.showMessageDialog(null, "A média dos elementos é: " + media ); //media 
		
		double maior = 0;
		double menor = 0;
		
		
		if (element1>element2 && element1>element3){
			maior = element1;}
		if ( element2>element3){
			menor = element3;}
		if ( element3>element2){
			menor = element2;// teste element1
		
		
		if (element2>element1 && element2>element3){
			maior = element2;}
		if ( element1>element3){
			menor = element3;}
		if( element3>element1){
			menor = element1;}// teste element2
		
		if (element3>element1 && element3>element2){
			maior = element3;}
		if ( element1>element2){
			menor = element2;}
		if ( element2>element1){
			menor = element1;}// teste element3
		
		JOptionPane.showMessageDialog(null, "O maior elemento é: " + maior + "\nO menor elemento é: " + menor);// fim maior/menor
		
		int faixa1 = 0;
		int faixa2 = 0;
		int faixa3 = 0;
		int faixa4 = 0;
		int faixa5 = 0;
		
		
		if (element1<0){
			JOptionPane.showMessageDialog(null, "O elemento " + element1 + " pertence a faixa 1.");
			faixa1++;}
		else if (element1>=0 && element1<15){
				JOptionPane.showMessageDialog(null, "O elemento " + element1 + " pertence a faixa 2.");
				faixa2++;}
		else if (element1>=15 && element1<100){
			JOptionPane.showMessageDialog(null, "O elemento " + element1 + "  pertence a faixa 3.");
			faixa3++;}
		else if (element1>=1000){
			JOptionPane.showMessageDialog(null, "O elemento " + element1 + "  pertence a faixa 4.");
			faixa4++;}
		else if (element1>101 && element1<1000){
			JOptionPane.showMessageDialog(null, "O elemento " + element1 + "  pertence a faixa 5.");
			faixa5++;}// fim faixa element1
		
		
		if (element2<0){
			JOptionPane.showMessageDialog(null, "O elemento " + element2 + " pertence a faixa 1.");
			faixa1++;}
		else if (element2>=0 && element2<15){
				JOptionPane.showMessageDialog(null, "O elemento " + element2 + "  pertence a faixa 2.");
				faixa2++;}
		else if (element2>=15 && element2<100){
			JOptionPane.showMessageDialog(null, "O elemento " + element2 + "  pertence a faixa 3.");
			faixa3++;}
		else if (element2>=1000){
			JOptionPane.showMessageDialog(null, "O elemento " + element2 + "  pertence a faixa 4.");
			faixa4++;}
		else if (element2>101 && element2<1000){
			JOptionPane.showMessageDialog(null, "O elemento " + element2 + "  pertence a faixa 5.");
			faixa5++;}// fim faixa element2
		
		
		if (element3<0){
			JOptionPane.showMessageDialog(null, "O elemento " + element3 + " pertence a faixa 1.");
			faixa1++;}
		else if (element3>=0 && element3<15){
				JOptionPane.showMessageDialog(null, "O elemento " + element3 + "  pertence a faixa 2.");
				faixa2++;}
		else if (element3>=15 && element3<100){
			JOptionPane.showMessageDialog(null, "O elemento " + element3 + "  pertence a faixa 3.");
			faixa3++;}
		else if (element3>=1000){
			JOptionPane.showMessageDialog(null, "O elemento " + element3 + "  pertence a faixa 4.");
			faixa4++;}
		else if (element3>101 && element3<1000){
			JOptionPane.showMessageDialog(null, "O elemento " + element3 + "  pertence a faixa 5.");
			faixa5++;}// fim faixa element3
		
		JOptionPane.showMessageDialog(null, "A quantidade de elementos na faixa 1 é: " + faixa1 + "\nA quantidade de elementos na faixa 2 é: " + faixa2 + "\nA quantidade de elementos na faixa 3 é: " + faixa3 + "\nA quantidade de elementos na faixa 4 é: " + faixa4 + "\nA quantidade de elementos na faixa 5 é: " + faixa5);
// fim contagem de elementos
		
		
		int par = 0;
		int impar = 0;
		
		if ( element1 % 2 == 0){
			JOptionPane.showMessageDialog(null, "O elemento " + element1 + " é par.");
			par++;}
		if ( element1 % 2 != 0){
			JOptionPane.showMessageDialog(null, "O elemento " + element1 + " é ímpar.");
			impar++;}// fim par/impar element1
		
		
		if ( element2 % 2 == 0){
			JOptionPane.showMessageDialog(null, "O elemento " + element2 + " é par.");
			par++;}
		if ( element2 % 2 != 0){
			JOptionPane.showMessageDialog(null, "O elemento " + element2 + " é ímpar.");
			impar++;}// fim par/impar element2
		
		
		if ( element3 % 2 == 0){
			JOptionPane.showMessageDialog(null, "O elemento " + element3 + " é par.");
			par++;}
		if ( element3 % 2 != 0){
			JOptionPane.showMessageDialog(null, "O elemento " + element3 + " é ímpar.");
			impar++;}// fim par/impar element3
		
		JOptionPane.showMessageDialog(null, "O total de elementos pares é: " + par + "\nO total de elementos ímpares é: " + impar );
		
		System.exit(0);
		
		}
		
}
}
