package exercício;

public class Calculadora {
	int a;
	int b;
	
	//Metodos Getters e Setters
	public int getA() {
		return a;
	}
	public void setA(int a) throws AtributoAForaDoPermitido {
		if (a < 0 || a > 100) {
			throw new AtributoAForaDoPermitido();
		}
		else if ( a >= 0 & a <= 100) {
			this.a = a;
		}
	}
	public int getB() {
		return b;
	}
	public void setB(int b) throws AtributoBForaDoPermitido {
		if (b < 0 || b > 100) {
			throw new AtributoBForaDoPermitido();
		}
		else if ( b >= 0 & b <= 100) {
			this.b = b;
		}
	}
	
	//Metodo calcula
	public void calcula(int a, int b) throws ExcecaoDivisaoResultadoZero {
		try { System.out.print(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Divisão por zero é inválida");
		}
		
		int res = a/b;
		if (res == 0) {
			throw new ExcecaoDivisaoResultadoZero();
		}
		
	}
	
	//Classe usada quando a divisoa do metodo 'calcula' for igual a zero.
	public class ExcecaoDivisaoResultadoZero extends Exception{
		@Override
		public String getMessage() {
			return "O resultado dessa divisão é zero(0)";
		}
	}
	
	//Classe usada para avisar que o atributo a esta fora do padrao
	public class AtributoAForaDoPermitido extends Exception{
		@Override
		public String getMessage() {
			return "O número deve estar entre 0 e 100"; 
		}
	}
	
	//Classe usada para avisar que o atributo b esta fora do padrao
	public class AtributoBForaDoPermitido extends Exception{
		@Override
		public String getMessage() {
			return "O número deve estar entre 0 e 100"; 
		}
	}
		
	
		
	


}
