package dog;

public class animal1 {

    public static void main(String args[]){

        Dog marta = new Dog("marta", "Puppy");
        System.out.println("This dog name is "+marta.getName()+" and is a "+marta.getBreed());

        marta.setName("martaa");
        marta.setBreed("puppyy");
        System.out.println("This dog name is "+marta.getName()+" and is a "+marta.getBreed());

    }
}
