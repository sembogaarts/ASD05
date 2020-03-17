package deskshare.client;

public class ScreenShareInfo {
    public String host;
    public int port;
    public boolean useTLS;
    public String room;
    public int captureWidth;
    public int captureHeight;
    public int scaleWidth;
    public int scaleHeight;
    public boolean quality;
    public double scale;
    public int x;
    public int y;
    public boolean httpTunnel;
    public boolean fullScreen;
    public boolean enableTrayActions;
    public boolean useSVC2;

    public ScreenShareInfo(Boolean fullScreen){
        this.fullScreen = fullScreen;
        if(this.fullScreen){
            setUpFullScreen();
        }else{
            setupCaptureRegion();
        }
    }

    public void setUpFullScreen(){
        System.out.println("Setting up fullscreen");

    }

    public void setupCaptureRegion(){
        System.out.println("Setting up Captureregion");

    }

}
