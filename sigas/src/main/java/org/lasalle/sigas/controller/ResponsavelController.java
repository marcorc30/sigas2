package org.lasalle.sigas.controller;

import java.util.List;

import javax.validation.Valid;

import org.lasalle.sigas.model.Responsavel;
import org.lasalle.sigas.repositorymem.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ResponsavelController {

	@Autowired
	ResponsavelRepository responsavelRepository;
	
	@RequestMapping("/novo/responsavel")
	public String novoResponsavel(Responsavel responsavel) {
		return "responsavel/novoResponsavel";
	}
	
	@RequestMapping(value = "/novo/responsavel", method = RequestMethod.POST)
	public String cadastrar(@Valid Responsavel responsavel, BindingResult result, RedirectAttributes attributes) {
		
		String mensagem = null;
		
		if (result.hasErrors()) {
			return novoResponsavel(responsavel);
		}
						
		responsavelRepository.salvar(responsavel);
		List<Responsavel> lista = responsavelRepository.listar();
		
		mensagem = "Responsável cadastrado com sucesso!!";
		attributes.addFlashAttribute("mensagem", mensagem);
	//	attributes.addFlashAttribute("responsavel", responsavel);
		attributes.addFlashAttribute("lista", lista);
		
		
		return "redirect:/novo/responsavel";
	}
	
}
