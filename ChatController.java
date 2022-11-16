import java.util.ArrayList;
import java.util.List;




class ChatController {


  private static ChatController chatController ; 

  public static ChatController getInstance(){

if (chatController == null){

    chatController = new ChatController();

  }
  return chatController;
  }

List<Notification> channals;

private ChatController(){
    channals = new ArrayList();
  

}


public void addChanel(NotiticationChannel nc1){

    channals.add(nc1);

}





public void sendMessage(String message , int channalId){


for ( Notification channal : channals) {
    if (channal.getId() == channalId) {
         channal.notifiyListener(message);
         return;
    }
}

}


public void subscribe(int channalId , User user){

    for ( Notification channal : channals) {
        if (channal.getId() == channalId) {
             channal.addListener(user);
             return;
        }
    }


}
public void unSubscribe(int channalId , User user){

    for ( Notification channal : channals) {
        if (channal.getId() == channalId) {
             channal.removeListener(user);
             return;
        }
    }


}





}