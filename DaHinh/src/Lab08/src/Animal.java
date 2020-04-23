
public abstract class Animal {
    public String name;
    static int population;
    Animal(String name){
        this.name = name;
        population++;
    }
    public abstract  void makeASound();
    public abstract  void introduce();
    public abstract void giveBirth();
    public int getAllPopulation(){
        return  population;
    }

}

