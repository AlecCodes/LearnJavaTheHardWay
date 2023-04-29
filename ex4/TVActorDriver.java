public class TVActorDriver {
    public static void main(String[] args){
        TVActor a = new TVActor();
        a.name = "Thomas Middleditch";
        a.role = "Richard Hendricks";
        a.based = "Based";

        TVActor b = new TVActor();
        b.name = "Martin Starr";
        b.role = "Bertram Gilfoyle";
        b.based = "Based";

        TVActor c = new TVActor();
        c.name = "Kumail Nanjiani";
        c.role = "Dinesh Chugtai";
        c.based = "Based";

        System.out.println( a.name + " played " + a.based );
        System.out.println( b.name + " played " + b.based );
        System.out.println( c.name + " played " + c.based );

    }    
}
