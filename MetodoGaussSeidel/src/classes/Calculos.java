package classes;

public class Calculos {
	
	RecebendoDados dados = new RecebendoDados();
	Conversoes conversores = new Conversoes();
	
	float[] posicoes = new float [21];
	float[] transposta = new float [4];
	int iteracoes = 0;
	
	public void criandoVetorCalculo() {
		
		posicoes[1] = dados.getX11();
		posicoes[2] = dados.getX21() * -1;
		posicoes[3] = dados.getX31() * -1;
		posicoes[4] = dados.getX41() * -1;
		posicoes[5] = dados.getN1();
		
		posicoes[6] = dados.getX12() * -1;
		posicoes[7] = dados.getX22();
		posicoes[8] = dados.getX32() * -1;
		posicoes[9] = dados.getX42() * -1;
		posicoes[10] = dados.getN2();
		
		posicoes[11] = dados.getX13() * -1;
		posicoes[12] = dados.getX23() * -1;
		posicoes[13] = dados.getX33();
		posicoes[14] = dados.getX43() * -1;
		posicoes[15] = dados.getN3();
		
		posicoes[16] = dados.getX14() * -1;
		posicoes[17] = dados.getX24() * -1;
		posicoes[18] = dados.getX34() * -1;
		posicoes[19] = dados.getX44();
		posicoes[20] = dados.getN4();
		
		this.calculos();
		
	}
	
	public void calculos() {
		transposta = conversores.separarTransposta();
		int quant;

			while(iteracoes < 2) {
				quant = 1;	
				
				//X1
				this.calculoX1(quant);
				
				//X2
				quant = 2;
				this.calculoX2(quant);
				
				//X3
				quant = 3;
				this.calculoX3(quant);
				
				//X4
				quant = 4;
				this.calculoX4(quant);
				
				
			this.testeParada();	
			}
			
			
	}
	
	public void calculoX1(int quant) {
		
		/*
		System.out.println("Valor N1 : "+posicoes[quant*5]);
		System.out.println("Valor X2 : "+posicoes[quant+1]);
		System.out.println("Valor Transposta posicao 1 : "+ transposta[quant]);
		System.out.println("X2 * T1 : "+transposta[quant]*posicoes[quant+1]);
		System.out.println("----");
		
		System.out.println("Valor X3 : "+posicoes[quant+2]);
		System.out.println("Valor Transposta posicao 2 : "+ transposta[quant+1]);
		System.out.println("X3 * T2 : "+transposta[quant+1]*posicoes[quant+2]);
		System.out.println("----");
		
		System.out.println("Valor X4 : "+posicoes[quant+3]);
		System.out.println("Valor Transposta posicao 3 : "+ transposta[quant+2]);
		System.out.println("X4 * T3 : "+transposta[quant+2]*posicoes[quant+3]);
		System.out.println("----");
		
		*/
		
		transposta[quant-1] = (posicoes[quant*5] + (transposta[quant]*posicoes[quant+1]) + 
												   (transposta[quant+1]*posicoes[quant+2]) + 
												   (transposta[quant+2]*posicoes[quant+3]))/ posicoes[quant];
		
		System.out.printf("Posição Transposta %d valor : %.4f\n\n", quant-1, transposta[quant-1]);
		
	}
	
