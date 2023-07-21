package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Traverse {
    public static void main(String[] args) {
        Path newdir = Paths.get("C:\\Users\\Ahmod\\Documents\\nio");
        try
        {
            Path p = Files.createDirectories(newdir);
        }
        catch (IOException e)
        {
            System.err.println(e);
        }

    }
}
