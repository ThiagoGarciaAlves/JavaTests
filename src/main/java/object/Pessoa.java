package object;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Thiago Alves
 */
public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private double altura;
	private List<Pessoa> filhos;

	public Pessoa() {
		filhos = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "{" +
				((nome != null) ? "nome='" + nome + '\'' : "") +
				((cpf != null) ? ", cpf='" + cpf + '\'' : "") +
				((rg != null) ? ", rg='" + rg + '\'' : "") +
				((dataNascimento != null) ? ", dataNascimento=" + dataNascimento : "") +
				((altura != 0) ? ", altura=" + altura : "") +
				((filhos.size() > 0) ? ", filhos=" + filhos : "") +
				"}";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Pessoa> filhos) {
		this.filhos = filhos;
	}

	public void addFilho(Pessoa filho) {
		filhos.add(filho);
	}


}
