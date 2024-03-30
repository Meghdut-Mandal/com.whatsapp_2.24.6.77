package X;

import android.media.MediaPlayer;

/* renamed from: X.3WT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WT implements MediaPlayer.OnErrorListener {
    public static final /* synthetic */ AnonymousClass3WT A00 = new AnonymousClass3WT();

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaViewFragment/prepareAudioPlayback/error: what:");
        A0u.append(i);
        C36321k7.A1S("  extra:", A0u, i2);
        return false;
    }
}
