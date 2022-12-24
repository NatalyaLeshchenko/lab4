import Human.*;
import interfaces.*;
import stuff.Family;
import stuff.Ingredients;
import stuff.Room;


public class Story {
    public static void main(String[] argv) throws KarlsonIsNotReady {
        Freken_Bok freken_bok= new Freken_Bok("Фрекен Бок");
        Gospodin_Pek gospodin_pek = new Gospodin_Pek("Господин Пек");
        Karlson karlson;
        try {
            karlson = new Karlson("");
        } catch (NameError e ) {
            System.out.println(e.getMessage());
            karlson = new Karlson("Карлсон");
        }

        Malysh malysh = new Malysh("Малыш");
        Malysh.Bimbo bimbo= malysh.new Bimbo("Бимбо");
        if (!freken_bok.equals(gospodin_pek)) {
            Goable.Log_off they = new Goable.Log_off(){
                public void log_off(String name) {
                    System.out.print(name+ "вышли"+ ". ");
                }
            };
            they.log_off("Они ");
            Appearable sky = new Appearable(){
                @Override
                public void appear(String where){
                    System.out.print(where+ "сверкало звездное небо. " );
                }};
            sky.appear("Над ними ");
            malysh.see("Никогда прежде ", "столько звезд");
            System.out.print("да таких ярких, да так близко! ");

            Appearable stars = new Appearable(){
                public void appear(String where){
                    System.out.print("Звёзды "+ where);
                }
            };
            stars.appear("были очень далеко, ");
            malysh.know(" это");
            Appearable marquee = new Appearable(){
                public void appear(String where){
                    System.out.print("О," + where+ " раскинулся звёздный шатер");
                }
            };
            marquee.appear(" над домиком Карлсона");
            System.out.print(", и до него, казалось, рукой подать, и вместе с тем так бесконечно далеко! ");
            System.out.print("А на следующий день... ");
            Bosse bosse = new Bosse("Боссе");
            bosse.returned("Сперва ");
            Betan betan = new Betan("Бетан");
            betan.returned(" и ");
            Dad dad = new Dad("папа");
            dad.returned("потом ");
            Mum mum = new Mum("мама");
            mum.returned("а последней ");
            malysh.throwed("к ней ");
            malysh.embarace("крепко", " ее");
            dad.round();
            bosse.round();
            betan.round();
            malysh.round();
            bimbo.round();
            freken_bok.round();
            freken_bok.shake(" головой. ");
            mum.surprised();
            dad.surprised();
            bosse.surprised();
            betan.surprised();
            freken_bok.nod("гордо", " голову. ");
            freken_bok.hurry("она");
            betan.laughing();
            freken_bok.see(" неодобрительно ","на нее. ");
            freken_bok.say_goodbye("торопливо ");
            freken_bok.log_off(" и ");
            malysh.nod("задумчиво", "головой. ");
            System.out.print("Так все и было. ");
malysh.ring("Когда подошло время передачи,", "Карлсону. ");
malysh.hug("шнурок, спрятанный за занавесками,", "один раз,", "что означало: Прилетай скорее! ");



Karlson.Propeller.serviceable=true;
try {
    karlson.fly();
}
catch (KarlsonIsNotReady e) {
    System.out.println(e.getMessage());
}


            Goable.Gather family = new Goable.Gather() {

                public void gather_together (String name,Room room) {
                    System.out.print(name + "у ");
                    switch (room) {
                        case TV:
                            System.out.print("телевизора,");break;

                    }}


            };
family.gather_together("Вся семья собралась ",Room.TV);
            Standable.Stand table = new Standable.Stand() {

                public void stand_chairs (String name, Room room) {
                    System.out.print(name);
                    switch (room) {
                        case coffee_cup:
                            System.out.print("коффейные чашки,");break;
                        case cake:
                            System.out.print("торт со сливками. ");break;
                        case spoons:
                            System.out.print(" ложки, ");break;

                    }}};

table.stand_chairs(" на столе лежали: ", Room.coffee_cup);
            table.stand_chairs("", Room.spoons);
            table.stand_chairs("", Room.cake);
            karlson.question("", " к Малышу. ");
            karlson.smile("Потом");
            karlson.satisfied(" вид у него ");
            malysh.sit("Малыш и Карлсон", " перед телевизором, ");
            malysh.eat("и ", "торт, ");
malysh.waited("выступления Фрекен Бок. ");
            freken_bok.appear("на экране");
            gospodin_pek.appear(" Рядом с ней");
            gospodin_pek.run_program("программу");
            freken_bok.flinch();
            freken_bok.listen("она ", "слова Карлсона. ");
            freken_bok.worry(" очень", "потому что");
            freken_bok.stand("перед всем шведским народом");
            freken_bok.tell("как");
            freken_bok.start("'Соус Хильдур Бок'");
            freken_bok.cook(Ingredients.tomato_paste);
            freken_bok.cook(Ingredients.salt);
            freken_bok.cook(Ingredients.onions);
            freken_bok.cook(Ingredients.garlic);
            freken_bok.cook(Ingredients.pepper);
            freken_bok.Stop_talking(" Тут ", "потому что ");
            karlson.touch("свою маленькую пухлую ручку");
            karlson.switched_off("телевизор");
            mum.interrupted();
            karlson.pushed(" Малыша ", "в бок. ");
            freken_bok.salted("И у всех на глазах ");
            freken_bok.peppered();
            freken_bok.boiled();
            Prepared sauce = new Prepared(){
                @Override
                public void prepared(String when) {
                    System.out.print(when+ " был готов, ");
                }
            };
            sauce.prepared("а когда соус");

            freken_bok.see(" неодобрительно", "с экрана лукавым взглядом ");
            freken_bok.question("и ","она ");
            gospodin_pek.thanked("Фрекен Бок", "за то, что ");
            freken_bok.go("она ");
            freken_bok.told(" как она готовит этот соус,");

            Finished program = new Finished(){
                @Override
                public void finished(String when, String name) {
                    System.out.print( when+ name+ " явно должна была кончиться, ");
                }
            };
            program.finished(" и на этом ", "передача");
            freken_bok.question("но тут ","она ");
            gospodin_pek.look_sad();
            freken_bok.hug("И тогда ", " на экране ", "");
            freken_bok.question("и ","");
            karlson.eat("Малыш и Карлсон", "еще по куску торта ");
            karlson.see("и ", " как ");
            Joungler joungler = new Joungler();
            joungler.actions("жонглер","кидает","ловит");
            malysh.look_sad();

            Happiness.Shine eyes = new Happiness.Shine(){
                public void shine(String who, String name, String why ){
                    System.out.print(who + name + " так и сияли,"+ why);
                }
            };
            eyes.shine("у Карлсона"," глаза", " поэтому ");
            malysh.satisfied(" тоже");
            malysh.be_happy(" так","что все сидели вместе с ним--");
            malysh.with_family(Family.mum);
            malysh.with_family(Family.dad);
            malysh.with_family(Family.Bosse);
            malysh.with_family(Family.Betan);
            malysh.with_family(Family.Bimbo);
            malysh.with_family(Family.Karlson);

Finished cake = new Finished(){
    public void finished(String when, String name){
        System.out.print( when+ name+ " было покончено, ");
    }
            };
cake.finished("Когда ", "с тортом");
karlson.hug("блюдо, ", ", ","");
karlson.up("потом","вверх, ", "как на экране жонглер тарелки. ");
karlson.up("Он", "", "так высоко, что");
            Broke plate = new Broke(){
                public void broke(String name, String how, String where){
                    System.out.print(name+ how + " не ударилось "+ where );
                }
            };
            plate.broke(" оно ", "едва", " об потолок, и ");
malysh.scary();
mum.see("", " телевизор. ");
            Dancable ballerina = new Dancable(){
                public void dance(String where, String name, String state){
                    System.out.print(where+ state+name );
                }
            };

            ballerina.dance("Там ", "балерина, ", "танцевала ");
Noticed nobody = new Noticed(){
    public void noticed(String name, String what){
                    System.out.print("и "+ name+ " не заметил, "+ what);
                }
            };
nobody.noticed("никто", "что ");
karlson.create();

malysh.whisper("\"Брось, Карлсон, не надо\". ");
            Helped phrase = new Helped(){
                public void helped(String name){
                    System.out.print("Но "+ name+ " не помогало, ");
                }
            };
            phrase.helped("это");
            karlson.continued(" безмятежно ", "блюдо");
            };
            };
            }


