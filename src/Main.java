import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();
        
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain");
        states.addFirst("Spain");
        states.add(1, "Italy");

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst();
        states.removeLast();

        LinkedList<P> people = new LinkedList<P>();
        people.add(new P("Mike"));
        people.addFirst(new P("Tom"));
        people.addLast(new P("Nick"));
        people.remove(1);

        for(P p : people){

            System.out.println(p.getP1());
        }
        P first = people.getFirst();
        System.out.println(first.getP1());
    }
}
