package X;

import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1UJ  reason: invalid class name */
public final class AnonymousClass1UJ {
    public final C19700wN A00;
    public final AnonymousClass132 A01;
    public final AnonymousClass133 A02;

    public AnonymousClass1UJ(C19700wN r2, AnonymousClass132 r3, AnonymousClass133 r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final String A00(String str) {
        byte[] bArr;
        try {
            C1264463z A002 = AnonymousClass132.A00(new JSONArray(str));
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = this.A02.A02(A002, AnonymousClass6JD.A0V);
            }
            if (bArr != null) {
                Charset charset = C19430v1.A0D;
                AnonymousClass00C.A09(charset);
                return new String(bArr, charset);
            }
            this.A00.A0E("XFamilyEncryptionHelper/decryptFromHash", "Failed to decrypt", true);
            throw new IllegalStateException("Failed to decrypt");
        } catch (JSONException e) {
            this.A00.A0E("XFamilyAccountStore/decryptFromHash", e.getMessage(), true);
            throw new IllegalStateException("Failed to decrypt", e);
        }
    }

    public final String A01(String str) {
        String A002;
        AnonymousClass133 r2 = this.A02;
        Charset charset = C19430v1.A0D;
        AnonymousClass00C.A09(charset);
        byte[] bytes = str.getBytes(charset);
        AnonymousClass00C.A08(bytes);
        C1264463z A012 = r2.A01(AnonymousClass6JD.A0V, bytes);
        if (A012 != null && (A002 = A012.A00()) != null && str.equals(A00(A002))) {
            return A002;
        }
        this.A00.A0E("XFamilyEncryptionHelper/encryptToHash", "Failed to encrypt", true);
        throw new IllegalStateException("Failed to encrypt");
    }
}
