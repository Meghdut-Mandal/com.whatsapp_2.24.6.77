package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6SL  reason: invalid class name */
public class AnonymousClass6SL {
    public static final Set A06 = C36421kH.A0g(new String[]{"NONE", "ES256"});
    public String A00;
    public String A01;
    public JSONObject A02;
    public JSONObject A03;
    public final String A04;
    public final String A05;

    public static byte[] A00(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i < length && bArr[i] == 0) {
                i++;
            }
        }
        if (i == length) {
            return new byte[]{0};
        }
        int i2 = length - i;
        if ((bArr[i] & 255) > Byte.MAX_VALUE) {
            byte[] bArr2 = new byte[(i2 + 1)];
            System.arraycopy(bArr, i, bArr2, 1, i2);
            return bArr2;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        return bArr3;
    }

    public AnonymousClass6SL(String str) {
        int indexOf = str.indexOf(46);
        int lastIndexOf = str.lastIndexOf(46);
        if (!(indexOf == -1 || lastIndexOf == -1 || indexOf == lastIndexOf)) {
            int i = indexOf + 1;
            if (str.indexOf(46, i) == lastIndexOf) {
                String A0z = C90514aH.A0z(str, indexOf);
                this.A04 = A0z;
                String substring = str.substring(i, lastIndexOf);
                this.A05 = substring;
                this.A01 = str.substring(lastIndexOf + 1);
                try {
                    byte[] decode = Base64.decode(A0z, 8);
                    byte[] decode2 = Base64.decode(substring, 8);
                    Base64.decode(this.A01, 8);
                    JSONObject A1C = C36441kJ.A1C(new String(decode));
                    this.A02 = A1C;
                    this.A00 = A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ALG).toUpperCase(Locale.US);
                    this.A03 = C36441kJ.A1C(new String(decode2));
                    if (!A06.contains(this.A00)) {
                        throw new AnonymousClass5UY("JWT algorithm not supported");
                    }
                    return;
                } catch (JSONException e) {
                    throw new AnonymousClass5UY(e.getMessage());
                } catch (IllegalArgumentException unused) {
                    throw new AnonymousClass5UY("Wrong Base64 encoding.");
                }
            }
        }
        throw new AnonymousClass5UY("Invalid JWT Token");
    }
}
