public class Local extends Storage{
    public enum UserType {
        User,
        Admin;
    }
    private UserType userType;

    public Local(String path, String data, UserType userType) {
        super(path, data);
        this.userType = userType;
    }

    @Override
    public final void getType() {
        System.out.println("\nThis is local storage");
    }

    public final void getUser(UserType userType){
        switch (userType) {

            case User:
                System.out.println("Owner of this local storage is user");
            case Admin:
                System.out.println("Owner of this local storage is admin");
        }
    }
}
