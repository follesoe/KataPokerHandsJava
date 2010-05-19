
public class Poker {
	Hånd håndEn;
	Hånd håndTo;

	public String finnHånd(String navn1, String navn2, String navn3,
			String navn4, String navn5) {
		
		Hånd hånd = new Hånd(navn1, navn2, navn3, navn4, navn5);
		
		Kort høyesteKort = hånd.høyesteKort();		
		return "High Card : " + høyesteKort.hentVerdi();
	}

	public void settHåndTilSpiller1(String navn1, String navn2,
			String navn3, String navn4, String navn5) {
		håndEn = new Hånd(navn1, navn2, navn3, navn4, navn5);	
	}

	public void settHåndTilSpiller2(String navn1, String navn2,
			String navn3, String navn4, String navn5) {
		håndTo =  new Hånd(navn1, navn2, navn3, navn4, navn5);		
	}

	public String finnVinner() {
		Kombinasjon spillerEn = håndEn.høyesteKombinasjon();
	    Kombinasjon spillerTo = håndTo.høyesteKombinasjon();
	    
	    int compareResult = spillerEn.compareTo(spillerTo);
	    if (compareResult > 0)
	    	return "Spiller 1 vinner. - med " + spillerEn.toString();
	    else if(compareResult < 0)
	    	return "Spiller 2 vinner. - med " + spillerTo.toString();
	    else
	    	return "Uavgjort!";
	}
}
