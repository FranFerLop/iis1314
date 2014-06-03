package iis1314.designPatterns.factoryMethod;

public class Mp3 implements IMediaFile{
	private String sonido;
	
	public Mp3 (){
		sonido ="mp3";
	}
	@Override
	public String play() {
		return "play "+sonido;	
	}
	public String getSonido(){
		return sonido;
	}
}
