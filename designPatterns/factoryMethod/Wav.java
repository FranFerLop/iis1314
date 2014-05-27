package iis1314.designPatterns.factoryMethod;

public class Wav implements IMediaFile {
	String sonido;

	public Wav() {
		sonido = "Wav";
	}

	@Override
	public String play() {
		return "playing " + sonido;

	}

}
