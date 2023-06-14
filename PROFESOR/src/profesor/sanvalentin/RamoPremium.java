package profesor.sanvalentin;

public class RamoPremium extends Ramo{

    private Video video;
    public RamoPremium(Video video, Flor... flores) {
        super(flores);
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }
}
