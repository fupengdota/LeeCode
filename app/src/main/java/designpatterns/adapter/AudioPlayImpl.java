package designpatterns.adapter;

public class AudioPlayImpl implements  AudioPlay {

    VideoAdapter videoAdapter = new VideoAdapter();

    @Override
    public void play(String type) {
        if(type.equals("mp3")) {
            System.out.println("播放了mp3");
        } else {
            videoAdapter.play(type);
        }
    }
}
