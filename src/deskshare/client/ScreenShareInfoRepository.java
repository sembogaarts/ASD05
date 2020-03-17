package deskshare.client;

public class ScreenShareInfoRepository {



    public ScreenShareInfo create(){
        System.out.println("Creating ScreenShareInfo from Repository Class");
        ScreenShareInfo ssi = new ScreenShareInfo(true);
        return ssi;
    }
}
