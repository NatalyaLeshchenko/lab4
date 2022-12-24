package Human;


import interfaces.*;
import stuff.Family;


public class Malysh extends Human  implements Goable.Round, Ringable, Scary, Sayable.Whisper,Happiness,Happiness.Satisfied,Lookable.Look_sad,Hugging, Waited, Eatable, Sit, Head.Nod, Happiness.Smile, Knowable, Goable.Throw, Embarace, Lookable {

    public Malysh(String name) {
        super(name);
    }
   @Override
public void see( String when, String what ){
    System.out.print( when+ get_name()+ " не видел "+ what + ", ");
}


    public void satisfied(String what) {
        System.out.print( get_name()+what +" был счастлив.");
    }
    public void smile(String when) {
        System.out.print(" ");
    }
public void know(String what){
    System.out.print( "и "+ get_name()+ what+ " знал, "+ "и все же... ");
}
public void throwed(String where){
        System.out.print(get_name()+ " кинулся "+ where );
    }

    public void embarace(String how, String whom) {
        System.out.print(" и "+ how + whom+ " обнял"+ ". ");
    }
    public void round() {
        System.out.print( "и " + get_name()+ ", ");

    }


    public void nod(String how, String what) {
        System.out.print(get_name()+ " "+ how+ " кивнул "+ what);
    }
    public void ring(String when, String who) {
        System.out.print( when +" " + get_name()+ " позвонил "+ who);

    }
    public void hug(String what, String time, String why ){
        System.out.print(get_name()+ " дернул "+ what + " "+ time+ " "+ why);
    }




    public void sit(String who, String what) {
        System.out.print( who + " сели"+ what);
    }


    public void eat(String who, String what) {
        System.out.print( who + "ели "+ what);
    }
    public void waited(String what) {
        System.out.print( "ожидая "+ what);
    }
    public void look_sad(){
        System.out.print(get_name()+"у " +"было скучно, но ");
    }


    public void be_happy(String how, String why) {
        System.out.print(" "+ get_name()+ how+ " радовался, "+ why);
    }
public void with_family(Family family){
    System.out.print(" и ");
    switch (family) {
        case mum:
            System.out.print("мама,");break;
        case dad:
            System.out.print("папа,");break;
        case Bosse:
            System.out.print("Боссе,");break;
        case Betan:
            System.out.print( "Бетан,");break;
        case Bimbo:
            System.out.print("Бимбо");break;
        case Karlson:
            System.out.print("даже Карлсон! ");break;

    }
};


    public void whisper(String what) {
        System.out.print(get_name()+ " шептал: "+ what);
    }


    public void scary() {
        System.out.print(get_name()+ " испугался. ");
    }

    public class Bimbo extends Malysh{


        public Bimbo(String name) {
            super(name);
        }
    }
}