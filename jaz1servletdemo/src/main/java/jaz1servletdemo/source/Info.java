package jaz1servletdemo.source;

public class Info extends Unit {

	public Info(){
		super();
	}
	
	public Info(String inf1, String inf2, String inf3, String inf4, String inf5){
		super();
		this.inf1 = inf1;
		this.inf2 = inf2;
		this.inf3 = inf3;
		this.inf4 = inf4;
		this.inf5 = inf5;
	}
	
	private String inf1;
	private String inf2;
	private String inf3;
	private String inf4;
	private String inf5;
	private Person person;
	
	public String getInf1() {
		return inf1;
	}

	public void setInf1(String inf1) {
		this.inf1 = inf1;
	}

	public String getInf2() {
		return inf2;
	}

	public void setInf2(String inf2) {
		this.inf2 = inf2;
	}

	public String getInf3() {
		return inf3;
	}

	public void setInf3(String inf3) {
		this.inf3 = inf3;
	}

	public String getInf4() {
		return inf4;
	}

	public void setInf4(String inf4) {
		this.inf4 = inf4;
	}

	public String getInf5() {
		return inf5;
	}

	public void setInf5(String inf5) {
		this.inf5 = inf5;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
