package X;

import android.media.MediaRecorder;

/* renamed from: X.6Zm  reason: invalid class name and case insensitive filesystem */
public class C133656Zm implements MediaRecorder.OnErrorListener {
    public final /* synthetic */ C140246lH A00;

    public C133656Zm(C140246lH r1) {
        this.A00 = r1;
    }

    public void onError(MediaRecorder mediaRecorder, int i, int i2) {
        this.A00.A03.Baa(mediaRecorder, i, i2, true);
    }
}
