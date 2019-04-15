
public class Carro {
	private String marca;
	private float motor;
	private String cor;
	private String combustivel;
	private float quilometragem;
	
	public Carro (String marca, float motor, String cor, String combustivel, float quilometragem) {
		this.marca = marca;
		this.motor = motor;
		this.cor = cor;
		this.combustivel = combustivel;
				
		}

	public float getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(float quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public static void main (String [] args){
		
		Carro c[] = new Carro [20];
		
		c[0] = new Carro ("Fiat Pálio", 1.0f, "Prata","Totalflex", 50.000f);
		c[1] = new Carro ("Fiat Pálio", 1.0f, "Prata","Totalflex", 50.000f);
		c[2] = new Carro ("Fiat Pálio", 1.0f, "Prata","Totalflex", 50.000f);
		c[3] = new Carro ("Hyundai HB20",1.6f, "Branco","Totalflex", 40.000f);
		c[4] = new Carro ("Hyundai HB20",1.6f, "Branco","Totalflex", 40.000f);
		c[5] = new Carro ("Volkswagem Gol",1.0f, "Preto","Gasolina", 55.000f);
		c[6] = new Carro ("Volkswagem Gol",1.0f, "Preto","Gasolina", 55.000f);
		c[7] = new Carro ("Volkswagem Gol",1.0f, "Preto","Gasolina", 55.000f);
		c[8] = new Carro ("Volkswagem Gol",1.0f, "Preto","Gasolina", 55.000f);
		c[9] = new Carro ("Volkswagem Gol",1.0f, "Preto","Gasolina", 55.000f);
		c[10] = new Carro ("GM Camaros", 3.0f, "Amarelo","Totalflex", 7.000f);
		c[11] = new Carro ("GM Camaros", 3.0f, "Amarelo","Totalflex", 7.000f);
		c[12] = new Carro ("GM Camaros", 3.0f, "Amarelo","Totalflex", 7.000f);
		c[13] = new Carro ("Ford Fusion", 2.0f, "Preto","Totalflex", 15.000f);
		c[14] = new Carro ("Ford Fusion", 2.0f, "Preto","Totalflex", 15.000f);
		c[15] = new Carro ("Dodge Viper", 8.3f, "Azul","Gasolina", 5.000f);
		c[16] = new Carro ("Dodge Viper", 8.3f, "Azul","Gasolina", 5.000f);
		c[17] = new Carro ("Fiat UNO", 1.0f, "Branco","Totalflex", 39.000f);
		c[18] = new Carro ("Chevrolet Cobalt", 1.8f, "Vermelho","Totalflex", 34.000f);
		c[19] = new Carro ("Chevrolet Cobalt", 1.8f, "Vermelho","Totalflex", 34.000f);
	
	}
	

}
