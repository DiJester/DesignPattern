package command;

 abstract class Command {
     Boolean done;
     Content src;
     public Command(Content src){
         this.src = src;
         done = false;
     }
     public abstract boolean exec();
     public abstract boolean undo();
}
