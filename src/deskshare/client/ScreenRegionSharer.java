package deskshare.client;

public class ScreenRegionSharer {
    public static final String NAME = "SCREENREGIONSHARER: ";
    private final ScreenShareInfo ssi;
    private ClientListener listener;

    public ScreenRegionSharer(ScreenShareInfo ssi) {
        this.ssi = ssi;
    }


    public void addClientListener(ClientListener lis){
        System.out.println("Adding client listener from ScreenRegionSharer class");
        this.listener = lis;
    }

}
