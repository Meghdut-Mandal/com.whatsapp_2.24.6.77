package X;

import java.security.Signature;

/* renamed from: X.BAp  reason: case insensitive filesystem */
public class C23233BAp implements B0K {
    public Object A00;
    public String A01;
    public final int A02;

    public C23233BAp(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public Signature B4w(String str) {
        String str2 = this.A01;
        if (str2 != null) {
            return Signature.getInstance(str, str2);
        }
        return Signature.getInstance(str);
    }
}
