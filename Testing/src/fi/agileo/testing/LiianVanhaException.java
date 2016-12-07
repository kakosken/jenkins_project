package fi.agileo.testing;

// kun tää LiianVanhaException herjaa keltaista väriä
// niin klikkaa eka valinta eli serialisointi
// Add default serial version ID
// ei oo pakollinen, mut tää nyt herjaa siitä
public class LiianVanhaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Matkustaja ei voi olla liian vanha";	
	}

	@Override
	public String toString() {
		return "LiianVanhaException";
	}

}
