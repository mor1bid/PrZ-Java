import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.print("Здравствуй! ");
        while (true) 
        {
            System.out.print("Выбери номер самого желаемого приза: \n(1) \n(2) \n(3) \n(4) \n(5) \n(6) \n(7) \n(d) Сделать игрушку \n(q) Пойти поиграть с друзьями\n\n:");
            String choose = work.nextLine();
            if (choose.equals("q")) 
            {
                System.out.println("Пока-пока!");
                System.exit(1);
            }
            else 
            {
                int number = Integer.parseInt(choose);
                try {
                    if (number>=1 && number <= 7) 
                    {
                        new Toyfab(number);
                    }
                    else 
                    {
                        System.out.println("Это не подходящий номер! Попробуй ещё раз!");
                    }
                } catch (Exception e) {
                     System.out.println("Это не подходящий номер! Попробуй ещё раз!");
                }
            }
        }
        // work.close();
    }   
}
