package iis1314.designPatterns.strategy;

/**
 * 
 * @author Francisco
 *
 */
public class Context {
	
	private ICompressor estrategia;
	
	/**
	 * Constructor que crea un Context a partir del parametro.
	 * @param comp 
	 * 
	 */
	public Context (ICompressor comp){
		estrategia = comp;
	}
	
	/**
	 * Cambia el atributo estrategia segun el prarametro.
	 * @param comp
	 * 
	 */
	public void setCompressor (ICompressor comp){
		estrategia = comp;
	}
	
	/**
	 * 
	 * @param datos
	 * @return String resultado de la compresion.
	 */
	public String compress (String datos){
		return estrategia.compress(datos);
	}
	
	/**
	 * 
	 * @return devuelve el atributo de la clase Context.
	 */
	public ICompressor getStrategia() {
		return estrategia;
	}
	
	
}
