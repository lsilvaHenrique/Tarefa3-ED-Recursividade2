package view;

import controller.SomatoriaNController;

public class Principal {
	
	public static void main(String[] args) {
	    SomatoriaNController somatoria = new SomatoriaNController();
	    
	    float soma = somatoria.somaN(1, 5, 0);
	    System.out.println(soma);
	}
	}

