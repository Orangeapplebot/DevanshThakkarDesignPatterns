package solid.live.dip;

public interface Reader {

    String read(String path);
    void close();
}
