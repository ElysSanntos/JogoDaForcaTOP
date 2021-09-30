package br.com.cotuca.jogoDaForca.testes;

import br.com.cotuca.jogoDaForca.classes.Palavra;

public class TesteClassePalavra 
{
			public static void main (String args [])
	    {
	        Palavra p1= null;
	        Palavra p2= null;
			try
			{
			    //testando o construtor
		        //p1= BancoDePalavras.getPalavraSorteada();
		        //p1= new Palavra(null);
		        //p1= new Palavra("");
				p1= new Palavra("JOGO");
		        
		        System.out.println("A palavra é: "+p1);
		        
		        //testando o método getQuantidade
		        System.out.println("Letra  G: "+p1.getQuantidade('G'));
		        
		        //testando o método getPosicaoDaIezimaOcorrencia
		        for (int i=0; i<p1.getQuantidade('G'); i++)
		            System.out.println("Posicao: "+p1.getPosicaoDaIezimaOcorrencia (0,'G'));
		            
		       //testando o método equals
		       p2= new Palavra("JOGO");
		       System.out.println("A palavra é: "+p2);

		       if(p1.equals(p2))
			        System.out.println("p1 é igual p2");
			   else
			        System.out.println("p1 é  diferente de p2");

			  //testando o método hashCode
			    System.out.println("hashCode de p1: "+p1.hashCode());
		            
	        }
	        catch (Exception erro)
	        {
	            System.err.println(erro.getMessage());
	        }

			
	    }
	}


