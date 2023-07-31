import java.util.ArrayList;

public class ArrayListIntro{
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println( "ArrayList has size(): " + arr.size());

        arr.add("Ant-man");
        arr.add("Hulk");
        arr.add("Thor");
        arr.add("Iron Man");
        arr.add("Wasp");

        System.out.println( "ArrayList has size(): " + arr.size());
        System.out.println("Current Contents:" + arr );
        //showList(arr);

    }
}