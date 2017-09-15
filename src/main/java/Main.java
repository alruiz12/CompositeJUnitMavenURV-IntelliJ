/**
 * Created by alvaro on 18/07/17.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize 7 files
    	File f1 = new File("f1", 1234);
        File f2 = new File("f2", 3445);
        File f3 = new File("f3", 6688);
        File f4 = new File("f4", 99999);
        File f5 = new File("f5",1000);
        File f6 = new File("f6", 1024);
        File f7 = new File("f7", 512);
        
        // Initialize 6 directories
        Directory root = new Directory("root");
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");
        Directory dir3 = new Directory("dir3");
        Directory dir4 = new Directory("dir4");
        Directory dir5 = new Directory("dir5");


        // Compose
        root.add(dir1);
        root.add(dir2);
        root.add(dir3);
        root.add(dir4);

        dir1.add(f1);

        dir2.add(f2);
        dir2.add(f3);

        dir3.add(f4);
        dir3.add(f5);
        dir3.add(f6);

        dir4.add(dir5);
        dir5.add(f7);

        System.out.println(root.getInfo());

        root.remove(dir4);
        System.out.println(root.getInfo() );
        System.out.println(root.size());
        return ;
    }
    
    


}
