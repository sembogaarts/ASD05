package deskshare.client;

public class DeskShareClientRestService {
    public DeskShareClientService dcs = new DeskShareClientService();


    public void shareFullScreen(){
        System.out.println("Rest service received call, Sharing full screen!");
        dcs.shareFullScreen();
    }

    public void shareDesktop(){
        System.out.println("Rest service received call, Sharing desktop!");
        dcs.shareDesktop();
    }
}
