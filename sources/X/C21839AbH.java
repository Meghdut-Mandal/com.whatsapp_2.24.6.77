package X;

import android.media.AudioTrack;
import com.facebook.android.exoplayer2.audio.DefaultAudioSink;

/* renamed from: X.AbH  reason: case insensitive filesystem */
public class C21839AbH extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ DefaultAudioSink A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21839AbH(AudioTrack audioTrack, DefaultAudioSink defaultAudioSink) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.A01 = defaultAudioSink;
        this.A00 = audioTrack;
    }

    public void run() {
        try {
            AudioTrack audioTrack = this.A00;
            audioTrack.flush();
            audioTrack.release();
            DefaultAudioSink.A0h.decrementAndGet();
        } finally {
            this.A01.A0d.A01();
        }
    }
}
