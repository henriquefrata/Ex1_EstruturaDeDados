package exercicio1;
import static javax.swing.JOptionPane.showMessageDialog;

public class Cliente {

    String nome;
	String cpf;
	double saldo = 0;
	
	public Cliente(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;

	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente aux = (Cliente) obj;
		if (aux.cpf.equals(cpf)) {
			return true;
		} else {
			return false;
		}
}

    public void depositar(double valor) {
    saldo = saldo + valor;
    
    }
	
	public void sacar (double valor) {
		
		if (saldo < valor) {
			showMessageDialog(null, "Sem saldo suficiente para realizar saque!");
		} else {
			saldo = saldo - valor;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "{Nome: " + nome + "} " + "{CPF: " + cpf + "} " +"{Saldo: "+ saldo +"}"; 
	}
    
}
