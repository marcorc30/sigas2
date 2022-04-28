package org.lasalle.sigas.repositorymem;

import java.util.ArrayList;
import java.util.List;

import org.lasalle.sigas.model.Responsavel;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class ResponsavelRepository {


	private List<Responsavel> responsaveis = new ArrayList<Responsavel>();
	
	public void salvar(Responsavel responsavel) {
		responsaveis.add(responsavel);
		
		for (Responsavel responsavel2 : responsaveis) {
			System.out.println(responsavel2.getNome());
			
		}
		
	}
	
	@Bean
	public List<Responsavel> listar(){
		System.out.println("listando responsáveis");
		return responsaveis;
	}
	
	public Responsavel getResponsavel() {
		return responsaveis.get(0);
	}
	
	

}
