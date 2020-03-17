package test;

import deskshare.client.DeskShareClientRestService;

public class main{
    public static void main(String[] args) {
        DeskShareClientRestService dscrs = new DeskShareClientRestService();
        System.out.println("\nSharing Full Screen     |       Sequence Diagram 1\n");
        dscrs.shareFullScreen();
        System.out.println("\n---------------------------------\n\n Sharing Desktop     |       Sequence Diagram 2\n");
        dscrs.shareDesktop();
        }
}
