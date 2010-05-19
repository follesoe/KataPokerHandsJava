
public class Kombinasjon {
	
	
	private PokerKombinasjoner høyesteKombinasjon;
	private Kort høyesteKort;
	
	public String toString() {
		return høyesteKombinasjon.hentNavn() + ": " + høyesteKort.hentVerdi();
	}
	
	public PokerKombinasjoner getHøyesteKombinasjon() {
		return høyesteKombinasjon;
	}
	public Kort getHøyesteKort() {
		return høyesteKort;
	}
	
	public Kombinasjon(PokerKombinasjoner høyesteKombinasjon, Kort høyesteKort) {
		this.høyesteKombinasjon = høyesteKombinasjon;
		this.høyesteKort = høyesteKort;
	}
	public int compareTo(Kombinasjon kombinasjon) {
		int comparison = getHøyesteKombinasjon().compareTo(kombinasjon.getHøyesteKombinasjon());
		
		if (comparison == 0)
			return getHøyesteKort().compareTo(kombinasjon.getHøyesteKort());
		else
			return comparison;
	}
	
	

}
