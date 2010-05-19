
public class Kort {
	private String _verdi;
	private String _farge;
	
	public Kort(String navn) {
		_verdi = navn.substring(0,1);
		_farge = navn.substring(1);
	}
	
	public String hentVerdi() {
		return _verdi;
	}
	
	public int hentTallVerdi() {
		if( _verdi.equals("T") ) return 10;
		if( _verdi.equals("J") ) return 11;
		if( _verdi.equals("Q") ) return 12;
		if( _verdi.equals("K") ) return 13;
		if( _verdi.equals("A") ) return 14;
		return Integer.parseInt(_verdi);
	}
	
	public int compareTo(Kort k) {
		int verdi1 = this.hentTallVerdi();
		int verdi2 = k.hentTallVerdi();
					
		return verdi1 - verdi2;
	}
	
}
