
public class StudentArray {

	private Student[] studentArray = null;
	private int lastElement = -1;
	
	public StudentArray() {
		studentArray = new Student[11];
	}
	
	public StudentArray(int size) {
		if(size>=1) {
			studentArray = new Student[size];
		}
		else {
			studentArray = new Student[11];
		}
	}

	public void insertStudent(Student aStudent) {
		studentArray[lastElement + 1] = aStudent;
		lastElement++;
	}
	
	public String find(int anId) {
		int index;
		for(index=0; index<lastElement; index++) // for each element,
			if(studentArray[index].getId() == anId) // found item?
			break; // exit loop before end
		if(index == lastElement) // gone to end?
			return null; // yes, can’t find it
		else
			return studentArray[index].toString(); // no, found it
		} // end find()

	
	@Override
	public String toString() {
		int index = 0;
		String message = "";
		while(index <= lastElement) {
			message = message + studentArray[index].toString();
			index++;
		}
		return message;
	}
	

}
