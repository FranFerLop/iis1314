package iis1314.designPatterns.factoryMethod;

/**
 * 
 * @author Francisco
 * 
 */
public class MediaFactory implements IFactory {

	/**
	 * @return devuelve el IMediaFile creado a partir del parametro 
	 */
	public IMediaFile createMedia(String tipoFile) {
		
		IMediaFile file = null;

		if (tipoFile.equalsIgnoreCase("mp3")) {
			file = new Mp3();
		} else if (tipoFile.equalsIgnoreCase("wav")) {
			file = new Wav();
		} else if (tipoFile.equalsIgnoreCase("ogg")) {
			file = new Ogg();
		} else {
			throw new RuntimeException("Error al crear el audio: " + tipoFile
					+ " no es un formato correcto.");
		}
		return file;
	}

}
