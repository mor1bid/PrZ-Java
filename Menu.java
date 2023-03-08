import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.print("Здравствуй! ");
        while (true) 
        {
            System.out.print("Выбери номер своего самого желаемого приза: \n(1) Кукла Барби \n(2) Боевой робот \n(3) Плюшевый мишка \n(4) Конструктор LEGO \n(5) Вкусная конфета \n(6) Йо-Йо \n(7) Машинка \n \n(d) Настроить игру \n(q) Пойти поиграть с друзьями\n\n:");
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
