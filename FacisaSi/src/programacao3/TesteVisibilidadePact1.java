package programacao3;

 class TesteVisibilidadePact1 {
	 public static void main (String[] args) {
	
		 TesteVisibilidade pessoa = new TesteVisibilidade();
		 pessoa.cpf = "10101010";
		 pessoa.nome = "Danilo";
		 pessoa.idade = 15;
		 // Cor n�o pode ser iniciada pois sua visibilidade � Private, sendo visivel apenas na sua pr�pria classe.
		 pessoa.cor = "verde";
	 }
}
