
public class MainController {

	public static void main(String[] args) {

		Student aStudent1 = new Student();
		Student aStudent2 = new Student();
		Student aStudent3 = new Student();
		Student aStudent4 = new Student();
		Student aStudent5 = new Student();
		Student aStudent6 = new Student();
		Student aStudent7 = new Student();
		Student aStudent8 = new Student();
		Student aStudent9 = new Student();
		Student aStudent10 = new Student();
		Student aStudent11 = new Student();

		ConsoleView aView = new ConsoleView();
		StudentArray anArray = new StudentArray();
		
		aStudent1.setId(1);
		aStudent1.setFirstName("John");
		aStudent1.setLastName("Cain");
		aStudent1.setIsCommuter(true);
		
		aStudent2.setId(3);
		aStudent2.setFirstName("Alec");
		aStudent2.setLastName("Vosika");
		aStudent2.setIsCommuter(true);
		
		aStudent3.setId(5);
		aStudent3.setFirstName("Trevor");
		aStudent3.setLastName("Johnson");
		aStudent3.setIsCommuter(true);
		
		aStudent4.setId(7);
		aStudent4.setFirstName("Alex");
		aStudent4.setLastName("Martin");
		aStudent4.setIsCommuter(true);
		
		aStudent5.setId(9);
		aStudent5.setFirstName("Trevor");
		aStudent5.setLastName("Parsons");
		aStudent5.setIsCommuter(true);
		
		aStudent6.setId(11);
		aStudent6.setFirstName("Marry");
		aStudent6.setLastName("Ann");
		aStudent6.setIsCommuter(true);
		
		aStudent7.setId(13);
		aStudent7.setFirstName("Maddy");
		aStudent7.setLastName("Peterson");
		aStudent7.setIsCommuter(true);
		
		aStudent8.setId(15);
		aStudent8.setFirstName("Steve");
		aStudent8.setLastName("Potter");
		aStudent8.setIsCommuter(true);
		
		aStudent9.setId(17);
		aStudent9.setFirstName("Heather");
		aStudent9.setLastName("Hartman");
		aStudent9.setIsCommuter(true);
		
		aStudent10.setId(19);
		aStudent10.setFirstName("Bob");
		aStudent10.setLastName("Hartman");
		aStudent10.setIsCommuter(true);
		
		aStudent11.setId(21);
		aStudent11.setFirstName("Andy");
		aStudent11.setLastName("Dulany");
		aStudent11.setIsCommuter(true);
		
		//System.out.println(aStudent1.toString());
		//aView.print(aStudent1.toString());
		anArray.insertStudent(aStudent1);
		anArray.insertStudent(aStudent2);
		anArray.insertStudent(aStudent3);
		anArray.insertStudent(aStudent4);
		anArray.insertStudent(aStudent5);
		anArray.insertStudent(aStudent6);
		anArray.insertStudent(aStudent7);
		anArray.insertStudent(aStudent8);
		anArray.insertStudent(aStudent9);
		anArray.insertStudent(aStudent10);
		anArray.insertStudent(aStudent11);

		
		aView.print(anArray.toString());
		
		int searchKey = 21;
		String found;
		found=anArray.find(searchKey);
		if(found != null) {
			System.out.println("Found ");
			aView.print(found);
		}
		
	}

}
