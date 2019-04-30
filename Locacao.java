
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Locacao{
    ArrayList<Veiculo> listVeiculo;
  private int cliente;
  private int dias;
  private String data;


	public ArrayList<Veiculo> getListVeiculo() {
	return listVeiculo;
}

public void setListVeiculo(ArrayList<Veiculo> listVeiculo) {
	this.listVeiculo = listVeiculo;
}

	public int getCliente() {
		return cliente;
	}
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}


	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getData() {
		return data;
	}

	
	public void setData(String data) {
		this.data = data;
	}


    public void alugar(int cliente, ArrayList veiculo){
        this.cliente = cliente;
        Scanner leitor = new Scanner(System.in);
        new Clear().clearConsole();

        while(true) {
            new Clear().clearConsole();
                System.out.print("\n  Cadastro Cliente\n\n  Número de dias da locação: ");
                this.dias = leitor.nextInt();
                if (this.dias < 1){
                    System.out.print("\n\n  Favor digite um número de dias válido!!");
                    leitor.nextLine();
                    continue;
                }
                System.out.println("  Favor entre com números!!");
                leitor.nextLine();
                continue;
            }
            System.out.println("  Data da locação: ");
            this.data = leitor.nextLine();
            break;
        


                 leitor.nextLine();
          
      }
    }
