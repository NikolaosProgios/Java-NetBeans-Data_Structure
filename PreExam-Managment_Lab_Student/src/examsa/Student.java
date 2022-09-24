package examsa;

public class Student{
	
	private int am;
	private String onoma;
        private int apousies;
        private double vathmos;
	   
        public Student(int am,String onoma,int apousies, double vathmos){
		this.am=am;
		this.onoma=onoma;
                this.apousies=apousies;
		this.vathmos=vathmos;		
	}
	
	public void setAm(int am){
		this.am=am;
	}
	
	public void setOnoma(String onoma){
		this.onoma=onoma;
	}
		
	public void setVathmos(double vathmos){
		this.vathmos=vathmos;
	}
	
	public void setApousies(int apousies){
		this.apousies=apousies;
	}
        public int getAM(){
		return am;
	}
	
	public String getOnoma(){
		return onoma;
	}
	
	public double getVathmos(){
		return vathmos;
	}
        
	public int getApousies(){
		return apousies;
	}

	public String toString(){
		return ("AM:"+am+"\nOnoma:"+onoma+"\nVathmos:"+vathmos+"\nApousies:"+apousies);	
	}	
}
