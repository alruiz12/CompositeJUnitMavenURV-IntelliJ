import java.util.ArrayList;
import java.util.List;

/**
 * Created by alvaro on 18/07/17.
 */
public class Directory implements Composite {
    private List<Composite> subDirs = new ArrayList<Composite>();
    private String name;
    private String nameList="";

    public Directory(String receivedName) {
        name=receivedName;
    }


    public String getInfo() {
        nameList=name+": (";
        for (Composite composite : subDirs){
            nameList= nameList+ " " + composite.getInfo();
        }
        nameList=nameList+" )";
        return nameList;
    }

    public void add(Composite composite){
        subDirs.add(composite);
    }

    public void remove(Composite composite){
        subDirs.remove(composite);
    }
    
    public int size() {
		int result = 0;
		for (Composite child:subDirs)
			result = result + child.size();
		return result;
}
}
