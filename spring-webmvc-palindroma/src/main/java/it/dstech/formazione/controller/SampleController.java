package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value  = "/testChiamata")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		System.out.println(testo);
		// controllo se frase è palindroma
		
		return new ModelAndView("risultato","testo",testo);
	}
}
