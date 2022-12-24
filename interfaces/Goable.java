package interfaces;

import stuff.Room;

public interface Goable {

    public interface Return{
        void returned(String when);}
        public interface Throw{
            void throwed(String where);}
            public interface  Move{
                void move();
    }
    public interface  Log_off{
        void log_off(String name);
    }
    public interface  Round {
        void round();
    }
    public interface  Hurry {
        void hurry(String name);
    }
    public interface  Gather {
        void gather_together(String name, Room room);
    }
    public void go(String name);
}
