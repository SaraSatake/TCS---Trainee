
public class Main {
	public static void main(String[] args){
		System.out.println("**** Atividade Java SENAI ****");
		System.out.println("\tSara S. Satake\t");
		System.out.println("******************************");
		
		Carro carro1 = new Carro("car", "preto", "abc123", 2019, false, 200, 50);
		carro1.Situacao();
		carro1.Acelerar();
		carro1.Ligar();
		carro1.Situacao();
		carro1.Acelerar();
		carro1.Situacao();
		carro1.Abastecer(60);
		carro1.Situacao();
	}
}
