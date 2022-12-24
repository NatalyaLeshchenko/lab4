package Human;

import interfaces.Goable;
import interfaces.Surprised;

public class Bosse extends Human implements Goable.Return, Goable.Round, Surprised {

    public Bosse(String name) {
        super(name);
    }
public void returned(String when){
    System.out.print(when+ "вернулись "+ get_name());
}
    public void round() {
        System.out.print( "и " + get_name()+ ", ");
    }
    public void surprised(){
        System.out.print("и "+ get_name()+ ", ");
    }
}
