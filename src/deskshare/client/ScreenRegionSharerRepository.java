package deskshare.client;

public class ScreenRegionSharerRepository {

    public ScreenRegionSharer create(ScreenShareInfo ssi){
        System.out.println("Creating ScreenRegionSharer from Repository Class");
        ScreenRegionSharer srs = new ScreenRegionSharer(ssi);
        return srs;
    }
}
