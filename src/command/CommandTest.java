package command;

public class CommandTest {
    public static void main(String[] args) {
        Content  s = new Content("Hello World");
        Command cmd  =  new InsertCommand(s,6,new Content("You"));
        cmd.exec();
        System.out.println(s);
        cmd.undo();
        System.out.println(s);
        Content  s1 = new Content("Hello World");
        Command cmd1  =  new CopyCommand(s1,1,3,11);
        cmd1.exec();
        System.out.println(s1);
        cmd1.undo();
        System.out.println(s1);
        Content  s2 = new Content("Hello World");
        Command cmd2  =  new DeleteCommand(s2,1,3);
        cmd2.exec();
        System.out.println(s2);
        cmd2.undo();
        System.out.println(s2);
        System.out.println("----------------责任链连续exec和undo命令-----------------");
        CommandChain cmdChain = new CommandChain();
        Content  cnt = new Content("Hello World");
        cmdChain.addCommand(new InsertCommand(cnt,6,new Content("You")))
                .addCommand(new CopyCommand(cnt,1,3,11))
                .addCommand(new DeleteCommand(cnt,1,3))
                .execCommand();
        System.out.println(cnt);
        cmdChain.undoCommand();
        System.out.println(cnt);
    }
}
