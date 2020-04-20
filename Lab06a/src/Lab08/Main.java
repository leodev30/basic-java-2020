package Lab08;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Mèo");
        Animal cat2 = new Cat("Mèo con 1");
        Animal cat3 = new Cat("Mèo con 2");
        cat1.introduce();
        Animal dog1 = new Dog("Chó");
        Animal dog2 = new Dog("Chó con");
        dog1.introduce();
        Animal cow1 = new Cow("bò");
        cow1.introduce();
        System.out.println("Dan so the gioi "+ ((Cat) cat1).getAllPopulation());
    }
}
