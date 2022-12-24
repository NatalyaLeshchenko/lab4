package Human;

import interfaces.*;

public class Freken_Bok extends Human implements Goable.Round, Hugging, Sayable.Told,Goable, Sayable.Question, Lookable, Sayable.Stop_taking, Cookable.Salted, Cookable.Peppered, Cookable.Boiled, Sayable.Goodbye, Goable.Log_off, Appearable, Cookable, Startable, Flinchable, Listenable,  Standable, Tellable, Worryable, Head.Nod, Head.Shake, Goable.Hurry {
    public Freken_Bok(String name) {
        super(name);
    }

    @Override
    public void appear(String where) {
        System.out.print("И в самом деле, " + where + " появилась " + get_name() + ".");
    }

    public void flinch() {
        System.out.print(get_name() + " вздрогнула.");
    }


    public void listen(String who, String what) {
        System.out.print(" Казалось, " + who + "услышала "+ what);
    }

    public void worry(String how, String why){
        System.out.print("А может, " + get_name()+ how + " волновалась, "+ why);
    }
    public void stand(String where){
        System.out.print(" стояла "+ where);
    }
    public void tell(String about){
        System.out.print(" и должна была поведать, "+ about);
    }
    public void start(String what){
        System.out.print(" приготовить "+ what);}
    public void round() {
        System.out.print( "и " + get_name()+ " -- окружили маму. ");

    }
    public void nod(String how, String what){
        System.out.print( get_name() +" "+how + " вскинула "+ what);
    }

    public void cook(stuff.Ingredients ingredients) {
        System.out.print(" из ");

        switch (ingredients) {
          case tomato_paste:
              System.out.print("томатной пасты,");break;
          case onions:
              System.out.print("лука,");break;
          case salt:
              System.out.print("соли,");break;
              case garlic:
                System.out.print( "чеснока,");break;
          case pepper:
              System.out.print("перца.");break;

      }
    }


    public void shake(String what) {
        System.out.print(get_name()+ " покачала"+ what);
    }


    public void hurry(String name) {
        System.out.print("И "+ name+ " заторопилась. ");
    }

    @Override
    public void see(String when, String what) {
        System.out.print(get_name()+ when + " посмотрела " + what);
    }


    public void log_off(String name) {
        System.out.print(name+" ушла. ");
    }


    public void say_goodbye(String how) {
        System.out.print(get_name()+" " + how+ " попрощалась ");
    }
    public void salted(String where) {
        System.out.print(where+ get_name()+ " солила, ");
    }
    public void boiled(){
        System.out.print("и кипятила всласть, ");
    }

    public void peppered() {
        System.out.print("и перчила, ");
    }

    public void Stop_talking(String when, String why) {
        System.out.print(when + get_name()+ " умолкла, " + why);
    }


    public void question(String when, String who) {
        System.out.print(when+ who+  "спросила:");
    }

    public void go(String name) {
        System.out.print(name+ "согласилась прийти ");
    }

    public void told(String about) {
        System.out.print("и рассказать,"+ about);
    }


    public void hug(String what, String time, String why) {
        System.out.print( what + get_name()+ time+ "помахала рукой " );
    }
}

