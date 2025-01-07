
public class Square {
	
	private double kantenLeange;
	private String linienFarbe;
	private String fuellFarbe;
	
	public Square() {
	}
	
	public Square(double kantenLaenge) {
		this.kantenLeange = kantenLaenge;
	}
	
	public Square(double kantenLaenge, String linienFarbe, String fuellFarbe) {
		this.kantenLeange = kantenLaenge;
		this.linienFarbe = linienFarbe;
		this.fuellFarbe = fuellFarbe;
	}
	
	
	
	public double getKantenLaenge() {
		return kantenLeange;
	}

	public String getLinienFarbe() {
		return linienFarbe;
	}
	
	public String getFuellFarbe() {
		return fuellFarbe;
	}
	
	public void setKantenLeange (double kantenLaenge) {
		this.kantenLeange = kantenLaenge;
	}
	
	public void setLinienFarbe(String linienFarbe) {
		this.linienFarbe = linienFarbe;
	}
	
	public void setFuellFarbe (String fuellFarbe) {
		this.fuellFarbe = fuellFarbe;
	}
	
	public double getArea() {
		return kantenLeange * kantenLeange;
	}
}
