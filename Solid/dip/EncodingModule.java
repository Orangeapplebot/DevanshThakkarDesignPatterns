package solid.live.dip;


import net.iharder.Base64;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {

    Reader reader;
    Writer<T> writer;
    T writeLocation;
    String readPath, writePath;

    public EncodingModule(Reader reader, Writer<T> writer, String readPath, String writePath, T writeLocation) {
        this.reader = reader;
        this.writer = writer;
        this.readPath = readPath;
        this.writePath = writePath;
        this.writeLocation = writeLocation;
    }
    public void encode() {
        try {
            String data = reader.read(readPath);
            String encodedData = Base64.encodeBytes(data.getBytes());
            writer.write(writeLocation, encodedData);
            writer.flush();
            writer.close();
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }