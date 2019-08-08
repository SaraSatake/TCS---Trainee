
public abstract class Veiculo {
	private String nome;
	private String cor;
	private String placa;
	private int ano;
	private boolean status;
	private double CapacidadeTanque;
	private double SituacaoTanque;
	
	public Veiculo(String nome, String cor, String placa, int ano, boolean status, double CapacidadeTanque, double SituacaoTanque) {
		this.nome = nome;
		this.cor = cor;
		this.placa = placa;
		this.ano = ano;
		this.status = status;
		this.CapacidadeTanque = CapacidadeTanque;
		this.SituacaoTanque = SituacaoTanque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getCapacidadeTanque() {
		return CapacidadeTanque;
	}

	public void setCapacidadeTanque(double capacidadeTanque) {
		CapacidadeTanque = capacidadeTanque;
	}

	public double getSituacaoTanque() {
		return SituacaoTanque;
	}

	public void setSituacaoTanque(double situacaoTanque) {
		SituacaoTanque = situacaoTanque;
	}
	
	
	
	
	
}
