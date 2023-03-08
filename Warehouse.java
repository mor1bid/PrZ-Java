import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class Warehouse {
    int count;
    public void housedel(int nmbr, int tcount) throws IOException
    {
        String check = Integer.toString(nmbr) + ".";
        BufferedReader bread = new BufferedReader(new FileReader("Warehouse.txt"));
        
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
    // public static void main(String[] args) {
        
    // }
}
