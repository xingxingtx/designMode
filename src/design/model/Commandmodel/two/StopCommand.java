package design.model.Commandmodel.two;

/**
 * Created by wei.peng on 2018/8/1.
 */
public class StopCommand implements Command{
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        this.audioPlayer.stop();
    }
}
