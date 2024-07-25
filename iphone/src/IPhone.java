

import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.Phone;

class IPhone implements MusicPlayer, Phone, InternetBrowser{
    @Override
    public void playMusic(){
        System.out.println("Playing music 🗣️ 🎙️ 🎶");
    }

    @Override
    public void makeCall() {
        System.out.println("Making a call ☎️ 🎶");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing the internet 🌐");
        
    }
}
