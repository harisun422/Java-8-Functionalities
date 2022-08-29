package versionEight;

public class Associate implements Comparable<Associate>{

	int id;
	String grade;
	String name;
	double salary;
	
	Associate(String name,int id,String grade,double sal){
	this.id=id;
	this.name=name;
	this.grade=grade;
	this.salary=sal;
	}
	
	public String toString() {
		return "Name: "+name+" id: "+id+" grade: "+grade+" sal: "+salary;
	}

	@Override
	public int compareTo(Associate o) {
		return this.salary>=o.salary?1:-1;
		
	}
}
