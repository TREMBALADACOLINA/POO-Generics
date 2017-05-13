
public class App {
	
	public static void main(String[] args) {
		
		Par<String, Double> par1;
		Par<Integer, String> par2;
		Par<Float, Float> par3;
		Par<String, String> par4;
		Par<Integer, Integer> par5;
		
		par1 = new Par<String, Double>("String 1", 2.3);
		par2 = new Par<Integer, String>(2, "String 2");
		par3 = new Par<Float, Float>(1.0f, 3.7f);
		par4 = new Par<String, String>("string 3", "String 4");
		par5 = new Par<Integer, Integer>(1, 2);
		
		System.out.println(par1.getAtributo1() + ", "+ par1.getAtributo2());
		System.out.println(par2.getAtributo1() + ", "+ par2.getAtributo2());
		System.out.println(par3.getAtributo1() + ", "+ par3.getAtributo2());
		System.out.println(par4.getAtributo1() + ", "+ par4.getAtributo2());
		System.out.println(par5.getAtributo1() + ", "+ par5.getAtributo2());
		
		
		
	}
}
