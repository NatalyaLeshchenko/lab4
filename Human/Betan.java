package Human;

import interfaces.Goable;
import interfaces.Happiness;
import interfaces.Surprised;

public class Betan extends Human implements Goable.Round, Goable.Return, Surprised, Happiness.Laughing {
    public Betan(String name) {
        super(name);
    }

    public void returned(String when) {
        System.out.print( when + get_name()+ ", ");

    }
    public void round() {
        System.out.print( "и " + get_name()+ ", ");
    }
    public void surprised(){
        System.out.print("и "+ get_name()+ ". ");
    }
    public void laughing(){
        System.out.print(get_name()+ " рассмеялась. ");
    }


}
