package ar.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;


@Component
public class Calculadora {

		private float a, b;
		private String op;
		
		
		public Calculadora(float a, float b, String op) {
			this.a = a;
			this.b = b;
			this.op = op;
		}

		public void setOp(String op) {
			this.op = op;
		}

		public String getOp() {
			return op;
		}

		public Calculadora() {
			
			//metodo constructor
			
		}
		
		public float sumarDosNumeros () {

			float suma;
			suma=a+b;

			return suma;
		}
		
		public float dividirDosNumeros () {
			
			float division;
			division=0;
			if(b==0) {
				System.out.println("el segundo numero no puede ser igual a 0");
		} else {
			division=a/b;
		
		}
			return division;
		}
		
		public float restarDosNumeros ( ) {
			
			float resta;
			resta=a-b;
			return resta;
			
		}

		public float multiplicardosnumeros () {
			
			float mult;
			mult=a*b;
			return mult;
			
		}

		
		public float getA() {
			return a;
		}

		public void setA(float a) {
			this.a = a;
		}

		public float getB() {
			return b;
		}

		public void setB(float b) {
			this.b = b;
		}

		@Override
		public String toString() {
			return "Calculadora [a=" + a + ", b=" + b + "]";
		}




		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Calculadora other = (Calculadora) obj;
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			return true;
		}

		
}

