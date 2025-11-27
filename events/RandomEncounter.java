package events;
import java.util.Scanner;
import core.Student;

public class RandomEncounter extends Event {
    public String ans = "";

    @Override
    public void run(Student s) {
        Scanner console = new Scanner(System.in);
        System.out.println("Random event! A lecturer greets you warmly. Asks if you love anime.");
        // TODO: maybe add energy, reduce energy or add some random consequences
        System.out.println("answer Y/N");
        ans = console.next();
        ans = ans.toUpperCase();
        console.close();
    }

    public void perform(Student s){
        if(ans.equals("Y")){
            System.out.println("you enjoyed the conversation uplifiting your mood");
            s.increaseEnergy(10);
        }else{
            System.out.println("you got bored of the conversation and got annoyed");
            s.decreaseEnergy(10);
        }
    }
}
