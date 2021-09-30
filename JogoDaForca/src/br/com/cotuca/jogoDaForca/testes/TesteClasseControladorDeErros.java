package br.com.cotuca.jogoDaForca.testes;

import br.com.cotuca.jogoDaForca.classes.ControladorDeErros;

public class TesteClasseControladorDeErros 
{
	
	public static void main (String args[])
	  {
		TesteClasseControladorDeErros c1 = null;
		TesteClasseControladorDeErros c2 = null;
		TesteClasseControladorDeErros c3 = null;
	      try
	    {
	      //testando o construtor
	      c1 = new ControladorDeErros (3);
	      System.out.println (c1);

	      //testando os métodos registreUmErro  e isAtingidoMaximoDeErros 
	      //c1.registreUmErro ();
	      
	      c1.registreUmErro();
	      //c1.registreUmErro ();
	      //System.out.println (c1);
	      //c1.registreUmErro();

	      //testando o método equals
	      c2= new  ControladorDeErros(3);
	      
	      if(c1.equals(c2))
	        System.out.println("c1 é igual c2");
		  else
			System.out.println("c1 é diferente de c2");
	      
	      //testando o método hashCode
		  System.out.println("hashCode de c1: "+c1.hashCode());
			    	
		  //testando construtor de cópia e clone
		  c3 = new ControladorDeErros(c1);
	      //c3= (ControladorDeErros)c1.clone();
	      System.out.println("c1: "+c1);
	      System.out.println("c3: "+c3);
	    }
	    catch (Exception erro)
	    {
	      System.err.println (erro.getMessage ());
	    }


	  }

}
