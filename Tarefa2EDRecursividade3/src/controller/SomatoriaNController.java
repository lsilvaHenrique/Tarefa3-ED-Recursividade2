package controller;

public class SomatoriaNController {
	
	public SomatoriaNController() {}

	public float somaN(int i, int num, float s) {
		// Condicao de parada --> Quando i chegar em n
	    if (i > num)
	        return s;
	    else
	    {
	        if (i % 2 == 0)
	            s -= (float)1 / i;
	        else
	            s += (float)1 / i;
	             
	        return somaN(i + 1, num, s);
	        /*
	         5x
	         1 + 1 / 1
	         1 + 1 / 2
	         1 + 1 / 3
	         1 + 1 / 4
	         1 + 1 / 5
	         1 + 1 / 6 = i > num = 0
	         */
	    }
	}
}
