
public class TabelaAscii {
	private char caracter1;
	private char caracter2;
	
	private int decimal1;
	private int decimal2;
	
	private String binario1;
	private String binario2;

	public TabelaAscii(char caracter1, char caracter2) {
		this.caracter1 = caracter1;
		this.decimal1 = retornarDec(this.caracter1);
		this.binario1 = retornarBinario(this.decimal1);
		
		this.caracter2 = caracter2;
		this.decimal2 = retornarDec(this.caracter2);
		this.binario2 = retornarBinario(this.decimal2);
	}

	private int retornarDec(char c) {
		int decimal = (int) c;
		return decimal;
	}

	private String retornarBinario(int decimal) {
		String binario = Integer.toBinaryString(decimal);
		String binarioFormatado = binario;
		return binarioFormatado;
	}

//	private String formatacaoDeBinario(String binario) {
//		String binarioParaFormatar = binario;
//		
//		
//		for(int i = binarioParaFormatar.length(); i <= 7; i++) {
//			binarioParaFormatar = "0" + binario;
//		}
//
//		String parte1 = binarioParaFormatar.substring(0, 4);
//		String parte2 = binarioParaFormatar.substring(4, 8);
//		return parte1 + " " + parte2;
//	}
	
	public String getBinario() {
		return binario1 + " " + binario2;
	}
	
	public String getBinario1() {
		return binario1;
	}
	
	public String getBinario2() {
		return binario2;
	}

	@Override
	public String toString() {
		return "Decimal: " + this.decimal1 + "\n" + "Binário: " + this.binario1;

	}

}
