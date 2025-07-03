// Client
class Main {
    MediaPlayer player = new MediaAdapter();

    public void play(String audioType, String fileName) {
        player.play(audioType, fileName);
    }
}
