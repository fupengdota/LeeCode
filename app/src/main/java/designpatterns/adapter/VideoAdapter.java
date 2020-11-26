package designpatterns.adapter;

public class VideoAdapter implements AudioPlay {
    VideoPaly videoPaly = new VideoPlayImpl();

    @Override
    public void play(String type) {
        if (type.equals("vcl")) {
            videoPaly.vlcPlay();
        } else if (type.equals("mp4")) {
            videoPaly.mp4Play();
        }
    }
}
