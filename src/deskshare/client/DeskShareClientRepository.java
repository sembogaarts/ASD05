package deskshare.client;

public class DeskShareClientRepository {

    public DeskShareClient create(ScreenShareInfo ssi){
        System.out.println("Creating DeskShareClient from Repository Class");
        return new DeskShareClient(ssi);
    }
}
