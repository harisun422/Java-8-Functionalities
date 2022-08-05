import java.util.stream.*;
public class Streams001 {

	ArrayList<String> al = new ArrayList<String>();
	al.add("Hari");
	al.add("India");
	al.add("USA");
	al.add("123");
	
	int s = al.Stream().count();
	System.out.println(s);
}