	public void calculoX2(int quant) {
		
		/*
		System.out.println("Valor N2 : "+posicoes[quant*5]);
		System.out.println("Valor X1 : "+posicoes[quant+4]);
		System.out.println("Valor Transposta posicao 0 : "+ transposta[quant-2]);
		System.out.println("X1 * T0 : "+transposta[quant-2]*posicoes[quant+4]);
		System.out.println("----");			
		
		System.out.println("Valor X3 : "+posicoes[quant+6]);
		System.out.println("Valor Transposta posicao 2 : "+ transposta[quant]);
		System.out.println("X3 * T2 : "+transposta[quant]*posicoes[quant+6]);
		System.out.println("----");	
					
		System.out.println("Valor X4 : "+posicoes[quant+7]);
		System.out.println("Valor Transposta posicao 3 : "+ transposta[quant+1]);
		System.out.println("X4 * T3 : "+transposta[quant+1]*posicoes[quant+7]);
		System.out.println("----");	
		
		*/
		
		transposta[quant-1] = (posicoes[quant*5] + (transposta[quant-2]*posicoes[quant+4]) + 
				   								   (transposta[quant]*posicoes[quant+6]) + 
				   								   (transposta[quant+1]*posicoes[quant+7]))/ posicoes[quant+5];
		
		System.out.printf("Posição Transposta %d valor : %.4f\n\n", quant-1, transposta[quant-1]);
	}
	
	public void calculoX3(int quant) {
		
		/*
		
		System.out.println("Valor N3 : "+posicoes[quant*5]);
		System.out.println("Valor X1 : "+posicoes[quant+8]);
		System.out.println("Valor Transposta posicao 0 : "+ transposta[quant-3]);
		System.out.println("X1 * T0 : "+transposta[quant-3]*posicoes[quant+8]);
		System.out.println("----");	
		
		System.out.println("Valor X2 : "+posicoes[quant+9]);
		System.out.println("Valor Transposta posicao 1 : "+ transposta[quant-2]);
		System.out.println("X2 * T1 : "+transposta[quant-2]*posicoes[quant+9]);
		System.out.println("----");	
		
		System.out.println("Valor X4 : "+posicoes[quant+11]);
		System.out.println("Valor Transposta posicao 3 : "+ transposta[quant]);
		System.out.println("X4 * T3 : "+transposta[quant]*posicoes[quant+11]);
		System.out.println("----");	
		
				*/
		
		transposta[quant-1] = (posicoes[quant*5] + (transposta[quant-3]*posicoes[quant+8]) + 
												   (transposta[quant-2]*posicoes[quant+9]) + 
												   (transposta[quant]*posicoes[quant+11]))/ posicoes[quant+10];
		
		System.out.printf("Posição Transposta %d valor : %.4f\n\n", quant-1, transposta[quant-1]);
		
	}
	
	public void calculoX4(int quant) {
		
		/*
		
		System.out.println("Valor N4 : "+posicoes[quant*5]);
		System.out.println("Valor X1 : "+posicoes[quant+12]);
		System.out.println("Valor Transposta posicao 0 : "+ transposta[quant-4]);
		System.out.println("X1 * T0 : "+transposta[quant-4]*posicoes[quant+12]);
		System.out.println("----");
		
		System.out.println("Valor X2 : "+posicoes[quant+13]);
		System.out.println("Valor Transposta posicao 1 : "+ transposta[quant-3]);
		System.out.println("X2 * T1 : "+transposta[quant-3]*posicoes[quant+13]);
		System.out.println("----");	
		
		System.out.println("Valor X3 : "+posicoes[quant+14]);
		System.out.println("Valor Transposta posicao 2 : "+ transposta[quant-2]);
		System.out.println("X3 * T2 : "+transposta[quant-2]*posicoes[quant+14]);
		System.out.println("----");	
		
		*/
		
		transposta[quant-1] = (posicoes[quant*5] + (transposta[quant-4]*posicoes[quant+12]) + 
				   								   (transposta[quant-3]*posicoes[quant+13]) + 
				   								   (transposta[quant-2]*posicoes[quant+14]))/ posicoes[quant+15];

		System.out.printf("Posição Transposta %d valor : %.4f\n\n", quant-1, transposta[quant-1]);
	}
	
	public int testeParada() {
		int maximoIteracoes = dados.getMaxI();
		float limiteParada = dados.getE();
		
		//--programa já esta quase finalizado fazendo o teste de parada
		
		
		return iteracoes++;
	}

}

