package testLythuyet;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main2 {
    public static void main(String[] args) {
        int [] a = { 2,3,5,7,11};
        try {
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            for(int i =0;i<a.length;i++){
                dout.writeInt(a[i]);
                dout.close();
            }
        }
        catch (IOException E){
            E.printStackTrace();
        }
    }
}
