import java.util.*;
import java.util.function.Predicate;

public class Classroom{
		List<Student> StudentList = new ArrayList<>();
		protected String name;
		protected int numOfStudents = 0;
		protected Teacher advisor = new Teacher();
		Classroom(String name){
			this.name = name;
		}
		public void addStudent(Student student){
			this.StudentList.add(student);
			student.classroom = name;
			numOfStudents++;
		}
		public void addTeacher(Teacher teacher){
			this.advisor = teacher;
		}
		public void removeStudent(String name) {
			Predicate<Student> isStudentToDelete = (Student student) -> {
				return student.getName().compareTo(name) == 0;
			};
			this.StudentList.removeIf(isStudentToDelete);
			numOfStudents--;
		}

		public void printList(){
			System.out.println("StudentList "+name+" :");
			System.out.println(advisor.getName());
			if(this.StudentList.size() == 0){
				System.out.println("Has no student");
			}else{
				for(Student student : StudentList){
					System.out.println(student.getName()+","+student.getAddress());
				}
			}
		}
		public int getNumOfStudents(){
			return numOfStudents;
		}
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			Classroom myclass = new Classroom("Java1802e");
			myclass.addTeacher(new Teacher("Nguyen Thai Son","Ha Noi","IT","Thac Si"));
			myclass.addStudent(new Student("Pham Ngoc Tuan","Thai Binh","sinh vien"));
			myclass.addStudent(new Student("Dinh Huy Duong","Ha Noi","sinh vien"));
			myclass.addStudent(new Student("Nguyen Hoang Vien","Ha Noi","sinh vien"));
			myclass.printList();
			System.out.println("So hoc sinh hien tai la "+myclass.getNumOfStudents());
			myclass.removeStudent("Nguyen Hoang Vien");
			System.out.println("Danh sach sau khi xoa NGUYEN HOANG VIEN");
			myclass.printList();
			System.out.println("So hoc sinh hien tai la "+myclass.getNumOfStudents());
		}
	
}
		
	