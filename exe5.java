package cont_decisoes;
import javax.swing.JOptionPane;
public class exe5 {
	public static void main(String[] args) {
		
		int cod = Integer.parseInt( JOptionPane.showInputDialog(null, "Digite o código do empregado: "));
		int ano_nas = Integer.parseInt (JOptionPane.showInputDialog(null, "Informe o ano de nascimento do empregado: "));
		int ano_ingre = Integer.parseInt (JOptionPane.showInputDialog(null, "Informe o ano de ingresso na empresa: "));
		
		int idade = 2022 - ano_nas ;
		int temp_traba = 2022 - ano_ingre ;
		
		if ( idade>=65 && temp_traba>=30){
			JOptionPane.showMessageDialog(null, "O empregado de número " + cod + " possui " + idade + " anos de idade e trabalhou por "+ temp_traba + " anos." + "\n O empregado está apto a aposentadoria.");}
		else if (idade>=60 && temp_traba>=25){
			JOptionPane.showMessageDialog(null, "O empregado de número " + cod + " possui " + idade + " anos de idade e trabalhou por "+ temp_traba + " anos." + "\n O empregado está apto a aposentadoria.");}
		else if ( idade<60 || temp_traba<25 ){
			JOptionPane.showMessageDialog(null, "O empregado de número " + cod + " possui " + idade + " anos de idade e trabalhou por "+ temp_traba + " anos." + "\n O empregado NÃO está apto a aposentadoria.");}

	}

}
