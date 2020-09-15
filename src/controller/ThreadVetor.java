package controller;

public class ThreadVetor extends Thread {
	 
	private int num;
	private int vetor[];
	
	public ThreadVetor(int num, int vetor[]) {
		this.num = num;
		this.vetor=vetor;
	}
	
	@Override
	public void run() {
		calcVet();
	}

	private void calcVet() {
		int soma=0;
		double tempo = 0;
		if (num % 2 == 0) {
			double timeInicial = System.nanoTime();
			for (int i=0; i<vetor.length;i++) {
				soma=soma + vetor[i];
			}
			double timeFinal = System.nanoTime();
			tempo = timeFinal - timeInicial;
			tempo = tempo / Math.pow(10, 9);
		}else {
			double timeInicial = System.nanoTime();
			for (int i : vetor) {
				soma=soma + vetor[i];
			}
			double timeFinal = System.nanoTime();
			tempo = timeFinal - timeInicial;
			tempo = tempo / Math.pow(10, 9);
		}
		System.out.println("Thread com nº " + num + " tempo execução: " + tempo);
	}
	
	

	
}
//Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor numérico e 
//vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando 
//uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor.  
//Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando uma estrutura foreach e 
//contar o tempo para percorrer o vetor. No final, ambas as possibilidades devem apresentar o tempo em segundos.
//A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100. Deve inicar 2 ThreadVetor 
//e para uma passar o número 1 e o vetor e para a outra, passar o número 2 e o mesmo vetor.