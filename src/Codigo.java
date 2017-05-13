
public class Codigo <S, N>{
	private S setor;
	private N numero;
	
	public Codigo(S setor, N numero){
		this.setor = setor;
		this.numero = numero;
	}

	public S getSetor() {
		return setor;
	}

	public void setSetor(S setor) {
		this.setor = setor;
	}

	public N getNumero() {
		return numero;
	}

	public void setNumero(N numero) {
		this.numero = numero;
	}
	
	public static void main(String[] args) {
		ProdutoGenerico<Codigo> p1 = new ProdutoGenerico<Codigo>(new Codigo("LOL1", "LOL2"),"Desc1", 2.0);
		System.out.println(p1.toString());
	}
}
