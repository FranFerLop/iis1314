package iis1314.designPatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategy {
	private final String SALIDA_RAR = "RAR data: -string to compress-";
	private final String SALIDA_ZIP = "ZIP data: -string to compress-";
	private final String SALIDA_7ZIP = "7ZIP data: -string to compress-";
	private final String data = "string to compress";
	
	private ICompressor compressor;
		
	private Context context;
	private String salida;

	@Test
	public void comprimirUnRar () {
		compressor = new Rar();
		assertEquals(SALIDA_RAR, compressor.compress(data));
	}
	
	@Test
	public void comprimirUnZip (){
		compressor = new Zip();
		assertEquals(SALIDA_ZIP, compressor.compress(data));
	}
	
	@Test
	public void comprimirUnSevenZip (){
		compressor = new SevenZip ();
		assertEquals(SALIDA_7ZIP, compressor.compress(data));
	}
	
	@Test
	public void comprobarCreacionDeContextoRar (){
		compressor = new Rar ();
		context = new Context (compressor);
		assertEquals(Rar.class, context.getStrategia().getClass());
	}
	
	@Test
	public void comprobarCreacionDeContextoZip (){
		compressor = new Zip ();
		context = new Context (compressor);
		assertEquals(Zip.class, context.getStrategia().getClass());
	}
	
	@Test
	public void comprobarCreacionDeContexto7Zip (){
		compressor = new SevenZip ();
		context = new Context (compressor);
		assertEquals(SevenZip.class, context.getStrategia().getClass());
	}
	
	@Test
	public void comprbarCambiarEstrategia (){
		compressor = new Rar ();
		context = new Context (compressor);
		context.setCompressor(new Zip());
		
		assertEquals(Zip.class, context.getStrategia().getClass());
	}
	
}
