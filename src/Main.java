import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		String valuee="25/04/2013";
	     Date currentDate =new SimpleDateFormat("dd/MM/yyyy").parse(valuee);
		Student student= new Student(123,"Harsha",currentDate,235.24);
		StudentGroup sg = new StudentGroup(1);
		sg.addFirst(student);
	}

}
