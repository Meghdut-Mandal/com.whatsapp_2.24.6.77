package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.6vp  reason: invalid class name and case insensitive filesystem */
public final class C146576vp implements C160117kU {
    public final C1508376y A00;
    public final C146606vs A01;

    public C146576vp(C20050ww r14, C19970wo r15, AnonymousClass1BV r16, C123325wJ r17, AnonymousClass6Fk r18, C159537jW r19, AnonymousClass1BS r20) {
        AnonymousClass1BV r6 = r16;
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass6Fk r7 = r18;
        AnonymousClass00C.A0D(r7, 7);
        C123325wJ r5 = r17;
        C146606vs r1 = new C146606vs(r5.A00, r5.A01, r5.A03, r5.A04);
        this.A01 = r1;
        this.A00 = new C1508376y(r14, r15, r6, r7, new C122625vA(r1, r5.A02, (String) null, false), r19, r20, (AnonymousClass64M) null, false);
    }

    public void B2V() {
        this.A00.B2V();
    }

    public C117395mC B5u() {
        String A0q;
        C117395mC B5u = this.A00.B5u();
        C133136Wx r4 = B5u.A00;
        if (r4.A03()) {
            C146606vs r0 = this.A01;
            String str = r0.A00;
            MessageDigest messageDigest = r0.A01;
            if (messageDigest == null) {
                A0q = AnonymousClass000.A0p("MMS download failed in verifyFileSha256 with Exception; plainFileHash=", str, AnonymousClass000.A0u());
            } else if (!Arrays.equals(messageDigest.digest(), Base64.decode(str, 0))) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("MMS download failed during media decryption due to plaintext hash mismatch; mediaHash=");
                A0u.append(str);
                A0u.append("; calculatedHash=");
                A0q = AnonymousClass000.A0q(C36441kJ.A13(messageDigest.digest()), A0u);
            }
            Log.w(A0q);
            Log.e("encrypteddownloadtransfer/download/hash verification fail");
            return new C117395mC(new C133136Wx(7, r4.A03, r4.A05));
        }
        return B5u;
    }

    public void cancel() {
        this.A00.cancel();
    }
}
