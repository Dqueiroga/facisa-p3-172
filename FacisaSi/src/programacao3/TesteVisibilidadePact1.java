package programacao3;

 class TesteVisibilidadePact1 {
	 public static void main (String[] args) {
	
		 TesteVisibilidade pessoa = new TesteVisibilidade();
		 pessoa.cpf = "10101010";
		 pessoa.nome = "Danilo";
		 pessoa.idade = 15;
		 // Cor não pode ser iniciada pois sua visibilidade é Private, sendo visivel apenas na sua própria classe.
		 pessoa.cor = "verde";
	 }
}
