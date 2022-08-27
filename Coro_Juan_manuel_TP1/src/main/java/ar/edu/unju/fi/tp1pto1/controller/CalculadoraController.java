package ar.edu.unju.fi.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.tp1pto1.model.Calculadora;

@Controller
public class CalculadoraController {

	@Autowired
	Calculadora unaCalculadora = new Calculadora();

	@GetMapping("/calculadora")
	public String getMenuCalculadora(Model model) {
		model.addAttribute("num", new Calculadora());
		
		return ("calculadora");
	}

	@GetMapping("/calculo")
	public String getCalculo(@RequestParam(name = "a") float a, @RequestParam(name = "b") float b,
			@RequestParam(name = "op") String Op) {
		unaCalculadora.setA(a);
		unaCalculadora.setB(b);
		unaCalculadora.setOp(Op);
		switch (Op) {

			case "suma":
				unaCalculadora.sumarDosNumeros();
				break;

			case "resta":
				unaCalculadora.restarDosNumeros();
				break;
			case "multiplicacion":
				unaCalculadora.multiplicardosnumeros();
				break;
			case "division":
				unaCalculadora.dividirDosNumeros();
				break;
			default:

		}

		return ("calculadora");
	}
}
