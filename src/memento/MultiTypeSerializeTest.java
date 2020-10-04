package memento;

import java.io.*;

public class MultiTypeSerializeTest {
    public static void main(String[] args) {
        Person[] p = new Person[10];
        Person02[] p2 = new Person02[10];
        for (int i = 0; i < 10; i++) {
            p[i] = new Person("Lucy" + i, "Wall St." + i, "No." + i);
            p2[i] = new Person02("Mike" + i, "Shannon St." + i, "No." + i);
        }
        String fileName = "D:/MementoTest.txt";
        File f = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.writeObject(p2);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Person p_1[] = new Person[0];
        Person02 p2_1[] = new Person02[0];
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            p_1= (Person[]) ois.readObject();
            p2_1= (Person02[]) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println(p_1[i]);
        }
        for(int i=0;i<10;i++){
            System.out.println(p2_1[i]);
        }
    }
}
