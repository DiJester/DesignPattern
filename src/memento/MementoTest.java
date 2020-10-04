package memento;

import java.io.*;

public class MementoTest {
    public static void save(String fileName,Object[] oArray){
        File f = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(oArray);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Object[] load(String fileName){
        File f = new File(fileName);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        Object[] oArray = new Object[0];
        try {
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            oArray= (Object[]) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            return oArray;
        }
    }
    public static void main(String[] args) {
        Person[] p = new Person[10];
        Person02[] p2 = new Person02[10];
        for(int i=0;i<10;i++){
            p[i] = new Person("Lucy"+i,"Wall St."+i,"No."+i);
            p2[i] = new Person02("Mike"+i,"Shannon St."+i,"No."+i);
        }
        String fileName ="D:/MementoTest.txt";
        save(fileName,p);
        Person[] p_1 ;
        p_1= (Person[]) load(fileName);

        for(int i=0;i<10;i++){
            System.out.println(p_1[i]);
        }
        save(fileName,p2);
        Person02[] p2_1 ;
        p2_1= (Person02[]) load(fileName);

        for(int i=0;i<10;i++){
            System.out.println(p2_1[i]);
        }

    }
}
