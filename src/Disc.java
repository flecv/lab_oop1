public class Disc extends Removable{
    public Disc(String path, String data) {
        super(path, data);
    }

    @Override
    public final void getType() {
        super.getType();
        System.out.println(": disc");
    }
}
