package HomeWork.model;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void report() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'report'");
    }

    public void save() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
   

    
}