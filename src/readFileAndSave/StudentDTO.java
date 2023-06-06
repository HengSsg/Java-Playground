package readFileAndSave;

public class StudentDTO {
	private int stdNo;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	
	public StudentDTO(int stdNo, String email, int k, int e, int m,
                      int s, int h, int t,
                      String mgr, String acc, String loc) {
		this.stdNo = stdNo;
		this.email = email;
		this.kor = k;
		this.eng = e;
		this.math = m;
		this.sci = s;
		this.hist = h;
		this.total = t;
		this.mgrCode = mgr;
		this.accCode = acc;
		this.locCode = loc; 
	}
	
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getHist() {
		return hist;
	}
	public void setHist(int hist) {
		this.hist = hist;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getMgrCode() {
		return mgrCode;
	}
	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getLocCode() {
		return locCode;
	}
	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	
	@Override
	public String toString() {
		return "StudentDTO [stdNo=" + stdNo + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", mgrCode=" + mgrCode + ", accCode=" + accCode + ", locCode=" + locCode + "]";
	}
	
	
}
