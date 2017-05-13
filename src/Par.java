
public class Par <X, Y> {
	
	private X atributo1;
	private Y atributo2;
	
	public Par(X atributo1, Y atributo2){
		this.atributo1 = atributo1;
		this.atributo2 = atributo2; 
	}
	
	public X getAtributo1(){
		return this.atributo1;
	}
	
	public Y getAtributo2(){
		return this.atributo2;
	}
	
}
