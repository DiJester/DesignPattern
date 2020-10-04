package mediator;

import java.util.Date;

class ChatRoom {
    public static void sendMessage(User usr,String msg){
        System.out.println("["+new Date().toString()+"]"+usr.name+":"+msg);
    }
}
