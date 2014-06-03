package iis1314.designPatterns.strategy;

public class Zip implements ICompressor {

	public String compress(String data) {
		return "ZIP data: -string to compress-";
	}
	
}
