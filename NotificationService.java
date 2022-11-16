import java.util.ArrayList;
import java.util.List;

abstract class Notification{

private int id ; 

public Notification(int id){
    this.id = id ; 
}

public int getId(){
    return this.id ;
}
public abstract void addListener(User user);
public abstract void removeListener(User user);
public abstract void notifiyListener(String message);


}



class NotiticationChannel extends Notification{


 private List<User> users ; 


public NotiticationChannel(int id){
    super(id); 
    this.users = new ArrayList<User>();
    
}


    @Override
    public void addListener(User user) {
        users.add(user);
   
        
    }

    @Override
    public void removeListener(User user) {
       users.remove(user);
        
    }

    @Override
    public void notifiyListener(String message) {
     users.forEach(u -> u.onGetMessage(message));
        
    }

}