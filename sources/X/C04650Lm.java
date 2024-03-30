package X;

import com.google.android.gms.common.api.Status;

/* renamed from: X.0Lm  reason: invalid class name and case insensitive filesystem */
public final class C04650Lm extends C04660Ln {
    public final AnonymousClass0JZ A00;
    public final /* synthetic */ C03960Iq A01;

    public C04650Lm(C03960Iq r1, AnonymousClass0JZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void ByX(byte[] bArr) {
        this.A01.A00.setResult(bArr);
    }

    public final void Byj(Status status) {
        this.A00.A00.setException(new AnonymousClass0JD(status));
    }
}
