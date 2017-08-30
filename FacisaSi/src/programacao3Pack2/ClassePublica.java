package programacao3Pack2;

import programacao3.TesteVisibilidade;

public class ClassePublica {
	public static void main (String args[]) {
	programacao3.TesteVisibilidade pessoa = new programacao3.TesteVisibilidade();
	// só consigo instanciar a variável Nome por ser publica em outro pacote.
	pessoa.nome = "Danilo";
	
	}
}
