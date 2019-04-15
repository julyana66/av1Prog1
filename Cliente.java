
public class Cliente {

	private String nome;
	private String endereco;
	private int telefone;
	private int idade;
	private int rg;
	private int cpf; 
	private String carroAlugado;
	private int dataDoAluguel;
	private int dataDaDevolucao;
	
	
	public Cliente(String nome, String endereco, int telefone, int idade, int rg, int cpf, String carroAlugado,
			int dataDoAluguel, int dataDaDevolucao) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.carroAlugado = carroAlugado;
		this.dataDoAluguel = dataDoAluguel;
		this.dataDaDevolucao = dataDaDevolucao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
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


	public String getCarroAlugado() {
		return carroAlugado;
	}


	public void setCarroAlugado(String carroAlugado) {
		this.carroAlugado = carroAlugado;
	}


	public int getDataDoAluguel() {
		return dataDoAluguel;
	}


	public void setDataDoAluguel(int dataDoAluguel) {
		this.dataDoAluguel = dataDoAluguel;
	}


	public int getDataDaDevolucao() {
		return dataDaDevolucao;
	}


	public void setDataDaDevolucao(int dataDaDevolucao) {
		this.dataDaDevolucao = dataDaDevolucao;
	}
	
	
	
	
}
