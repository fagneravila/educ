package com.avila.educacional;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.avila.educacional.domain.NivelEnsino;
import com.avila.educacional.domain.Professor;
import com.avila.educacional.domain.Turma;
import com.avila.educacional.repository.NivelEnsinoRepository;
import com.avila.educacional.repository.ProfessorRepository;
import com.avila.educacional.repository.TurmaRepository;

@SpringBootApplication
public class TallamoEducacionalApplication implements CommandLineRunner {

	@Autowired
	private NivelEnsinoRepository  nerepository;
	
	@Autowired
	private TurmaRepository  trepository;
	
	@Autowired
	private ProfessorRepository  prepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TallamoEducacionalApplication.class, args);
					
	}

	@Override
	public void run(String... args) throws Exception {
		
		NivelEnsino ne1 = new NivelEnsino(null,"Ensino Superior");
		NivelEnsino ne2 = new NivelEnsino(null,"Ensino Basico");
		nerepository.saveAll(Arrays.asList(ne1,ne2));
		
		Turma t1 = new Turma(null,"turma1");
		Turma t2 = new Turma(null,"turma2");
		Turma t3 = new Turma(null,"turma3");
				
		
		Professor p1 = new Professor(null,"professor1");
		Professor p2 = new Professor(null,"professor2");
		Professor p3 = new Professor(null,"professor3");
		Professor p4 = new Professor(null,"professor3");
		
		t1.getProfessores().addAll(Arrays.asList(p3));
		t2.getProfessores().addAll(Arrays.asList(p1,p4));
		t3.getProfessores().addAll(Arrays.asList(p2));
		
		
		p1.getTurmas().addAll(Arrays.asList(t2));
		p2.getTurmas().addAll(Arrays.asList(t3));
		p3.getTurmas().addAll(Arrays.asList(t1));
		p4.getTurmas().addAll(Arrays.asList(t2));
		

		trepository.saveAll(Arrays.asList(t1,t2,t3));
		
		
		prepository.saveAll(Arrays.asList(p1,p2,p3,p4));
	    	

}
}
