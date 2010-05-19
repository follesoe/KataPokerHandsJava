import junit.framework.TestCase;


public class PokerHandsTests extends TestCase {

	public void testFinnAtToKortHarLikVerdi(){
		Kort kort1 = new Kort("3D");
		Kort kort2 = new Kort("3H");
		assertTrue(kort1.compareTo(kort2) == 0);
	}

	public void testFinnHøyesteKortAvToKort() {
		Kort kort1 = new Kort("4D");
		Kort kort2 = new Kort("3H");
		assertTrue(kort1.compareTo(kort2) > 0);
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
		String hånd = poker.finnHånd("KD", "TD","8D","7D","3H");
		assertEquals(hånd, "High Card : K" );
	}
	
	public void testSjekkAtFemUlikeKortGirHighCardT() {
		Poker poker = new Poker();
		String hånd = poker.finnHånd("2D", "3H", "5D", "7C", "TH");
		assertEquals(hånd, "High Card : T" );
	}
	
	public void testFinnBesteAvToHighCardHender() {
		Poker poker = new Poker();
		
		poker.settHåndTilSpiller1("2D", "3H", "5D", "7C", "TH");
		poker.settHåndTilSpiller2("2D", "3H", "5D", "7C", "AH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Spiller 2 vinner. - med High Card: A");
	}
	
	
	public void testFinnBesteAvToHighCardHenderDerSpiller1Vinner() {
		Poker poker = new Poker();
		
		poker.settHåndTilSpiller1("2D", "3H", "5D", "7C", "KH");
		poker.settHåndTilSpiller2("2D", "3H", "5D", "7C", "TH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Spiller 1 vinner. - med High Card: K");
	}
	
	public void testFinnBesteEttPar() {
		Poker poker = new Poker();
		
		poker.settHåndTilSpiller1("2D", "3H", "7D", "7C", "KH");
		poker.settHåndTilSpiller2("2D", "3H", "5D", "7C", "TH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Spiller 1 vinner. - med Pair: 7");
	}
	
	public void testHøyesteParVinner() {
		Poker poker = new Poker();
		
		poker.settHåndTilSpiller1("3D", "3H", "7D", "9C", "KH");
		poker.settHåndTilSpiller2("2D", "5H", "5D", "7C", "TH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Spiller 2 vinner. - med Pair: 5");
	}
	
	public void testIdentiskeHenderGirUavgjort() {
		Poker poker = new Poker();
		
		poker.settHåndTilSpiller1("2D", "3H", "7D", "7C", "KH");
		poker.settHåndTilSpiller2("2D", "3H", "7D", "7C", "KH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Uavgjort!");
	}
	
	public void testStraightVinner() {
		Poker poker = new Poker();
		
		poker.settHåndTilSpiller1("2D", "3H", "4D", "5C", "6H");
		poker.settHåndTilSpiller2("2D", "3H", "7D", "7C", "KH");
		String resultat = poker.finnVinner();
		
		assertEquals(resultat, "Spiller 1 vinner. - med Straight: 6");		
	}

}
