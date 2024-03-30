package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.6Zj  reason: invalid class name and case insensitive filesystem */
public class C133636Zj implements MediaPlayer.OnBufferingUpdateListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public C133636Zj(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.A00.A00 = i;
    }
}
