package solid.live.dip;

import java.io.BufferedReader;

public class FileReader implements Reader {
    BufferedReader reader;
    @Override
    public String read(String path) {
        reader = new BufferedReader(new FileReader(path));
        return reader.read();
    }

    @Override
    public void close() {
        reader.close();
    }
}
