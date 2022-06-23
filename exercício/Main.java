package exercício;
import java.util.Scanner;

public class Main extends Calculadora{

	public static void main(String[] args) throws ExcecaoDivisaoResultadoZero, AtributoAForaDoPermitido,
AtributoBForaDoPermitido {
		int var1;
		int var2;
		Calculadora a = new Calculadora();
		Calculadora b = new Calculadora();
		Calculadora res = new Calculadora(); 
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		var1 = tec.nextInt();
		a.setA(var1);
		System.out.println("Digite mais um número inteiro: ");
		var2 = tec.nextInt();
		b.setB(var2);
		
		System.out.println("\nO resultado de " + var1 + " dividido por " + var2 + ", é: ");	
		System.out.print("--> ");
		res.calcula(var1,var2);
		

		
	}
}
