
public class SomarBinario {

	private String binario1;
	private String binario2;
	private int somaEmDecimal;
	private String somaEmBinario;
	
	public SomarBinario(String binario1, String binario2) {
		this.binario1 = binario1;
		this.binario2 = binario2;
		this.somaEmDecimal = somaEmDecimal(this.binario1, this.binario2);
		this.somaEmBinario = conversaoParaBinario(this.somaEmDecimal);
	}
	
	private int somaEmDecimal(String binario1,String binario2) {
		int decimal1 = Integer.parseInt(binario1, 2);
		int decimal2 = Integer.parseInt(binario2, 2);
		int somaEmDecimal = decimal1 + decimal2;
		return somaEmDecimal;
	}
	
	private String conversaoParaBinario(int somaEmDecimal) {
		String somaEmBinario = Integer.toBinaryString(somaEmDecimal);
		return somaEmBinario;
	}

	@Override
	public String toString() {
		return this.binario1 + " + " + this.binario2 + " = " + this.somaEmBinario;
	}
}
