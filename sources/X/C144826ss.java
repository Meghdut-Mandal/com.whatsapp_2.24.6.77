package X;

import com.whatsapp.util.Log;

/* renamed from: X.6ss  reason: invalid class name and case insensitive filesystem */
public class C144826ss implements AnonymousClass7gR {
    public final C25471Gl A00;

    /* JADX INFO: finally extract failed */
    public C121555tK B5L(byte[] bArr) {
        try {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets start)");
            C121555tK A002 = AnonymousClass6R1.A00(AnonymousClass6R0.A00(bArr, this.A00.A03, 80));
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            return A002;
        } catch (Throwable th) {
            Log.i("MmsImageCipherKeyProvider deriveKeys (HKDFv3.deriveSecrets end)");
            throw th;
        }
    }

    public C144826ss(C25471Gl r1) {
        this.A00 = r1;
    }
}
