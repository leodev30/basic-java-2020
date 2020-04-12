import java.util.*;
public class FractionList{
		List<Fraction> fractionList = new ArrayList<>();
		protected int numOfFractions = 0;
		
		FractionList(){
			
		}
		public void addFraction(Fraction fraction){
			this.fractionList.add(fraction);
			numOfFractions++;
		}
		public void printList(){
			System.out.println("FractionList :");
			if(this.fractionList.size() == 0){
				System.out.println("Has no Fraction");
			}else{
				for(Fraction fraction : fractionList){
					fraction.display(fraction);
				}
			}
		}
		public void printAbridgedList(){
			System.out.println("Abridged Fraction List :");
			if(this.fractionList.size() == 0){
				System.out.println("Has no fraction");
			}else{
				for(Fraction fraction : fractionList){
					fraction.abridged(fraction);
				}
			}
		}
		public int getNumOfFractions(){
			return numOfFractions;
		}
		
		public static void main(String[] args){
			FractionList mylist = new FractionList();
			mylist.addFraction(new Fraction(1,2));
			mylist.addFraction(new Fraction(3,8));
			mylist.addFraction(new Fraction(6,7));
			mylist.addFraction(new Fraction(7,4));
			mylist.addFraction(new Fraction(5,3));
			mylist.addFraction(new Fraction(3,12));
			System.out.println("Num of Fraction List "+mylist.getNumOfFractions());
			mylist.printList();
			mylist.printAbridgedList();
		}
		
		
		
		
}