package it.dstech.formazione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value = "/testChiamata")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
      
		if(palindroma(testo)) {
    	   testo=testo+" ; "+"  E' Palindroma";
       }else {
    	   testo=testo+" ; "+"  Non è Palindroma";
       }
		
		return new ModelAndView("risultato", "testo", testo);
	}

	public boolean palindroma(String frase) {
		String[] array=frase.replace(" ", "").split("");
		for (int i = 0; i < array.length/2; i++) {
			int j = array.length - i - 1;
			if (!array[i].equalsIgnoreCase(array[j])) {
				return false;
			}
		}
		return true;
	}

}
