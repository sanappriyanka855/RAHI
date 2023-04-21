package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList <String> al=new ArrayList<>();
       
      al.add("vidhi");
      al.add("bhusare");
      al.add("rohini");
      al.add("sandeep");
      al.add("sai");
      
      Iterator<String> itr=al.iterator(); //work in forward direction
       
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
	}

}
