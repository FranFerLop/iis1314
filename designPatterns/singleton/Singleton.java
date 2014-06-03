package iis1314.designPatterns.singleton;

/**
 * 
 * @author Francisco
 *
 */
public class Singleton {
	private int identificador;
	private static Singleton elSingleton=null; 
	
	/**
	 * Crea un Singleton a partir del paramtro de entrada. Es un constructor privado.
	 * @param id
	 */
	private Singleton(int id){
		identificador=id;
	}
	
	/**
	 * 
	 * @return Crea un Singleton si no se ha creado.
	 */
	public static Singleton getInstance(){
		if(elSingleton == null){
			elSingleton=new Singleton (0);
		}
		return elSingleton;
	}
	
	/**
	 * 
	 * @return devuelve el indentificador incrementado.
	 */
	public int getIdentifier(){
		return elSingleton.identificador++;
	}
}
