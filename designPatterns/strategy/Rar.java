package iis1314.designPatterns.strategy;

public class Rar implements ICompressor{

	public String compress(String data) {
		return "RAR data: -" + data + "-";
	}

}
