package org.example;

import java.io.*;

public class Serialization implements Serializable{

    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public static void main(String[] args) throws IOException {

        Serialization se = new Serialization();
        se.setHeight(50);
        se.setWidth(20);

        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(se);
            os.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
