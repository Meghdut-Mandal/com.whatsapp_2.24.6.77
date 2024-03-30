package X;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.5LV  reason: invalid class name */
public final class AnonymousClass5LV extends C132476Tw {
    public C158577hj A00;
    public final MediaPlayer A01;
    public final Handler A02;

    public boolean A0E(C19700wN r7, float f) {
        try {
            MediaPlayer mediaPlayer = this.A01;
            PlaybackParams playbackParams = mediaPlayer.getPlaybackParams();
            playbackParams.allowDefaults();
            if (C90494aF.A01(playbackParams.getSpeed(), f) >= 0.1f) {
                mediaPlayer.setPlaybackParams(playbackParams.setSpeed(f));
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("audioplayer/setPlaybackSpeed failed: currSpeed: ");
            A0u.append(-1.0f);
            A0u.append(" newSpeed: ");
            A0u.append(f);
            C36421kH.A1N(A0u);
            C36321k7.A1Z(A0u, e.toString());
            return false;
        }
    }

    public AnonymousClass5LV(Looper looper, int i) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        this.A02 = new Handler(looper);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A01 = mediaPlayer;
        mediaPlayer.setAudioStreamType(i);
    }
}
