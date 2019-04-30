
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {

 	private  String nome;
    private  String end;
    private  int telefone;
    private  int idade;
    private  int rg;
    private  int cpf;



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}



	public void Cadastrar() {
	    Scanner leitor = new Scanner(System.in);
		int in = 0;

		new Clear().clearConsole();
		System.out.print("\n  Cadastro Cliente\n\n  Digite seu nome: ");
		this.nome = leitor.nextLine();
		
		while(true) {
			new Clear().clearConsole();
		
			  	System.out.print("\n  Digite seu endereço: ");
				this.end = leitor.nextLine();
				in = 0;
				leitor.nextLine();
			}
		
		while(true) {
			new Clear().clearConsole();
		
			  	System.out.print("\n  Digite seu telefone: ");
				this.telefone = leitor.nextInt();
				in = 0;
				leitor.nextLine();
			}
			
		
	

		while(true) {
			new Clear().clearConsole();

				System.out.print("\n\n  Digite sua idade: ");
				this.idade = leitor.nextInt();
				in = 0;
				leitor.nextLine();
			}
		

		while(true) {
			new Clear().clearConsole();
		
			  	System.out.print("\n  Digite seu cpf: ");
				this.cpf = leitor.nextInt();
				in = 0;
				leitor.nextLine();
			}
		

		new Clear().clearConsole();
		leitor.nextLine();
		System.out.print("\n  Digite seu rg: ");
		this.rg = leitor.nextInt();
	}




}
	
