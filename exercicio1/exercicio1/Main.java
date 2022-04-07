package exercicio1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
		
		int opcao;
		
		do {
			opcao= parseInt(showInputDialog(Util.menu()));
			
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção inválida!");
			} else {
				switch (opcao) {
				case 1:
					Util.CadastrarCliente();
					break;
				case 2:
					Util.SacarDinheiro();
					break;
				case 3:
					Util.DepositarDinheiro();
					break;
				case 4:
					Util.FazerRelatorio();
					break;
				case 5: 
					Util.EncerrarConta();
				}
			}
			
		} while(opcao != 6);
		
	}
    

}


