package fi.agileo.testing;

public class Matkustaja {
	// https://moodle.agileo.fi/moodle/pluginfile.php/683/mod_resource/content/0/Testaus_harj.pdf
	//  Tee Matkustaja-luokkaan attribuutti ika, 
	/// joka kertoo matkustajan iän
	//  Tee Matkustaja-luokkaan metodi vanhene(int vuosi)
	// , joka kasvattaa ikää vuosien verran. 
	private Profiili profiili;
	private int ika;
	
	public void setIka(int ika) {
		this.ika = ika;
	}
	
	// vaihetaan voidin tilalle int, iske return...
	public int vanhene (int vuosia) throws LiianVanhaException {
		this.ika += vuosia;
		if(ika>100) {
			throw new LiianVanhaException();
			
		}
		return this.ika;
		
	}
	
	public int getIka() {
		return ika;
	}
	
	public Matkustaja(Profiili profiili, int ika) {
		this.profiili = profiili;
		this.ika = ika;
	}
	
	public Profiili getProfiili() {
		return profiili;
	}

	public void setProfiili(Profiili profiili) {
		this.profiili = profiili;
	}
	
	public String kerroHinta(double hinta) {
		return "Hinta on " +  profiili.muunnaHinta(hinta);
	}
	
}
