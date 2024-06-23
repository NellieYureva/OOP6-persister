package HomeWork.view;

import java.util.Scanner;

import HomeWork.model.User;
import HomeWork.sevise.Persister;

public class UserView {
    
    public static void start(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите имя пользователя: ");  
            String name = scanner.nextLine();
            User user = new User(name);
            Persister persister = new Persister(user);
            persister.report();
            persister.save();;
        }
    }

    

    
}

    
        

      

