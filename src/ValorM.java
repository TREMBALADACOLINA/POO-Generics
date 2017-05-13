
public class ValorM <V> {
	private V valorMonetario;
	
	public ValorM(V valorMonetario){
		this.valorMonetario = valorMonetario;
	}

	public V getValorMonetario() {
		return valorMonetario;
	}

	public void setValorMonetario(V valorMonetario) {
		this.valorMonetario = valorMonetario;
	}
	
	
	public static void main(String[] args) {
		ProdutoGenerico2<Codigo, ValorM> p2 = new ProdutoGenerico2(new Codigo("abc","321"), "LOL", new ValorM<Double>(1.0));
		
		System.out.println(p2.toString());
		
	}
	
}
