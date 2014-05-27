package iis1314.designPatterns.factoryMethod;

public class Ogg implements IMediaFile{
	String sonido;
	public Ogg (){
		sonido = "ogg";
	}

	@Override
	public String play() {
		return "playing "+sonido;
		
	}

}
