
package compilator;
import java.util.HashMap;

public class AS_FinSimboloComp extends AccionSemantica{
	
	HashMap<String,Integer> TablaToken;
	int nrotoken = 421;
	
	public AS_FinSimboloComp(HashMap<String,Integer> TablaToken){
		this.TablaToken = TablaToken;
	}
	
	public int execute(String Buffer, char c) {
		Buffer = Buffer + c ; 
		return TablaToken.get(Buffer);
	}
}
