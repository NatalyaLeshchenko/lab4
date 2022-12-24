package Human;

import interfaces.*;



public class Karlson extends Human implements Fly,Create,Continue, Up, Hugging, Lookable,Eatable, Switched_off, Happiness.Satisfied, Happiness.Smile, Sayable.Question, Touch, Pushed {
    public Karlson(String name) throws NameError {
        super((name.isEmpty()) ? "Карлсон" : name);
        if (!name.isEmpty()){

            System.out.println("Карлсон присоединился к истории");}
        else {
            throw new NameError("Объект не смог присоединиться к истории!");

        }
    }


public void smile (String when ){
    System.out.print( when+ " " +get_name()+ " улыбнулся," );
}
    public void satisfied (String what ){
        System.out.print( what+ "был довольный. ");
    }


    public void switched_off(String what) {
        System.out.print(" и выключил "+ what + ". ");
    }


    public void pushed(String who, String how) {
        System.out.print(get_name()+ " толкнул"+ who + how);
    }


    public void eat(String who, String what) {
        System.out.print("Потом "+ who+ " съели "+ what);
    }


    public void see(String when, String what) {
        System.out.print(when+ "смотрели,"+ what);
    }


    public void hug(String what, String time, String why) {
        System.out.print(get_name()+ " схватил "+ what);
    }


    public void up(String when, String where, String how) {
        System.out.print(when+ " подкинул его "+ where+ how);
    }


    public void continued(String how, String what) {
        System.out.print( "и "+get_name()+ how+ "продолжал кидать "+ what+ " .");

    }
    public void create() {
        System.out.print( " вытворяет "+get_name()+ ". " );
    }


    public void fly() throws KarlsonIsNotReady {
        if(Propeller.serviceable)
        System.out.print("И "+ get_name()+ " прилетел. ");
        else {
            throw new KarlsonIsNotReady("Пропейлер Карлосона сломан!!!");
        }
    }

    public static class Propeller{
        public Propeller(boolean a){
            serviceable=a;
        }
    public static boolean serviceable;

    }
    public void question(String when, String who){
        System.out.print(get_name()+ " обратился "+ who);
    }
    public void touch(String what){
        System.out.print(get_name()+ " протянул " + what);
    }
}
