package exercicio1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Util {
	
	static Lista<Cliente> clientes = new Lista<Cliente>();
	
	public static String menu() {
		String aux = "Escolha uma opção:\n";
		aux += "1.Abrir conta\n";
		aux += "2.Realizar saque \n";
		aux += "3.Realizar depósito \n";
		aux += "4.Relatório de contas \n";
		aux += "5.Encerrar conta \n";
		aux += "6.Finalizar";
		return aux;

	}

	public static void CadastrarCliente() {
		String nome, cpf;
		
	
		nome = showInputDialog("Insira o nome:");
		cpf = showInputDialog("Insira o CPF:");
		Cliente cliente = new Cliente(nome, cpf);
		
			if(clientes.pesquisar(cliente)!=null) {
				showMessageDialog(null, "CPF não cadastrado no sistema.");
				
			} else {
				clientes.inserir(cliente);
			}
			
		}
	
	

	public static void DepositarDinheiro() {
		double valor;
		String cpf = showInputDialog("Insira seu CPF:");
		Cliente cliente =new Cliente(null, cpf);
		No<Cliente> aux;
		
		
		if(clientes.pesquisar(cliente)!=null) {	
			aux=clientes.pesquisar(cliente);
			valor=Double.parseDouble(showInputDialog("Insira o valor do depósito: "));
			aux.dado.depositar(valor);
		} else {
			showMessageDialog(null, "CPF não encontrado no sistema.");
		}
		
	}

    public static void SacarDinheiro() {
		double valor;
		String cpf = showInputDialog("Insira seu CPF:");
		Cliente cliente =new Cliente(null, cpf);
		No<Cliente> aux;
	
		if(clientes.pesquisar(cliente)!=null) {	
			aux = clientes.pesquisar(cliente);
			valor = Double.parseDouble(showInputDialog("Insira o valor do saque: "));
			aux.dado.sacar(valor);
		} else {
			showMessageDialog(null, "CPF não encontrado.");
		}
		

	}
		
	

	public static void FazerRelatorio() {
		No<Cliente> aux = clientes.inicio;
		for(int i = 0; i < clientes.total; i++) {
			showMessageDialog(null, aux.dado.toString());
			aux = aux.dir;
		}
			}

	public static void EncerrarConta() {
		String cpf = showInputDialog("Insira seu CPF:");
		Cliente cliente = new Cliente(null, cpf);
		No<Cliente> aux;
		if(clientes.pesquisar(cliente)!=null) {	
			aux = clientes.pesquisar(cliente);
			cliente = aux.dado;
			clientes.remover(cliente);
			showMessageDialog(null, "Conta encerrada com sucesso");
		} else {
			showMessageDialog(null, "CPF não encontrado.");
		}
	}
	

}