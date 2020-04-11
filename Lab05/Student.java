public class Student extends Person{
		protected String classroom;
		Student(){
			
		}
		public Student(String name, String address, String department){
			this.name = name;
			this.address = address;
			this.department = department;
		}
		public Student(String classroom){
			this.classroom = classroom;
		}
		public void setClassroom(String classroom){
			this.classroom = classroom;
		}
		public String getClassroom(){
			return classroom;
		}
	}