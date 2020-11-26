package designpatterns.adapter;

public class VideoPlayImpl implements VideoPaly {
    @Override
    public void vlcPlay() {
        System.out.println("vlc 播放");
    }

    @Override
    public void mp4Play() {
        System.out.println("mp4 播放");
    }
}
