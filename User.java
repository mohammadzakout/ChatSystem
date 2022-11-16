public class User {
    
ChatController chat ;

String name ; 

public User(String name ){
    this.name = name ; 
    chat =  ChatController.getInstance();

}


public void onGetMessage(String message){

System.out.println("user "+this.name + "get a new message :" + message);

}

public void sendMessage(String message , int channalId){

chat.sendMessage(message, channalId);
    
    }

}
