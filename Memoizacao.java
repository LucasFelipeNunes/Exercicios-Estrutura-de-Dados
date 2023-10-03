import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Memoizacao{
	static Map<Integer,Integer> memoria = new HashMap<>();
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner ( System.in );
		
		System.out.print("Digite qual posicao da sequencia de Fibonacci deve-se imprimir: ");
		int posFinal = ler.nextInt();
		
		memoria.put(0, 0);
		if(posFinal > 0){
			memoria.put(1, 1);
		}
		
		System.out.println ( posFinal + " - " + fibonacci(posFinal) );
	}
	
	static int fibonacci ( int posicao ) {
		if(!memoria.containsKey(posicao)){
			memoria.put(posicao, fibonacci(posicao - 1) + fibonacci(posicao - 2));
		}
		return memoria.get(posicao);
	}

}
