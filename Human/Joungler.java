package Human;

public class Joungler {
    public void actions (String name, String action1, String action2){
        class Print{
            private String plates="тарелок";
            public void Print_plates(){
                System.out.print(name+" на экране "+action1+" в воздух одновременно пять тарелок и потом "+action2+" все пять на лету. ");
            }
        }
        Print print = new Print();
        print.Print_plates();
    }
}
