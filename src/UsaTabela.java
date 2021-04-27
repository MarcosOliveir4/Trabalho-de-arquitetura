
public class UsaTabela {

	public static void main(String[] args) {
		
		TabelaAscii tb = new TabelaAscii('A','B');
		System.out.println(tb.getBinario());
		
		SomarBinario somar = new SomarBinario(tb.getBinario1(),tb.getBinario2());
		System.out.println(somar);
		
		
	}

}
