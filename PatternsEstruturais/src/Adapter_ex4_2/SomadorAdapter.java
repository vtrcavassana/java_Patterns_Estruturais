package Adapter_ex4_2;

import java.util.ArrayList;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{

	@Override
	public int somaVet(int[] vetor) {
		ArrayList<Integer> lista = new ArrayList<>();
		for(int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		int resp = somaLista(lista);
		return resp;
	}

	@Override
	public int somaInt(int a, int b) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(a);
		lista.add(b);
		int resp = somaLista(lista);
		return resp;
	}
}