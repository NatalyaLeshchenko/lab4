package Human;


import interfaces.Appearable;
import interfaces.Lookable;
import interfaces.Runnable_a_program;
import interfaces.Thanked;

public class Gospodin_Pek extends Human implements Appearable, Runnable_a_program, Thanked, Lookable.Look_sad {
    public Gospodin_Pek(String name) {
        super(name);
    }




    @Override
    public void appear(String where) {
        System.out.print( where+ " появился " +get_name() + ".") ;
    }

    public void run_program(String what){
        System.out.print(" "+ get_name()+ " вел " + what+ ". ");
    }


    public void thanked(String who, String why) {
        System.out.print(get_name()+ " поблагодарил "+ who+" "+ why);
    }


    public void look_sad() {
        System.out.print(get_name()+ " выглядел расстерянным. ");
    }
}