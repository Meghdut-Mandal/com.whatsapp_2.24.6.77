package X;

import android.util.Base64;

/* renamed from: X.1VT  reason: invalid class name */
public class AnonymousClass1VT {
    public final C19420v0 A00;

    public void A00(byte[] bArr) {
        if (bArr.length <= 256) {
            C19420v0 r1 = this.A00;
            C19420v0.A00(r1).putString("routing_info", Base64.encodeToString(bArr, 3)).apply();
            return;
        }
        throw new IllegalArgumentException("The routing info should be smaller than 256 bytes.");
    }

    public AnonymousClass1VT(C19420v0 r1) {
        this.A00 = r1;
    }
}
