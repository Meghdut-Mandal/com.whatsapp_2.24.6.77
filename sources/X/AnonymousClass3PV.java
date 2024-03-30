package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3PV  reason: invalid class name */
public class AnonymousClass3PV {
    public final long A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;
    public final byte[] A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass3PV)) {
            return false;
        }
        AnonymousClass3PV r7 = (AnonymousClass3PV) obj;
        return Arrays.equals(this.A04, r7.A04) && Arrays.equals(this.A03, r7.A03) && C1901797e.A00(this.A02, r7.A02) && C1901797e.A00(this.A01, r7.A01) && this.A00 == r7.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        return AnonymousClass000.A0M(Long.valueOf(this.A00), objArr, 4);
    }

    public static AnonymousClass3PV A00(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            byte[] decode = Base64.decode(A1C.getString("wrappedCompanionEphemeralPubBase64"), 2);
            byte[] decode2 = Base64.decode(A1C.getString("companionServerAuthKeyPubBase64"), 2);
            String string = A1C.getString("linkCodePairingRef");
            if (A1C.opt("companionPlatformId") != null) {
                str2 = A1C.getString("companionPlatformId");
            } else {
                str2 = null;
            }
            return new AnonymousClass3PV(string, str2, decode, decode2, A1C.getLong("expirationTsMs"));
        } catch (IllegalArgumentException | JSONException e) {
            Log.e("CompanionHelloInfoManager/fromJsonString error", e);
            return null;
        }
    }

    public AnonymousClass3PV(String str, String str2, byte[] bArr, byte[] bArr2, long j) {
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
