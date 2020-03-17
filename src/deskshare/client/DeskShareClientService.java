package deskshare.client;

public class DeskShareClientService {
    private ScreenShareInfo ssi;
    private ClientListener listener;
    private TranslationService ts = new TranslationService();
    private DeskShareClient dsc;


    public void shareFullScreen(){
        System.out.println("Code reached application layer");
        ScreenRegionSharerRepository srsr = new ScreenRegionSharerRepository();
        ScreenRegionSharer srs = srsr.create(ssi);
        srs.addClientListener(listener);
        ts.createCaptureRegion(srs);
        ts.createCaptureRegionFrame(listener, 5, ssi);
        ts.startCaptureFrame(Boolean.TRUE);
    }

    public void shareDesktop(){
        System.out.println("Code reached application layer");
        ScreenShareInfoRepository ssir = new ScreenShareInfoRepository();
        ssi = ssir.create();
        DeskShareClientRepository dcr = new DeskShareClientRepository();
        dsc = dcr.create(ssi);





    }

}
