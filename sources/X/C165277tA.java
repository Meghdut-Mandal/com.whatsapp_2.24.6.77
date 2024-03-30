package X;

import android.media.MediaPlayer;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7tA  reason: invalid class name and case insensitive filesystem */
public class C165277tA implements MediaPlayer.OnPreparedListener {
    public Object A00;
    public final int A01;

    public C165277tA(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        switch (this.A01) {
            case 0:
                C90514aH.A1N(this.A00);
                return;
            case 1:
                MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
                messageGifVideoPlayer.A09 = true;
                MessageGifVideoPlayer.A01(messageGifVideoPlayer);
                return;
            case 2:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
                videoSurfaceView.A01 = 2;
                videoSurfaceView.A0F = true;
                videoSurfaceView.A0E = true;
                videoSurfaceView.A0D = true;
                MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0A;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(videoSurfaceView.A0B);
                }
                videoSurfaceView.A07 = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                videoSurfaceView.A06 = videoHeight;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("videoview/onPrepare: ");
                A0u.append(videoSurfaceView.A07);
                C36321k7.A1T("x", A0u, videoHeight);
                int i = videoSurfaceView.A02;
                if (i >= 0) {
                    videoSurfaceView.seekTo(i);
                }
                if (!(videoSurfaceView.A07 == 0 || videoSurfaceView.A06 == 0)) {
                    videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A07, videoSurfaceView.A06);
                    if (!(videoSurfaceView.A04 == videoSurfaceView.A07 && videoSurfaceView.A03 == videoSurfaceView.A06)) {
                        return;
                    }
                }
                if (videoSurfaceView.A05 == 3) {
                    videoSurfaceView.start();
                    return;
                }
                return;
            default:
                AnonymousClass5NH r2 = (AnonymousClass5NH) this.A00;
                r2.A00 = 2;
                if (r2.A0G) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                }
                if (r2.A0F) {
                    mediaPlayer.setLooping(true);
                }
                r2.A0E = true;
                r2.A0D = true;
                r2.A0C = true;
                int i2 = r2.A02;
                if (i2 >= 0) {
                    r2.seekTo(i2);
                }
                if (r2.A03 == 3) {
                    r2.start();
                }
                MediaPlayer.OnPreparedListener onPreparedListener2 = r2.A08;
                if (onPreparedListener2 != null) {
                    onPreparedListener2.onPrepared(mediaPlayer);
                    return;
                }
                return;
        }
    }
}
