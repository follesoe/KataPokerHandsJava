import junit.framework.TestCase;


public class PokerHandsTests extends TestCase {

	public void testFinnAtToKortHarLikVerdi(){
		Kort kort1 = new Kort("3D");
		Kort kort2 = new Kort("3H");
		Poker poker = new Poker();
		assertTrue(poker.sammenlign(kort1, kort2) == 0);
	}

	public void testFinnH�yesteKortAvToKort() {
		Kort kort1 = new Kort("4D");
		Kort kort2 = new Kort("3H");
		Poker poker = new Poker();
		assertTrue(poker.sammenlign(kort1, kort2) > 0);
	}
	
	public void testSjekkAtKortTHarVerdi10() {
		Kort kort = new Kort("TD");		
		assertEquals(10, kort.hentTallVerdi());
	}
	
	public void testSjekkAtKortJHarVerdi11() {
		Kort kort = new Kort("JD");		
		assertEquals(11, kort.hentTallVerdi());
	}
	
	public void testSjekkAtKortQHarVerdi12() {
		Kort kort = new Kort("QH");		
		assertEquals(12, kort.hentTallVerdi());
	}
	
	public void testSjekkAtKortKHarVerdi13() {
		Kort kort = new Kort("KH");		
		assertEquals(13, kort.hentTallVerdi());
	}

	public void testSjekkAtKortAHarVerdi14() {
		Kort kort = new Kort("AD");		
		assertEquals(14, kort.hentTallVerdi());
	}
	
	public void testSjekkAtFemUlikeKortErHighCard() {
		Poker poker = new Poker();
		String h�nd = poker.finnH�nd("KD", "TD","8D","7D","3H");
		assertEquals(h�nd, "High Card : K" );
	}
	
	public void testSjekkAtFemUlikeKortGirHighCardT() {
		Poker poker = new Poker();
		String h�nd = poker.finnH�nd("2D", "3H", "5D", "7C", "TH");
		assertEquals(h�nd, "High Card : T" );
	}
	
	public void testFinnBesteAvToHighCardHender() {
		Poker poker = new Poker();
		
		poker.settH�ndTilSpiller1("2D", "3H", "5D", "7C", "TH");
		poker.settH�ndTilSpiller2("2D", "3H", "5D", "7C", "AH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Spiller 2 vinner. - med  High Card: A");
	}
}
