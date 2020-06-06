package Adapter_ex4_2;

public class Cliente {
	private SomadorEsperado somador;

	public Cliente(SomadorEsperado somador) { 
		this.somador = somador;
	}

	public void executar() {
		int[] vetor = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
		int soma = somador.somaVet(vetor); 
		System.out.println("Resultado da Soma: " +soma); 
	}
}