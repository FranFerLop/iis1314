package iis1314.designPatterns.factoryMethod;

public class Ogg implements IMediaFile{
	private String sonido;
	
	public Ogg (){
		sonido = "ogg";
	}

	@Override
	public String play() {
		return "playing "+sonido;
	}
	public String getSonido(){
		return sonido;
	}
}
