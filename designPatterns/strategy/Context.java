package iis1314.designPatterns.strategy;

public class Context {
	private ICompressor estrategia;
	
	public Context (ICompressor comp){
		estrategia = comp;
	}
	public void setCompressor (ICompressor comp){
		estrategia = comp;
	}
	public String compress (String datos){
		return estrategia.compress(datos);
	}

}
