
public class Cat extends Animal {
    static int population = 0;
    Cat(String name){
        super(name);
        population++;
    }
    @Override
    public void makeASound() {
        System.out.println("Meo Meo!");
    }

    @Override
    public void introduce() {
        makeASound();
        System.out.println("Toi la "+ getName());
        System.out.println("Dan so la "+ getPopulation());
    }
    public void giveBirth(){
        Cat con = new Cat(this.name+"'s baby");
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
