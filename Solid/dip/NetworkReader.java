package solid.live.dip;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements Reader{

    InputStreamReader reader;
    @Override
    public String read(String path) {
        URL url = null;
        try {
            url = new URL("http", path, "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        reader = new InputStreamReader(in);
        StringBuilder outPutString1 = new StringBuilder();
        String outputString = outPutString1.toString();
        return outputString;
    }

    @Override
    public void close() {
        reader.close();
    }
}
