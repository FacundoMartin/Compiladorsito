package compilator;
public class AS_FinSimbolo extends AccionSemantica {
	
	public AS_FinSimbolo() {
	}
	
	public int execute(String Buffer, char c) {
		int ascii = (int) c; //cambio c a codigo ascii0
		return ascii;
	}	
}
