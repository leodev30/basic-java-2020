public class Person{
		public String name;
		public String address;
		public String department;
		
		Person(){
			
		}
		public Person(String name, String address, String department){
			this.name = name;
			this.address = address;
			this.department = department;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public void setAddress(String address){
			this.address = address;
		}
		public String getAddress(){
			return address;
		}
		public void setDepartment(String department){
			this.department = department;
		}
		public String getDepartment(){
			return department;
		}
		
		public void print(){
			System.out.println(name+","+address+","+department);
		}
	}