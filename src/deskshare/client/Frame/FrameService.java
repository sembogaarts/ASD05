package deskshare.client.Frame;

import deskshare.client.ClientListener;
import deskshare.client.ScreenShareInfo;

public class FrameService {
    //adapter

    public void startCaptureFrame(){
        System.out.println("start capture frame in adapter");
        //this bounded context goes beyond our scope
    }

    public void createFrame(ClientListener crl, int number, ScreenShareInfo ssi){
        System.out.println("Create frame in frame service");
        //this bounded context goes beyond our scope

    }
}
