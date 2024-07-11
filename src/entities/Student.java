package entities;

public class Student {
	// Atributos
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal(double nota1, double nota2, double nota3) {
		return nota1 + nota2 + nota3; 
	}
	
}
