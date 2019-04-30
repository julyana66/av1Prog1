

import java.util.InputMismatchException;
import java.util.Scanner;

public class Veiculo {
    private String marca;
    private float motor;
    private String cor;
    private String combustivel;
    private float Km;
	private boolean disponivel = true;

		

		public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getMotor() {
		return motor;
	}


	public void setMotor(float motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

		public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

		public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}



	public void CadastrarVeiculo() {
	    Scanner leitor = new Scanner(System.in);
		int in = 0;

		new Clear().clearConsole();
		System.out.print("\n  Cadastro Veiculo\n\n  Digite a marca: ");
		this.marca = leitor.nextLine();
		
		while(true) {
			new Clear().clearConsole();
		
			  	System.out.print("\n  Digite o motor: ");
				this.motor = leitor.nextFloat();
				in = 0;
				leitor.nextLine();
			}
		
		while(true) {
			new Clear().clearConsole();
		
			  	System.out.print("\n  Digite a cor: ");
				this.cor = leitor.nextLine();
				in = 0;
				leitor.nextLine();
			}
			
		
		while(true) {
			new Clear().clearConsole();

				System.out.print("\n\n  Digite o combustivel: ");
				this.combustivel = leitor.nextLine();
				in = 0;
				leitor.nextLine();
			}
		

		new Clear().clearConsole();
		leitor.nextLine();
		System.out.print("\n  Digite a quilometragem: ");
		this.Km = leitor.nextFloat();
	}




}