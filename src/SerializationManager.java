import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2020-10-14
 * Time: 12:41
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class SerializationManager {

    public void serializeList(List<BankData2> list, String filePath) {
        try (FileOutputStream fileout = new FileOutputStream(filePath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileout);) {

            objectOut.writeObject(list);
            System.out.printf("Bankuppgifterna sparade i %s\n", filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<BankData2> deSerializeList() {
        List<BankData2> list = new ArrayList<BankData2>();
        try (FileInputStream fileIn = new FileInputStream("bankData.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn);) {

            list = (List<BankData2>) in.readObject();
            System.out.println("Succe");
            return list;
        } catch (IOException e) {
            System.out.println("Något gick fel");
        } catch (ClassNotFoundException e) {
            System.out.println("Okänd klass");
        }
        return list;

    }

}