package iis1314.designPatterns.singleton;

public class Singleton {
	private int identificador;
	private static Singleton elSingleton=null; 
	
	private Singleton(int id){
		identificador=id;
	}
	public static Singleton getInstance(){
		if(elSingleton == null){
			elSingleton=new Singleton (0);
		}
		return elSingleton;
	}
	public int getIdentifier(){
		return elSingleton.identificador++;
	}
}
