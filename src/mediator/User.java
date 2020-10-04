package mediator;

class User {
    String name;
    public User(String name) {
        this.name = name;
    }
    public void sendMessage(String msg){
        ChatRoom.sendMessage(this,msg);
    }
}
