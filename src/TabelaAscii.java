
public class TabelaAscii {
	private char caracter;
	private int decimal;
	private String binario;

	public TabelaAscii(char caracter) {
		this.caracter = caracter;
		this.decimal = retornarDec(this.caracter);
		this.binario = retornarBinario(this.decimal);
	}

	private int retornarDec(char c) {
		int decimal = (int) c;
		return decimal;
	}

	private String retornarBinario(int decimal) {
		String binario = Integer.toBinaryString(decimal);
		String binarioFormatado = formatacaoDeBinario(binario);
		return binarioFormatado;
	}

	private String formatacaoDeBinario(String binario) {
		String binarioParaFormatar = binario;
		
		
		for(int i = binarioParaFormatar.length(); i <= 7; i++) {
			binarioParaFormatar = "0" + binario;
		}

		String parte1 = binarioParaFormatar.substring(0, 4);
		String parte2 = binarioParaFormatar.substring(4, 8);
		return parte1 + " " + parte2;
	}

	@Override
	public String toString() {
		return "Decimal: " + this.decimal + "\n" + "Binário: " + this.binario;

	}

}
