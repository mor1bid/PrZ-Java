import java.util.*;

public class Toyfab 
{
    int count = 1;
    public int[] vals = {75, 25, 50, 42, 65, 90, 10, 50};
    public Map<Integer, String> toys;
    int key;
    public Toyfab(int nmbr) 
    {
        this.toys = new HashMap<Integer, String>();
        Random rnd = new Random();
        int vlsize = vals.length;
        toys.put(1, "Кукла Барби");
        toys.put(2, "Боевой робот");
        toys.put(3, "Плюшевый мишка");
        toys.put(4, "Конструктор LEGO");
        toys.put(5, "Вкусная конфета");
        toys.put(6, "Йо-Йо");
        toys.put(7, "Машинка");
        for (int i = 0; i<vlsize; i++) 
        {
            if (vals[i]>vals[nmbr]) 
            {
                int rng = rnd.nextInt(2 - 0) + 0;
                if (rng != 0)
                {
                    this.key = i;
                }
            }
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