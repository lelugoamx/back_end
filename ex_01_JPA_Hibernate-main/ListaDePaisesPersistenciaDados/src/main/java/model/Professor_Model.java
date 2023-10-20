package model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")

public class Professor_Model {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		@Column(name = "id_professor")
		private Integer id;
		@Column(name = "nome")
		private String nome;
		@Column(name = "especialidade")
		private String especialidade;
		@Column(name = "dataAdmissao")
		private String dataAdmissao;

		public Professor_Model() {
			
		}
		public Professor_Model(String nome,String especialidade,String dataAdimissao) {
	    this.nome = nome;
	    this.especialidade = especialidade;
	    this.dataAdmissao = dataAdimissao;
		}
		public Integer getId() {
			return id;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEspecialidade() {
			return especialidade;
		}
		public void setEspecialidade(String especialidade) {
			this.especialidade = especialidade;
		}
		public String getDataAdmissao() {
			return dataAdmissao;
		}
		public void setDataAdmissao(String dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
		}
		@Override
		public int hashCode() {
			return Objects.hash(dataAdmissao, especialidade, id, nome);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Professor_Model other = (Professor_Model) obj;
			return Objects.equals(dataAdmissao, other.dataAdmissao)
					&& Objects.equals(especialidade, other.especialidade) && Objects.equals(id, other.id)
					&& Objects.equals(nome, other.nome);
		}
		@Override
		public String toString() {
			return "Professor_Model [id=" + id + ", nome=" + nome + ", especialidade=" + especialidade
					+ ", dataAdmissao=" + dataAdmissao + "]";
		}
		
		


	

}
