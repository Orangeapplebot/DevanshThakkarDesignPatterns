package solid.live.dip;

public class DatabaseWriter implements Writer<MyDatabase>{

    @Override
    public void write(MyDatabase database, String data) {
        database.write(data);
    }

    @Override
    public void flush() {}

    @Override
    public void close() {}
}
