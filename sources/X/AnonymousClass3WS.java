package X;

import android.media.MediaPlayer;

/* renamed from: X.3WS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WS implements MediaPlayer.OnCompletionListener {
    public static final /* synthetic */ AnonymousClass3WS A00 = new AnonymousClass3WS();

    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.release();
    }
}
