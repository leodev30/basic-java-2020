public class Teacher extends Person{
		protected String rank;
		Teacher(){
			
		}
		public Teacher(String name, String address, String department, String rank){
			this.name = name;
			this.address = address;
			this.department = department;
			this.rank = rank;
		}
		public void setRank(String rank){
			this.rank = rank;
		}
		public String getRank(){
			return rank;
		}
	}