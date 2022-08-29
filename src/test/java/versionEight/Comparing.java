package versionEight;

import java.util.*;

import org.junit.Test;
public class Comparing {

	//comparator vs comparable
	
	List<Associate> asc = new ArrayList<Associate>();
	@Test
	public void TestPerson() {
		asc.add(new Associate("a",4733,"AST",50)) ;
		asc.add(new Associate("b",4788,"ITA",10)) ;
		asc.add(new Associate("c",3388,"ASOC",40)) ;
		
		Comparator<Associate> c= (x,y) -> x.id>y.id?1:x.id<y.id?-1:0;
		Collections.sort(asc,(x,y) -> x.id>y.id?1:x.id<y.id?-1:0);
		for(Associate a: asc) {
			System.out.println(a);
		}
		Collections.sort(asc);
		for(Associate a: asc) {
			System.out.println(a);
		}
	}
	
	
	
	
}
