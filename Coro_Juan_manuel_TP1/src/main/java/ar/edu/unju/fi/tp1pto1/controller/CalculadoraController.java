package ar.edu.unju.fi.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp1pto1.model.Calculadora;

@Controller
public class CalculadoraController {

	@Autowired
	Calculadora unaCalculadora = new Calculadora();

	@GetMapping({"/calculadora" , "/"})
	public String getMenuCalculadora(Model model) {
		model.addAttribute("num", new Calculadora());
		
		return ("calculadora");
	}

	@PostMapping(value = "/calculo")
	public String getCalculo(@ModelAttribute("calculadora") Calculadora calcu, Model model) {
		switch (calcu.getOp()) {
			case "suma":
				calcu.sumarDosNumeros();
				break;
			case "resta":
				calcu.restarDosNumeros();
				break;
			case "multiplicacion":
				calcu.multiplicardosnumeros();
				break;
			case "division":
				calcu.dividirDosNumeros();
				break;
			default:
		}
		model.addAttribute("resultado", calcu.getResul());
		return ("calculadora");
	}
}
