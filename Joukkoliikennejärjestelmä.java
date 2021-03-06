/* Pohjoismaiden suurimpien kaupunkiseutujen raidelinjojen pituudet raideliikennemuodon mukaan*/
public class Joukkoliikennejärjestelmä {
	private int id; //Viittaavat kaupunkiseudun kuntiin, jotka kuuluvat järjestelmään
	private String nimi; //Yhteys joukkoliikennejärjestelmään luokassa Seutujoukkoliikenne
	private double raitiotiePituus; //km
	private double pikaraitiotiePituus;
	private double metroPituus;
	private double paikallisjunaPituus;
	
	public Joukkoliikennejärjestelmä(int id, String nimi, double raitiotiePituus, double pikaraitiotiePituus, double metroPituus, double paikallisjunaPituus) {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public double getRaitiotiePituus() {
		return raitiotiePituus;
	}
	public void setRaitiotiePituus(double raitiotiePituus) {
		this.raitiotiePituus = raitiotiePituus;
	}
	public double getPikaraitiotiePituus() {
		return pikaraitiotiePituus;
	}
	public void setPikaraitiotiePituus(double pikaraitiotiePituus) {
		this.pikaraitiotiePituus = pikaraitiotiePituus;
	}
	public double getMetroPituus() {
		return metroPituus;
	}
	public void setMetroPituus(double metroPituus) {
		this.metroPituus = metroPituus;
	}
	public double getPaikallisjunaPituus() {
		return paikallisjunaPituus;
	}
	public void setPaikallisjunaPituus(double paikallisjunaPituus) {
		this.paikallisjunaPituus = paikallisjunaPituus;
	}
	
	public static void main(String[] args) {
		Joukkoliikennejärjestelmä seutu01 = new Joukkoliikennejärjestelmä(1, "SL: Stockholms lokaltrafik", 3.6, 34.9, 107.9, 308.8);
	  //Joukkoliikennejärjestelmä seutu02 = new Joukkoliikennejärjestelmä(2, "DOT", ., ., ., .);
	  //...
		
	}

	
	
}
