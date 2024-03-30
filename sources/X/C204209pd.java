package X;

import android.hardware.Camera;
import java.util.Objects;

/* renamed from: X.9pd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C204209pd implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass61X A00;
    public final /* synthetic */ A29 A01;
    public final /* synthetic */ C198749e8 A02;
    public final /* synthetic */ C195499Un A03;

    public /* synthetic */ C204209pd(AnonymousClass61X r1, A29 a29, C198749e8 r3, C195499Un r4) {
        this.A01 = a29;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        A29 a29 = this.A01;
        C195499Un r5 = this.A03;
        C198749e8 r4 = this.A02;
        AnonymousClass61X r1 = this.A00;
        r5.A01(C199609fb.A0b, bArr);
        B4X b4x = a29.A08;
        Objects.requireNonNull(b4x);
        A29.A03(r1, a29, b4x, r4, r5, (C199609fb) null);
        C165587tf.A1R(a29.A0M.A00);
    }
}
