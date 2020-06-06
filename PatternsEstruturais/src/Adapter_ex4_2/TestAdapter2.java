package Adapter_ex4_2;

public class TestAdapter2 {

	public static void main(String[] args) {
		Cliente cli = new Cliente(new SomadorAdapter());
		cli.executar();
	}
}