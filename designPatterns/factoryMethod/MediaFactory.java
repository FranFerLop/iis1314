package iis1314.designPatterns.factoryMethod;


public class MediaFactory implements IFactory{
	
	@Override
	public IMediaFile createMedia(String tipoFile) {
		IMediaFile cont = null;
		
		if(tipoFile.equalsIgnoreCase("mp3")){
			cont = new Mp3();
		}else if(tipoFile.equalsIgnoreCase("wav")){
			cont = new Wav();
		}else if(tipoFile.equalsIgnoreCase("ogg")){
			cont = new Ogg();
		}
		return cont;
	}

}
