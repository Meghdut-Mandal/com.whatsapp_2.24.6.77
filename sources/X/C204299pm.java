package X;

import android.media.MediaDrm;

/* renamed from: X.9pm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204299pm implements MediaDrm.OnEventListener {
    public final /* synthetic */ C191029Bh A00;
    public final /* synthetic */ C201699k8 A01;

    public /* synthetic */ C204299pm(C191029Bh r1, C201699k8 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.A01.A07(this.A00, bArr, i);
    }
}
