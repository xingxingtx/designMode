package design.model.Commandmodel.two;

/**
 * Created by Administrator on 2018/8/1.
 */
public class PlayCommand implements Command{
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }
}
