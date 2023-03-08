import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.FileWriter;

public class Warehouse {
    int count;
    public Warehouse(int nmbr) throws IOException
    {
        String check = Integer.toString(nmbr) + ".";
        FileWriter wh = new FileWriter("Warehouse.txt", false);
        for (String line : Files.readAllLines(Paths.get("Warehouse.txt"), StandardCharsets.UTF_8)) 
        {
            if (line.contains(check)) 
            {
                wh.write(line.replace(check, check));
            }
            else 
            {
                wh.write(check);
            }
        }
    }
}
