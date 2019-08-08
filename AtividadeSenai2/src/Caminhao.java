
public class Caminhao extends Veiculo implements Acoes {

	public Caminhao(String nome, String cor, String placa, int ano, boolean status, int CapacidadeTanque,
			int SituacaoTanque) {
		super(nome, cor, placa, ano, status, CapacidadeTanque, SituacaoTanque);

	}

	@Override
	public void Ligar() {
		if (isStatus() == true) {
			System.out.println("O caminhao ja esta ligado!");
		} else {
			System.out.println("Ligando o caminhao.");
			setStatus(true);
		}

	}

	@Override
	public void Desligar() {
		if (isStatus() == false) {
			System.out.println("O caminhao ja esta desligado");
		} else {
			System.out.println("Desligando o caminhao.");
			setStatus(false);
		}

	}

	@Override
	public void Acelerar() {
		if (isStatus() == false) {
			System.out.println("O caminhao esta desligado!");
		} else {
			if (getSituacaoTanque() > 0) {
				System.out.println("Acelerando!!");
				setSituacaoTanque(getSituacaoTanque() - 15);
			} else {
				System.out.println("O tanque esta vazio");
			}

		}

	}

	@Override
	public void Abastecer(double litro) {
		if (litro > getCapacidadeTanque() || (litro + getSituacaoTanque() > getCapacidadeTanque())) {
			System.out.println("O valor extrapola a capacidade do tanque!");
		} else {

			if (getSituacaoTanque() == getCapacidadeTanque()) {
				System.out.println("O tanque ja esta cheio");
			} else {
				setSituacaoTanque(getSituacaoTanque() + litro);
				double conta = litro * 10.00;
				System.out.println("Abastecido! O total a pagar foi R$" + conta);
			}
		}
	}

	@Override
	public void TrocarPneu() {
		System.out.println("Pneu do caminhao trocado.");

	}

	@Override
	public void Situacao() {
		System.out.println("-----------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Cor: " + getCor());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Ano: " + getAno());
		System.out.println("Status: " + isStatus() +"(false = desligado/ true = ligado)");
		System.out.println("Capacidade Tanque: " + getCapacidadeTanque());
		System.out.println("Situacao Tanque: " + getSituacaoTanque());
		System.out.println("-----------------------------------");
	}

}
