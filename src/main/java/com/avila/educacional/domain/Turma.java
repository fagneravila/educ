package com.avila.educacional.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Turma implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String descricao;
		
		@JsonManagedReference
		@ManyToMany(mappedBy = "turmas")
		private List<Professor> professores = new ArrayList<>();
		
				
		public Turma() {
			super();
		}


		public Turma(Integer id, String descricao) {
			super();
			this.id = id;
			this.descricao = descricao;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}


		public List<Professor> getProfessores() {
			return professores;
		}


		public void setProfessores(List<Professor> professores) {
			this.professores = professores;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Turma other = (Turma) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}


	
		
		
		

}