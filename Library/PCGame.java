public class PCGame extends Game{
	private double memory;
	private double fileSize;
	private double ghz;

	public PCGame(String description, double memory, double fileSize, double ghz){
		super(description);
		this.memory = memory;
		this.fileSize = fileSize;
		this.ghz = ghz;
	}

	public String toString(){
		String memSTR = "Min. Memory: " + this.memory + " MB\n";
		String fileSTR = "Size: " + this.fileSize + " MB\n";
		String ghzSTR = "Min. CPU: " + this.ghz + " GHz";
		return super.toString() + "\n" + memSTR + fileSTR + ghzSTR;
	}
}