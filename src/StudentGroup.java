import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
//	private Student[] students1;
//	private Student[] students1;
	
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
		//return null;
	}

	@Override
	public void setStudents(Student[] students)  {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		for(int i=0;i<students.length;i++){
			this.students[i]=students[i];
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if( index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else
			return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students==null|| index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		Student[] students1 = new Student[students.length+1];;
		
		 
		students1[0]=student;
		for(int i=1;i<students1.length+1;i++){
			students1[i]=students[i-1];
		}
		students =null;
		students=students1;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		Student[] students1 =  new Student[students.length+1];
		
		for(int i=0;i<students.length;i++){
			students1[i]=students[i];
		}
		students1[students.length]=student;
		students=null;
		students=students1;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		
		Student[] students1 = new Student[students.length+1];
		
		for(int i=0; i<index;i++){
			students1[i]=students[i];
			
		}
		students1[index]=student;
		for(int i=index+1;index<students1.length+1;i++){
			students1[i]=students[i];
		}
		students=null;
		students=students1;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		Student[] students1 = new Student[students.length-1];
		 int k=0;
		for(int i=0; i<=index;i++){
			students1[k]=students[i];
			k++;
			}
		for(int i=index+1;i<students1.length;i++){
			students1[k]=students[i];
			k++;
		}
		students=null;
		students=students1;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		Student[] students1 = new Student[students.length];
		
		students1=students;
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)==true){
				
			
			
				 this.remove(i);
				 return ;
			
		}
			
		}	
		throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(students==null|| index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		Student[] students1 = new Student[index];
		
		for(int i=0;i<=index;i++){
			students1[i]=students[i];
		}
		students=null;
		students=students1;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)==true){
				
				
				
				 this.removeFromIndex(i);
				 return ;
			
		}
			
		}
		throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(students==null|| index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		Student[] students1 = new Student[index];
		
		for(int i=index;i<=index;i++){
			students1[i]=students[i];
		}
		students=null;
		students=students1;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(students==null){
			throw new IllegalArgumentException();
		}
		for(int i=0;i<students.length;i++){
			if(students[i].equals(student)==true){
				
				
				
				 this.removeToIndex(i);
				 return ;
			
		}
			
		}
		throw new IllegalArgumentException("Student not exist");
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length;i++){
			for(int j=0;j<students.length;j++){
				if(students[j].compareTo(students[j+1])>0){
					Student temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null){
			throw new IllegalArgumentException();
		}
		int count=0;
		
		
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate()==date){
				count++;
			}
		}
		Student[] students1 =  new Student[count];
		int count1=0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().before(date)||students[i].getBirthDate()==date){
				students1[count1]=students[i];
				count1++;
			}
		}
		return students1;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null||lastDate==null){
			throw new IllegalArgumentException();
		}
		
		int count=0,count1=0;
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate)){
				count++;
			}
		}
		Student[] students1 =  new Student[count];
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate)){
				students1[count1]=students[i];
			}
		}
		return students1;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		Date d1=new Date(date.getDate()+days);
	//	Date d2=new Date(date.getDate()-days);
		int count=0,count1=0;
		if(date==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate()==date || students[i].getBirthDate()==d1 ){
				count++;
			}
		}
		Student[] students1 =  new Student[count];
		for(int i=0;i<students.length;i++){
			if(students[i].getBirthDate()==date || students[i].getBirthDate()==d1 ){
				students1[count1]=students[i];
				count1++;
			}
		}
		return students1;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here\
		if(indexOfStudent==0)
			throw new IllegalArgumentException();
		Date today=new Date();
		long age=(today.getTime()/(1000 * 60 * 60 * 24*365))-(students[indexOfStudent].getBirthDate().getTime()/(1000 * 60 * 60 * 24*365));
		return (int)age;
		//return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		int count=0;
		for(int i=0;i<students.length;i++)
		{
			int age1=this.getCurrentAgeByDate(i);
			if(age1==age)
			{
				count++;
			}
		}
		Student[] students1=new Student[count];
		count=0;
		for(int i=0;i<students.length;i++)
		{
			int age1=this.getCurrentAgeByDate(i);
			if(age1==age)
			{
				students1[count]=students[i];
				count++;
			}
		}
		return students1;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int count=0;
		double max=students[0].getAvgMark();
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()>max)
				max=students[i].getAvgMark();
		}
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()==max)
				count++;
		}
		
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()==max)
				count++;
		}
		Student[] students1=new Student[count];
		count=0;
		for(int i=0;i<students.length;i++)
		{
			students1[count]=students[i];
			count++;
		}
		return students1;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		Student student1=null;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].equals(student))
			{
				 student1 = students[i+1];
			}
		}
		return student;
	}
}
