package iis1314.designPatterns.factoryMethod;

public class Wav implements IMediaFile {
	private String sonido;

	public Wav() {
		sonido = "Wav";
	}

	@Override
	public String play() {
		return "playing " + sonido;
	}
	public String getSonido(){
		return sonido;
	}
}
