package X;

import android.hardware.Camera;

/* renamed from: X.3WL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WL implements Camera.PreviewCallback {
    public final /* synthetic */ C37461mP A00;

    public /* synthetic */ AnonymousClass3WL(C37461mP r1) {
        this.A00 = r1;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        C37461mP r2 = this.A00;
        r2.A05.post(C80313vC.A00(r2, bArr, 11));
    }
}
