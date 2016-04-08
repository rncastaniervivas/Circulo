package ar.edu.unlam.tallerweb.circulo;


public class Circulo {
		double area;
		double perimetro;
		double radio;
		
		public Circulo(double radio){
			this.radio = radio;
		}
		
		public double calculaPerimetro(){
		perimetro = 2 * Math.PI * radio;
		return perimetro;
		}
		
		public double calculaArea(){
		area = Math.PI * Math.pow(radio, 2);
		return area;
		}	
}

//Los tipos de datos estan en minuscula porque sino el eclipse me tira error.