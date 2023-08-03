package solid.live.dip;

public interface Writer<T> {

    void write(T location, String data);
    void flush();
    void close();
}
