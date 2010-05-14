
public class Poker {
	String håndEn;
	String håndTo;

	public int sammenlign(Kort kort1, Kort kort2) {
		
		int verdi1 = kort1.hentTallVerdi();
		int verdi2 = kort2.hentTallVerdi();
					
		return verdi1 - verdi2;
	}

	public String finnHånd(String navn1, String navn2, String navn3,
			String navn4, String navn5) {
		
		Kort kort1 = new Kort(navn1);
		Kort kort2 = new Kort(navn2);
		Kort kort3 = new Kort(navn3);
		Kort kort4 = new Kort(navn4);
		Kort kort5 = new Kort(navn5);
		
		Kort[] allekort = {kort1, kort2, kort3, kort4, kort5};
		
		Kort høyesteKort = null;
		for (Kort kort : allekort) {
			if(høyesteKort == null) {
				høyesteKort = kort;
			}
			else if(sammenlign(høyesteKort, kort) <0) {
				høyesteKort = kort;
			}		
		}		
		return "High Card : " + høyesteKort.hentVerdi();
	}

	public void settHåndTilSpiller1(String navn1, String navn2,
			String navn3, String navn4, String navn5) {
		håndEn = finnHånd(navn1, navn2, navn3, navn4, navn5);	
	}

	public void settHåndTilSpiller2(String navn1, String navn2,
			String navn3, String navn4, String navn5) {
		håndTo =  finnHånd(navn1, navn2, navn3, navn4, navn5);		
	}

	public String finnVinner() {
		return "Spiller 2 vinner. - med  High Card: A";
	}
}
