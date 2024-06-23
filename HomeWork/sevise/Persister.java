package HomeWork.sevise;

import HomeWork.model.User;

public class Persister {

    public User user;
    public Persister(User user){
        this.user = user;
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }    
    
        public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
