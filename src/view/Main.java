package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int vetor[]=new int [1000];
		
		for (int i=0;i<1000;i++) {
			vetor[i]=(int) Math.random()*100;
		}
		for (int num = 1 ; num <3 ; num++) {
			Thread tVetor = new ThreadVetor(num, vetor);
			tVetor.start();
		}
	}

}
