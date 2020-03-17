package deskshare.client;

import deskshare.client.CaputureRegionListener.CaptureRegionListenerService;
import deskshare.client.Frame.FrameService;

public class TranslationService {
    public FrameService fs = new FrameService();
    public CaptureRegionListenerService crls = new CaptureRegionListenerService();

    public void createCaptureRegion(ScreenRegionSharer srs){
        System.out.println("Creating capture region in translation service ");
        crls.createCaptureRegionListener(srs);
    }

    public void createCaptureRegionFrame(ClientListener crl, int number, ScreenShareInfo ssi){
        System.out.println("Creating capture region frame in translation service ");
        fs.createFrame(crl, number, ssi);
    }

    public void startCaptureFrame(Boolean bool){
        System.out.println("Creating capture frame in translation service");
        if(bool){
            fs.startCaptureFrame();
        }
    }

}
