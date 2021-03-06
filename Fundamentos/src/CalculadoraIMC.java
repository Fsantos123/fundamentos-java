import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
			double peso, altura, imc;
			System.out.println("CalculoIMC");
			
			
			//criando um objeto para entrada de dados
			Scanner leia = new Scanner(System.in);
			leia.useLocale(Locale.ENGLISH);
			
			//Criando um objeto para formatar o resultado
			DecimalFormat formatador = new DecimalFormat("0.00");
					
			System.out.print("Digite seu peso: ");
			peso = leia.nextDouble();
			
		
			System.out.print("Digite sua altura: ");
			altura = leia.nextDouble();
			imc = peso / (altura*altura);
			System.out.println("imc: " + formatador.format(imc));
		
			if(imc < 18.5) {
				System.out.println("Abaixo do peso");
			} else if(imc >= 18.5 && imc < 25) {
				System.out.println("Peso normal");	
			}else if (imc >= 18.5 && imc < 25) { 
				System.out.println("Acima do peso");
			}else {
				System.out.println("Obeso");
			}

			
			leia.close();
			
			
	}

}
