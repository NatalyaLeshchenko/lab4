package interfaces;

public interface Sayable {
    public interface Goodbye {
        void say_goodbye(String how);
    }

    public interface Question {
        void question(String when, String who);
    }
    public interface Stop_taking {
        void Stop_talking(String when,String why);
    }
    public interface Told{
        void told(String about);
    }
    public interface Whisper{
        void whisper(String what);
    }
}


