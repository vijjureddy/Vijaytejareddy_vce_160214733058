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
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		this.students = new Student[students.length];
		for(int i=0;i<students.length;i++)
		{
			this.students[i]=students[i];
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException();
		return students[index];
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<0 || index >= students.length || student==null)
			throw new IllegalArgumentException();
		else
			students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			Student students1[] = new Student[students.length+1]; 
			students1[0] = student;
			for(int i=1;i<students.length+1;i++)
			{
				students1[i] = students[i-1];
			}
			
			students = null;
			
			students = students1;
			
		/*	students = new Student[students.length+1];
			
			setStudents(s);*/
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			Student students1[] = new Student[students.length+1];
			
			for(int i=0;i<students.length;i++)
			{
				students1[i] = students[i];
			}
			students1[students.length] = student;
			
			students = null;
		/*	students = new Student[students.length+1];
			setStudents(s);
			*/
			students = students1;
		}
	}

	@Override
	public void add(Student student, int index) {
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			Student s[] = new Student[students.length+1];
			
			for(int i=0;i<index;i++)
			{
				s[i] = students[i];
			}
			s[index] = student;
			
			for(int i=index+1;i<students.length+1;i++)
			{
				s[i] = students[i];
			}
			students = null;
			
			students = s;
		/*	students = new Student[students.length+1];
			setStudents(s);
		*/
		}
	}

	@Override
	public void remove(int index) {
		if(index <0 || index > students.length)
			throw new IllegalArgumentException();
		else
		{
			int k = 0;
			Student s[] = new Student[students.length-1];
			
			for(int i=0;i<index;i++)
			{
				s[k] = students[i];k++;
			}
			
			for(int i=index+1;i<students.length;i++)
			{
				s[k] = students[i];k++;
			}
			
			students = null;
			
			students = s;
		/*	students = new Student[students.length+1];
			setStudents(s);
		*/
		}
		
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			int ind=0,count=0;
			for(ind=0;ind<students.length;ind++)
			{
				if(students[ind] == student)
				{
					break;
				}
				else
				{
					count++;
				}
			}
			if(count == students.length)
			{
				throw new IllegalArgumentException("Student not exist");
			}
			
			int k=0;
	        Student s[] = new Student[students.length-1];
			
			for(int i=0;i<ind;i++)
			{
				s[k] = students[i];k++;
			}
			
			for(int i=ind+1;i<students.length;i++)
			{
				s[k] = students[i];k++;
			}
			
			students = null;
			
			students = s;
			
			
		}
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		
		
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
		{
			Student s[] = new Student[index+1];
			for(int i=0;i<=index;i++)
			{
				s[i] = students[i];
			}
            students = null;
			
			students = s;
		
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			int ind=0;
			for(ind=0;ind<students.length;ind++)
			{
				if(students[ind] == student)
				{
					break;
				}
			}
			
			Student s[] = new Student[ind+1];
			for(int i=0;i<=ind;i++)
			{
				s[i] = students[i];
			}
            students = null;
			
			students = s;
			
			
		}
		
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
			throw new IllegalArgumentException();
		else
		{
			Student s[] = new Student[students.length-index-1];
			int k=0;
			for(int i=index;i<students.length;i++)
			{
				s[k] = students[i]; k++;
			}
			
            students = null;
			
			students = s;
			
		}
		
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
			int ind=0;
			for(ind=0;ind<students.length;ind++)
			{
				if(students[ind] == student)
				{
					break;
				}
			}
			
			
			Student s[] = new Student[students.length-ind-1];
			int k=0;
			for(int i=ind;i<students.length;i++)
			{
				s[k] = students[i]; k++;
			}
			
            students = null;
			
			students = s;
			
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			for(int j=0;j<students.length-i;j++)
			{
				if( students[j].compareTo(students[j+1]) > 0)
				{
						Student temp = students[j];
						students[j] = students[j+1];
						students[j+1] = temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		if(date==null)
			throw new IllegalArgumentException();
		int count=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate().after(date))
			{
				count++;
			}
		}
		Student[] students1=new Student[count];
		count=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate().after(date))
			{
				students1[count]=students[i];
				count++;
			}
		}
		return students1;
		//return null;
		
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		if(firstDate==null)
			throw new IllegalArgumentException();
		if(lastDate==null)
			throw new IllegalArgumentException();
		int count=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate))
			{
				count++;
			}
		}
		Student[] students1=new Student[count];
		count=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getBirthDate().after(firstDate) && students[i].getBirthDate().before(lastDate))
			{
				students1[count]=students[i];
				count++;
			}
		}
		return students1;
		//return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null)
			throw new IllegalArgumentException();
		Date firstDate=date;
		Date lastDate = new Date(firstDate.getTime() + (days*1000 * 60 * 60 * 24));
		Student[] students1=this.getBetweenBirthDates(firstDate, lastDate);
		return students1;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent==0)
			throw new IllegalArgumentException();
		Date today=new Date();
		long age=(today.getTime()/(1000 * 60 * 60 * 24*365))-(students[indexOfStudent].getBirthDate().getTime()/(1000 * 60 * 60 * 24*365));
		return (int)age;
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
				students1[i]=students[i];
			}
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int count=0;
		double max=students[0].getAvgMark();
		for(int i=0;i<students.length;i++)
		{
			if(students[i].getAvgMark()>=max)
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
		for(int i=0;i<students.length;i++)
		{
			if(students[i].equals(student))
			{
				return students[i+1];
			}
		}
		return null;
	}
}