package cont_decisoes;
import javax.swing.JOptionPane;
public class exe3 {
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog(null, "Informe o nome do produto: ");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade do produto: "));
		double preco_unit = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço do produto: "));
		
		double total_inicio = quantidade * preco_unit;
		
		double desconto = 0;
		double total_final = 0;
		
		if ( quantidade<=5 ){
			desconto = total_inicio/100*2;
			total_final = total_inicio - desconto;}
		
		if ( quantidade>5 && quantidade<=10){
			desconto = total_inicio/100*3;
			total_final = total_inicio - desconto;}
		
		if( quantidade>10){
			desconto = total_inicio/100*5;
			total_final = total_inicio - desconto;}
		
		JOptionPane.showMessageDialog(null, "O produto escolhido foi: " + nome +"\nO preço total é de: R$" + total_inicio + "\nO valor total do desconto é de: R$" + desconto + "\nO total a pagar é de: R$" + total_final);
			

	}

}
