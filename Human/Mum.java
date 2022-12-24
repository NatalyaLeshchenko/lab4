package Human;

import interfaces.Goable;
import interfaces.Interrupted;
import interfaces.Lookable;
import interfaces.Surprised;

public class Mum extends Human implements Lookable, Goable.Return, Surprised, Interrupted {
    public Mum (String name) {
        super(name);
    }

    public void returned(String when) {
        System.out.print( when + "-- но все равно это было самое главное! -- " + get_name()+ "! ");
    }
    public void surprised(){
        System.out.print("Как все удивились: "+ "и "+ get_name()+ ", ");
    }


    public void interrupted() {
        System.out.print("Но"+ " вмешалась "+ get_name()+ ". ");
    }

    public void see(String when, String what) {
        System.out.print("Мама"+ " и все остальные "+ "смотрели"+ what);
    }
}
