
public class Dog extends Animal {
    static  int population = 0;
    Dog(String name){
        super(name);
        population++;
    }
    @Override
    public void makeASound() {
        System.out.println("Gâu Gâu!");
    }

    @Override
    public void introduce() {
        makeASound();
        System.out.println("Toi la "+getName());
        System.out.println("Dan so la "+ getPopulation());
    }
    public void giveBirth(){
        Dog con = new Dog(this.name+"'s baby");
        con.introduce();
    }
    public String getName(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
    public void finalize(){
        this.name = null;
        population--;
    }
}
