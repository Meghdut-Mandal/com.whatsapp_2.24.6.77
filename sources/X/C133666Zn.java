package X;

import android.media.MediaRecorder;

/* renamed from: X.6Zn  reason: invalid class name and case insensitive filesystem */
public class C133666Zn implements MediaRecorder.OnInfoListener {
    public final /* synthetic */ C140246lH A00;

    public C133666Zn(C140246lH r1) {
        this.A00 = r1;
    }

    public void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        this.A00.A03.Baa(mediaRecorder, i, i2, false);
    }
}
