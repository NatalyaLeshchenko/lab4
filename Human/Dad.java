package Human;

import interfaces.Goable;
import interfaces.Surprised;

public class Dad extends Human implements Goable.Return, Surprised,Goable.Round {
    public Dad(String name) {
        super(name);
    }

    public void returned(String when) {
        System.out.print( when + get_name()+ ", ");

    }
    public void round() {
        System.out.print( "Все они -- и " + get_name()+ ", ");

    }
    public void surprised(){
        System.out.print("и "+ get_name()+ ", ");
    }
}

