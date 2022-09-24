package exams2015ba;

public class info_komatos{
	
	private String onoma;
        private int psifous;
        private int edres;

    public info_komatos(String onoma, int psifous, int edres) {
        this.onoma = onoma;
        this.psifous = psifous;
        this.edres = edres;
    }

    public String getOnoma() {
        return onoma;
    }

    public int getPsifous() {
        return psifous;
    }

    public int getEdres() {
        return edres;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public void setPsifous(int psifous) {
        this.psifous = psifous;
    }

    public void setEdres(int edres) {
        this.edres = edres;
    }

    @Override
    public String toString() {
        return "centre{" + "onoma=" + onoma + ", psifous=" + psifous + ", edres=" + edres + '}';
    }

    
        
	   	
}
