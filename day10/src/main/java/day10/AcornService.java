package day10;

import java.util.ArrayList;

public class AcornService {
	
	
	public ArrayList<Acorn> getList(){
		
		ArrayList<Acorn> list = new ArrayList<>();
		list.add( new Acorn("kimsol", "1234", "김솔"));
		list.add( new Acorn("ssb", "0000", "송수빈"));
		list.add( new Acorn("hjin", "5678", "이효진"));
		list.add( new Acorn("jsuk", "2426", "김정석"));
		
		return null;
	}

}
