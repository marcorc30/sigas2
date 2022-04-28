package org.lasalle.sigas.controller;

import javax.validation.Valid;

import org.lasalle.sigas.model.Candidato;
import org.lasalle.sigas.model.Sexo;
import org.lasalle.sigas.repositorymem.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CandidatoController {
	
	@Autowired
	ResponsavelRepository ResponsavelRepository;

	@RequestMapping("/novo/candidato")
	public String novoCandidato(Candidato candidato, Model model) { 
		model.addAttribute("lista", ResponsavelRepository.listar());
		model.addAttribute("sexos", Sexo.values());
		return "candidato/novoCandidato";
	}
	
	
	@RequestMapping(value="/novo/candidato", method = RequestMethod.POST)
	public String cadastrar(@Valid Candidato candidato, BindingResult result, RedirectAttributes attributes, Model model) {
		
		String mensagem;
		
		if (result.hasErrors()) {
			return novoCandidato(candidato, model);
		}
		
		mensagem = "Candidato salvo com sucesso";
		
		attributes.addFlashAttribute("mensagem", mensagem);
		
		return "redirect:/novo/candidato";
		
	}
}
