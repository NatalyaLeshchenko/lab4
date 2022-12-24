package interfaces;

 import stuff.Ingredients;
 import stuff.Room;

public interface Cookable{
    public void cook(Ingredients ingredients);

    public interface  Salted {
        void salted(String where);
    }
    public interface  Peppered {
        void peppered();
    }
    public interface  Boiled {
        void boiled();
    }
}