package X;

import android.media.MediaPlayer;
import android.view.View;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.7qB  reason: invalid class name and case insensitive filesystem */
public class C163427qB implements MediaPlayer.OnCompletionListener {
    public Object A00;
    public final int A01;

    public C163427qB(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer.OnCompletionListener onCompletionListener;
        MediaPlayer mediaPlayer2;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((View) obj).setVisibility(0);
                return;
            case 3:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                videoSurfaceView.A01 = 5;
                videoSurfaceView.A05 = 5;
                onCompletionListener = videoSurfaceView.A08;
                if (onCompletionListener != null) {
                    mediaPlayer2 = videoSurfaceView.A0B;
                    break;
                } else {
                    return;
                }
            case 4:
                AnonymousClass5NH r2 = (AnonymousClass5NH) obj;
                r2.A00 = 5;
                r2.A03 = 5;
                onCompletionListener = r2.A06;
                if (onCompletionListener != null) {
                    mediaPlayer2 = r2.A09;
                    break;
                } else {
                    return;
                }
            default:
                C65083Qq r22 = (C65083Qq) obj;
                AnonymousClass4SL r0 = r22.A05;
                if (r0 != null) {
                    r0.BU7(r22);
                    return;
                }
                return;
        }
        onCompletionListener.onCompletion(mediaPlayer2);
    }
}
