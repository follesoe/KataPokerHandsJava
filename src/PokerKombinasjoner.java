public enum PokerKombinasjoner {
	HøyesteKort("High Card"),
	Par("Pair"),
	ToPar("Two pair"),
	Tres("Three of a kind"),
	Straight("Straight"),
	Flush("Flush"),
	Hus("Full house"),
	FireLike("Four of a kind"),
	StraightFlush("Straight flush"),
	RoyalStraightFlush("Royal straight flush"); 
	private String navn;
	
	PokerKombinasjoner(String navn) {
		this.navn=navn;
	}
	
	String hentNavn() {
		return navn;
	}
}
