package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7qU  reason: invalid class name and case insensitive filesystem */
public class C163617qU implements MediaPlayer.OnVideoSizeChangedListener {
    public Object A00;
    public final int A01;

    public C163617qU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.A01 != 0) {
            AnonymousClass5NH r6 = (AnonymousClass5NH) this.A00;
            r6.A05 = i;
            r6.A04 = i2;
            if (!(i == 0 || i2 == 0)) {
                int width = r6.getWidth();
                int height = r6.getHeight();
                int i3 = r6.A05;
                int i4 = i3 * height;
                int i5 = r6.A04;
                int i6 = i5 * width;
                if (i4 > i6) {
                    height = i6 / i3;
                } else {
                    width = i4 / i5;
                }
                int width2 = r6.getWidth();
                r6.setTop((r6.getHeight() - height) / 2);
                r6.setBottom(r6.getTop() + height);
                r6.setLeft((width2 - width) / 2);
                r6.setRight(r6.getLeft() + width);
            }
            r6.requestLayout();
            return;
        }
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.A00;
        videoSurfaceView.A07 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A06 = videoHeight;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("videoview/onVideoSizeChanged: ");
        A0u.append(videoSurfaceView.A07);
        C36321k7.A1T("x", A0u, videoHeight);
        if (videoSurfaceView.A07 != 0 && videoSurfaceView.A06 != 0) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A07, videoSurfaceView.A06);
            videoSurfaceView.requestLayout();
        }
    }
}
