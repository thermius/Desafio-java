package argumentos_dir;

public class ArgumentosVariados
{
	/*Esse algoritmo é um desafio simples: Converter um array de strings em um array de char;
	* 1. Calcular o tamanho da lista de strings da entrada;
	* 2. Mover cada caractere de cada elemento da lista de string para um array char;
	* 3. Exibir o array char informando o que cada caractere é;
	*/
	public void ExibirLista (String ...lista)
	{
		System.out.printf ("[ NOTA ] - Entrada recebida: ");
		for (String i : lista) System.out.printf ("%s, ",i); 
		System.out.printf ("\n"); 

		/*acomula o tamanho de cada elemento da lista*/
		int acomulador = 0;

		/*intera sobre a lista de string e obtem o tamanho*/
		for (String i : lista) acomulador += i.length();

		/*aloca o array char*/
		char [] entrada = new char [acomulador + 1 ];

		/*variavel que acompanha a posição do array*/
		int index = 0;

		/*intera novamente sobre a lista de strings movento cada caractere para o array char*/
		for (String i : lista)
		{
			int contador  = 0;
			while (contador < i.length() ) { entrada [index++] = i.charAt (contador); contador++; }
		}

		/*exibe o array*/
		for (int i = 0; i < acomulador; i++)
		{
			if (Character.isDigit(entrada[i])) System.out.printf("voce digito um numero: ");
			else if (Character.isLetter(entrada[i])) System.out.printf("voce digito uma letra: ");
			else  System.out.printf("voce digito um simbolo especial: ");
			System.out.printf("%c\n",entrada[i]);
		} 

	}
}
