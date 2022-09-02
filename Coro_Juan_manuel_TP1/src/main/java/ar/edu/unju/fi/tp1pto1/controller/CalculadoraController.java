package ar.edu.unju.fi.tp1pto1.controller;

import java.io.Console;

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
		model.addAttribute("resultado", null);
		return ("calculadora");
	}

	@PostMapping(value = "/calculo")
	public String getCalculo(@ModelAttribute("calculadora") Calculadora calcu, Model model) {
		System. out. println(calcu.getOp());
		switch (calcu.getOp()) {
			case "s": //suma
			System. out. println("sumando");
				calcu.sumarDosNumeros();
				break;
			case "r": //resta
				calcu.restarDosNumeros();
				break;
			case "m": //multiplicacion
				calcu.multiplicardosnumeros();
				break;
			case "d": //division
				calcu.dividirDosNumeros();
				break;
			default:
		}
		model.addAttribute("num", new Calculadora());
		model.addAttribute("resultado", calcu);
		return ("calculadora");
	}
}
