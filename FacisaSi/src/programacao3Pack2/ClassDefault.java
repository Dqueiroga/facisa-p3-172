package programacao3Pack2;

import programacao3.TesteVisibilidade;

 class ClassDefault {
	TesteVisibilidade alguem = new TesteVisibilidade();
	public static void main (String args[]) {
		programacao3.TesteVisibilidade instituicao = new programacao3.TesteVisibilidade();
		// so tenho acesso a variavel nome por ser publica
		instituicao.nome = "danilo";
	}
}
