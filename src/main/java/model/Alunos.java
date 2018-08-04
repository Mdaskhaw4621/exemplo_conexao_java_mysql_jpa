package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alunos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_aluno;
	
	@Column
	private String nome;
	
	@Column 
	private String endereco;
	
	public int getId_aluno() {
		return this.id_aluno;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setId_aluno(int id) {
		this.id_aluno = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
