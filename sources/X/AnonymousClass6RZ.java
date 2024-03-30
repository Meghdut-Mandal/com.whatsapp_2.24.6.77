package X;

import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.6RZ  reason: invalid class name */
public abstract class AnonymousClass6RZ {
    public static final Charset A00 = C19430v1.A0D;

    public static String A00(C19700wN r5, AnonymousClass133 r6, String str) {
        byte[] bArr;
        try {
            C1264463z A002 = AnonymousClass132.A00(new JSONArray(str));
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = r6.A02(A002, AnonymousClass6JD.A0V);
            }
            if (bArr != null) {
                return new String(bArr, A00);
            }
            r5.A0E("BusinessDirectoryStorageUtil/decryptStringData", "Failed to decrypt string data", true);
            throw new Exception("Failed to decrypt string data");
        } catch (JSONException e) {
            r5.A0E("BusinessDirectoryStorageUtil/decryptSearchLocation", e.getMessage(), true);
            throw e;
        }
    }

    public static String A01(C19700wN r3, AnonymousClass133 r4, String str) {
        String A002;
        C1264463z A01 = r4.A01(AnonymousClass6JD.A0V, str.getBytes(A00));
        if (A01 != null && (A002 = A01.A00()) != null && str.equals(A00(r3, r4, A002))) {
            return A002;
        }
        r3.A0E("BusinessDirectoryStorageUtil/encryptStringData", "Failed to encrypt string data", true);
        throw new Exception("Failed to encrypt string data");
    }
}
