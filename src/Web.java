public class Web extends Storage{
    public Web(String path, String data){
        super(path, data);
    }

    @Override
    public final void getType() {
        System.out.println("\nThis is web storage");
    }

    public final void accessDenied(){
        System.out.println("404 not found");
    }
}
