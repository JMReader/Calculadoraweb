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
	Calculadora unaCalculadora = new Calculadora ();
	
	@GetMapping("/calculadora")
	public String getMenuCalculadora(Model model) {
		return("calculadora");
	}

	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "a") float a , @RequestParam (name = "b") float b){
	  
	  unaCalculadora.setA(a);
	  unaCalculadora.setB(b);
	  
	  float resultadoSuma = unaCalculadora.sumarDosNumeros();
	  
	  ModelAndView modelView = new ModelAndView("resultado");
	  modelView.addObject("resultadoSuma", resultadoSuma);
	  
	  return modelView;
	  
	}
	
	@GetMapping("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "a") float a , @RequestParam (name = "b") float b){
		  
		  unaCalculadora.setA(a);
		  unaCalculadora.setB(b);
		  
		  float resultadoResta = unaCalculadora.restarDosNumeros();
		  
		  ModelAndView modelView = new ModelAndView("resultado");
		  modelView.addObject("resultadoResta", resultadoResta);
		  
		  return modelView;
		  
		}
	


@GetMapping("/calculoDiv")
public ModelAndView getCalculoDiv(@RequestParam (name = "num1") float num1 , @RequestParam (name = "num2") float num2){
  
  unaCalculadora.setA(num1);
  unaCalculadora.setB(num2);
  
  float resultadoD = unaCalculadora.dividirDosNumeros();
  
  ModelAndView modelView = new ModelAndView("resultado");
  modelView.addObject("resultadoDiv", resultadoD);
  
  return modelView;
  
}

@GetMapping("/calculoMulti")
public ModelAndView getCalculoMulti(@RequestParam (name = "num1") float num1 , @RequestParam (name = "num2") float num2){
  
  unaCalculadora.setA(num1);
  unaCalculadora.setB(num2);
  
  float resultadoM = unaCalculadora.multiplicardosnumeros();
  
  ModelAndView modelView = new ModelAndView("resultado");
  modelView.addObject("resultadoMulti", resultadoM);
  
  return modelView;
  
}


}
