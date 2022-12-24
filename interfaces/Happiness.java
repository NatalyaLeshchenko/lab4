package interfaces;

public interface Happiness {
    public interface Smile {
        void smile(String when);
    }

    public interface Satisfied {
        void satisfied(String what);
    }
    public interface Laughing {
        void laughing();}
    public interface Shine {
        void shine(String who, String name, String why);}
    public void be_happy(String how, String why);
}

