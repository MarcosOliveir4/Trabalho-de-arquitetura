import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TabelaAscii tabela;
		SomarBinario somar;

		char caractere1, caractere2;
		
		System.out.print("Digite um caractere alfanúmerico: ");
		caractere1 = sc.next().charAt(0);
		
		System.out.print("Digite outro caractere alfanúmerico: ");
		caractere2 = sc.next().charAt(0);
		
		tabela = new TabelaAscii(caractere1, caractere2);
		String binario1 = tabela.getBinario1();
		String binario2 = tabela.getBinario2();
		
		somar = new SomarBinario(binario1, binario2);
		
		System.out.println(somar);

		sc.close();
	}

}
