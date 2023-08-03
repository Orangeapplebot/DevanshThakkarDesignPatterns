package solid.live.dip;


public class FilesWriter implements Writer<String>{

    BufferedWriter writer;
    @Override
    public void write(String path, String data) {
        BufferedWriter writer = new BufferedWriter(new FilesWriter(path));
        writer.write(data);
    }

    @Override
    public void flush() {
        writer.flush();
    }

    @Override
    public void close() {
        writer.flush();
    }
}

