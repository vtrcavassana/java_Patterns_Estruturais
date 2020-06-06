package Adapter_ex4_2;

import java.util.List;

public class SomadorExistente {
	public int somaLista(List<Integer> lista) {
		int resp = 0;
		for (int i : lista)
			resp += i;
		return resp;
	}
}