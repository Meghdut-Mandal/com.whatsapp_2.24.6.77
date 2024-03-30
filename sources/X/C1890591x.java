package X;

import java.security.Signature;

/* renamed from: X.91x  reason: invalid class name and case insensitive filesystem */
public class C1890591x implements B0K {
    public Object A00;
    public final int A01;

    public C1890591x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Signature B4w(String str) {
        if (this.A01 == 0) {
            return Signature.getInstance(str, ((C21786AaJ) ((C21875Ac1) this.A00).A02).A00);
        }
        try {
            return Signature.getInstance(str, ((C21786AaJ) ((C21879Ac5) this.A00).bcHelper).A00);
        } catch (Exception unused) {
            return Signature.getInstance(str);
        }
    }
}
