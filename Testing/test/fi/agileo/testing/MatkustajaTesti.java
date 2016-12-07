package fi.agileo.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MatkustajaTesti {
	
	@Mock
	Profiili mockProfiili;
	
	@Test(expected=LiianVanhaException.class)
	public void testVanhenePoikkeus() throws LiianVanhaException {
		// yksikkötestaaminen, eli lisätty @Test...
		// ylläoleville @-kohdille importtaa ekat vaihtoehdot joka kohtaan
		Matkustaja testattava = new Matkustaja(mockProfiili, 25);
		testattava.vanhene(99);
	}
	
	@Test
	public void testVanhene() throws LiianVanhaException {
		// yksikkötestaaminen, eli lisätty @Test...
		// ylläoleville @-kohdille importtaa ekat vaihtoehdot joka kohtaan
		Matkustaja testattava = new Matkustaja(mockProfiili, 30);
		int paluuArvo; 
		paluuArvo = testattava.vanhene(30);
		
		// add import ... import static org.junit.Assert.assertEquals
		assertEquals(59, paluuArvo);
	}

}

