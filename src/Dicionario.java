import java.util.ArrayList;

public class Dicionario <K, V>{
	
	private ArrayList<K> placa;
	private ArrayList<V> valor;
	
	public Dicionario(){
		this.placa = new ArrayList<>();
		this.valor = new ArrayList<>();
	}
	
	public void add(K chave, V valor){
		this.placa.add(chave);
		this.valor.add(valor);
	}
	
	public V get(K chave){
		for(int i = 0 ; i < placa.size() ; i++){
			if(placa.get(i).equals(chave)){
				return valor.get(i);
			}
		}
		return null;
	}
}
