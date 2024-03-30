package X;

import android.media.audiofx.Visualizer;

/* renamed from: X.6Zo  reason: invalid class name and case insensitive filesystem */
public class C133676Zo implements Visualizer.OnDataCaptureListener {
    public final /* synthetic */ C148826zU A00;

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }

    public C133676Zo(C148826zU r1) {
        this.A00 = r1;
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        C148826zU r1 = this.A00;
        int i2 = C148826zU.A12;
        AnonymousClass7gO r0 = r1.A0H;
        if (r0 != null) {
            r0.Bkd(bArr);
        }
    }
}
