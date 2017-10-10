package classes;

import java.util.ArrayList;

public class Conversoes {
	
	RecebendoDados dados = new RecebendoDados();
	
	//transformar a string em numeros
	public float[] separarTransposta() {
		//tamanho da string
		int tamString = dados.getTransposta().length();
		//tamanho do vetor
		String[] stringSeparada = new String[tamString];
		//separando pela virgula
		stringSeparada = dados.getTransposta().split(",");

			//transformando em float
			float stringFloat[] = new float[stringSeparada.length];
			for(int i=0;i<stringSeparada.length;i++) {
				stringFloat[i] = Float.parseFloat(stringSeparada[i]);
				//System.out.println(stringFloat[i]);
			}
			
		return(stringFloat);	
	}

}
