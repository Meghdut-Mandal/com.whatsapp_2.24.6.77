package X;

import android.text.TextUtils;
import java.nio.CharBuffer;

/* renamed from: X.9jK  reason: invalid class name and case insensitive filesystem */
public class C201319jK {
    public final String A00;
    public final String A01;
    public final String A02;

    public C201319jK(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public static void A00(CharBuffer charBuffer) {
        int limit = charBuffer.limit() - charBuffer.position();
        if (limit >= 4 || limit <= 0) {
            throw AnonymousClass001.A08("IPV4 octet must contain between 1 and 3 digits");
        }
        try {
            int parseInt = Integer.parseInt(charBuffer.toString(), 10);
            if (parseInt < 0 || parseInt > 255) {
                throw AnonymousClass000.A0d("IPV4 octet value must be between 0 and 255, got ", AnonymousClass000.A0u(), parseInt);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(AnonymousClass000.A0l(charBuffer, "Unable to parse decimal octet ", AnonymousClass000.A0u()), e);
        }
    }

    public String A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        if (!TextUtils.isEmpty(this.A02)) {
            A0u.append("<REDACTED>");
            A0u.append("@");
        }
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            A0u.append(str);
        }
        String str2 = this.A01;
        if (!TextUtils.isEmpty(str2)) {
            A0u.append(":");
            A0u.append(str2);
        }
        return A0u.toString();
    }

    public String toString() {
        return A01();
    }
}
