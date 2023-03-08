import java.util.*;

public class Toyfab 
{
    int count;
    public int[] vals = {75, 25, 50, 42, 65, 90, 10, 50};
    public Map<Integer, String> toys;
    int key = 1;
    public Toyfab(int nmbr) 
    {
        this.toys = new HashMap<Integer, String>();
        Random rnd = new Random();
        int vlsize = vals.length;
        toys.put(1, "Игрушка-1");
        toys.put(2, "Игрушка-2");
        toys.put(3, "Игрушка-3");
        toys.put(4, "Игрушка-4");
        toys.put(5, "Игрушка-5");
        toys.put(6, "Игрушка-6");
        toys.put(7, "Игрушка-7");
        for (int i = 0; i<vlsize; i++) 
        {
            this.key = rnd.nextInt(vlsize - 0) + 0;
        }
        if (nmbr == key) 
        {
            System.out.println("Поздравляю! Ты получил " + toys.get(nmbr) + "!"); 
        }
        else if (key == 0) 
        {
            System.out.println("Ты ничего не получил! Так бывает! Попробуй ещё раз!");
        }
        else 
        {
            System.out.println("Извини! Ты получил " + toys.get(key) + "!");
        }
    }
    
}