package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;
public class Program {

	public static void main(String[] args) {
		// Problema alunos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		student.name = sc.nextLine();
		//sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", student.notaFinal(student.nota1, student.nota2, student.nota3));
		
		if(student.notaFinal(student.nota1, student.nota2, student.nota3) > 60) {
			System.out.print("PASS");
		}else {
			System.out.printf("FAILED %nFALTARAM %.2f", 60 - student.notaFinal(student.nota1, student.nota2, student.nota3));
			System.out.print(" PONTOS");
		}
		
		sc.close();
	}

}
