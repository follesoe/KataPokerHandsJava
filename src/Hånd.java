
public class Hånd {
	private Kort[] _hånd = new Kort[5];
	public Hånd(String kort1, String kort2, String kort3, String kort4, String kort5){
		_hånd[0] = new Kort(kort1);
		_hånd[1] = new Kort(kort2);
		_hånd[2] = new Kort(kort3);
		_hånd[3] = new Kort(kort4);
		_hånd[4] = new Kort(kort5);
	}
	public Kort[] getHånd() {
		return _hånd;
	}
	
	public Kort høyesteKort() {
		Kort høyesteKort = null;
		for (Kort kort : _hånd) {
			if(høyesteKort == null) {
				høyesteKort = kort;
			}
			else if(høyesteKort.compareTo(kort) <0) {
				høyesteKort = kort;
			}		
		}
		return høyesteKort;
	}
	
	public Kombinasjon høyesteKombinasjon() {
		
		boolean straight = true;
		for (int i = 0; i < 4; i++) {
			if (_hånd[i+1].hentTallVerdi() - _hånd[i].hentTallVerdi() != 1)
				straight = false;
		}
		if (straight) {
			return new Kombinasjon(PokerKombinasjoner.Straight, this._hånd[4]);
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++)
				if (i!=j) 
					if (_hånd[i].compareTo(_hånd[j]) == 0) {
						return new Kombinasjon(
								PokerKombinasjoner.Par, 
								this._hånd[i]);
			}
		}
		
		return new Kombinasjon(
				PokerKombinasjoner.HøyesteKort, 
				this.høyesteKort());
	}
}
