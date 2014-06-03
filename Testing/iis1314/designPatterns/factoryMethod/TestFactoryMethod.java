package iis1314.designPatterns.factoryMethod;

import static org.junit.Assert.*;
import iis1314.designPatterns.factoryMethod.IMediaFile;
import iis1314.designPatterns.factoryMethod.MediaFactory;
import iis1314.designPatterns.factoryMethod.Mp3;
import iis1314.designPatterns.factoryMethod.Ogg;
import iis1314.designPatterns.factoryMethod.Wav;

import org.junit.Test;

public class TestFactoryMethod {
	private static final String MP3 = "mp3";
	private static final String WAV = "Wav";
	private static final String OGG = "ogg";
	
	private IMediaFile media;
	private MediaFactory file = new MediaFactory(); 
	
	
	@Test
	public void creaUnMp3 (){
		Mp3 mp3Local = new Mp3();
		assertEquals(MP3, mp3Local.getSonido());
	}
	
	@Test
	public void crearUnWav (){
		Wav wavLocal = new Wav ();
		assertEquals(WAV, wavLocal.getSonido());
	}
	
	@Test
	public void crearUnOgg (){
		Ogg oggLocal = new Ogg ();
		assertEquals(OGG, oggLocal.getSonido());
	}
	
	@Test
	public void crearUnMp3DesdeMediaFactory(){
		media = file.createMedia(MP3);
		assertEquals(Mp3.class, media.getClass());
	}
	
	@Test
	public void crearUnWavDesdeMediaFactory (){
		media = file.createMedia(WAV);
		assertEquals(Wav.class, media.getClass());
	}
	
	@Test
	public void crearUnOggDesdeMediaFactory (){
		media = file.createMedia(OGG);
		assertEquals(Ogg.class, media.getClass());
	}
	
	@Test (expected = RuntimeException.class)
	public void crearFormatoDesconocidoElevaExcepcion (){
		new MediaFactory().createMedia("mp4"); 
	}
	
	@Test
	public void comprobarPlayEnMp3 (){
		media = file.createMedia(MP3);
		String string = media.play();
		assertEquals("play mp3", string);
	}
	
	
	@Test
	public void comprobarPlayEnWav (){
		media = file.createMedia(WAV);
		String string = media.play();
		assertEquals("playing Wav", string);
	}
	
	
	@Test
	public void comprobarPlayEnOgg (){
		media = file.createMedia(OGG);
		String string = media.play();
		assertEquals("playing ogg", string);
	}
	
}
