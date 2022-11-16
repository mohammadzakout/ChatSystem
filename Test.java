public class Test {
    
    public static void main(String[] args) {
        
User u = new User("mohammad zakout");
User u1 = new User("ahmmad ");
User u2 = new User("mahmoud ");
User u3 = new User("hassan ");
User u4 = new User("khalid ");
User u5 = new User("omar ");
User u6 = new User("said ");
User u7 = new User("ali ");


NotiticationChannel ch1 = new NotiticationChannel(1);
ch1.addListener(u);
ch1.addListener(u1);
ch1.addListener(u2);
ch1.addListener(u3);
ch1.addListener(u4);



NotiticationChannel ch2 = new NotiticationChannel(2);

ch2.addListener(u5);
ch2.addListener(u6);
ch2.addListener(u7);



ChatController c =  ChatController.getInstance();
c.addChanel(ch1);
c.addChanel(ch2);



u.sendMessage("hello " , 2);

    }
}
