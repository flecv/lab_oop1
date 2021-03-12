public class Removable extends Storage{
    public Removable(String path, String data){
        super(path, data);
    }
    @Override
    public void getType() {
        System.out.println("This is removable storage");
    }
}
