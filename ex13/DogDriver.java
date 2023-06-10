public class DogDriver {
    public static void main( String[] args ){
        Dog a = new Dog();

        Dog pal = new Dog("Lassie", "Rough Collie", 3, 26);
        Dog bean = new Dog("bean", "toxirn", 6, 13);

        System.out.println( pal.getName() + " ia a " + pal.getBreed() + ".");
        System.out.println( bean.getName() + " is a " + bean.getBreed() + ".");

        System.out.println( pal.getEverything() );
        System.out.println(a.getEverything() );
    }
}
