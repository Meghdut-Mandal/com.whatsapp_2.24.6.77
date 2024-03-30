package X;

import java.util.regex.Pattern;

/* renamed from: X.AFk  reason: case insensitive filesystem */
public final class C21280AFk implements B4W {
    public static final AG9 A02 = new AG9();
    public final String A00;
    public final String A01;

    public boolean B6r(C194429Pq r4) {
        AnonymousClass00C.A0D(r4, 0);
        String str = this.A01;
        boolean A07 = AnonymousClass098.A07(str, "$.", false);
        Object obj = str;
        if (A07) {
            obj = r4.A00(str);
        }
        if (obj instanceof String) {
            return C165587tf.A1a((CharSequence) obj, Pattern.compile(this.A00));
        }
        throw AnonymousClass001.A0E("Input string is null");
    }

    public C21280AFk(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
