package compilator;

public class AS_ErrorCaracter extends AccionSemantica{

	@Override
	public int execute(String Buffer, char c) {
		System.out.println("Caracter Inv�lido en la linea:");
		return 0;
	}
}
