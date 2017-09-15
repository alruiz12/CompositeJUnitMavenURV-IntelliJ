/**
 * Created by alvaro on 18/07/17.
 */
public class File implements Composite{
    private String name="";
    private int size;
    
    public File(String receivedName,int receivedSize){
        name=receivedName;
        size=receivedSize;
    }


    public String getInfo() {
        return name;
    }

    
    public int size() {
		return size;
}

}
