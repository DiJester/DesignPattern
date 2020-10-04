package adapter;

import java.io.*;

public class IOAdapterTest {
    public static void main(String [] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("D:/X-Plane Installer Log.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //PrintWriter pw = new PrintWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        for(int i = 0;i<10;i++)
        {
            bw.write("\"Hello World!\""+i+"\n");
        }
        bw.close();


        FileInputStream fis = new FileInputStream("C:/Users/liudi/Desktop/X-Plane Installer Log.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while(line!=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
