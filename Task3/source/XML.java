import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.List;

public class XML<T> {
private List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void Encoding()
    {

        try {
            XMLEncoder t   = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("XML.xml")));
            t.writeObject(list);
            t.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public List<T> Decoding()
    {

        try {
            XMLDecoder y  = new XMLDecoder(new BufferedInputStream(new FileInputStream("XML.xml")));
            List<T>   employees = (List<T>) y.readObject();
            y.close();
            return employees;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        return null;
    }
}
