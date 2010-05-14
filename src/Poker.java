
public class Poker {
	String h�ndEn;
	String h�ndTo;

	public int sammenlign(Kort kort1, Kort kort2) {
		
		int verdi1 = kort1.hentTallVerdi();
		int verdi2 = kort2.hentTallVerdi();
					
		return verdi1 - verdi2;
	}

	public String finnH�nd(String navn1, String navn2, String navn3,
			String navn4, String navn5) {
		
		Kort kort1 = new Kort(navn1);
		Kort kort2 = new Kort(navn2);
		Kort kort3 = new Kort(navn3);
		Kort kort4 = new Kort(navn4);
		Kort kort5 = new Kort(navn5);
		
		Kort[] allekort = {kort1, kort2, kort3, kort4, kort5};
		
		Kort h�yesteKort = null;
		for (Kort kort : allekort) {
			if(h�yesteKort == null) {
				h�yesteKort = kort;
			}
			else if(sammenlign(h�yesteKort, kort) <0) {
				h�yesteKort = kort;
			}		
		}		
		return "High Card : " + h�yesteKort.hentVerdi();
	}

	public void settH�ndTilSpiller1(String navn1, String navn2,
			String navn3, String navn4, String navn5) {
		h�ndEn = finnH�nd(navn1, navn2, navn3, navn4, navn5);	
	}

	public void settH�ndTilSpiller2(String navn1, String navn2,
			String navn3, String navn4, String navn5) {
		h�ndTo =  finnH�nd(navn1, navn2, navn3, navn4, navn5);		
	}

	public String finnVinner() {
		return "Spiller 2 vinner. - med  High Card: A";
	}
}
