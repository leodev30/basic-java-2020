package Lab08;

public class Dog extends Animal {
    static  int population = 0;
    private String name;
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
    public String getName(){
        return name;
    }
    public int getPopulation(){
        return population;
    }
}
