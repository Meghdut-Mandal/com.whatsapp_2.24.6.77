package X;

import java.util.Objects;

/* renamed from: X.9e8  reason: invalid class name and case insensitive filesystem */
public class C198749e8 {
    public static final C191319Cm A02 = new C191319Cm(2);
    public static final C191319Cm A03 = new C191319Cm(4);
    public static final C191319Cm A04 = new C191319Cm(3);
    public static final C191319Cm A05 = new C191319Cm(1);
    public boolean A00 = false;
    public boolean A01 = true;

    public Boolean A01(C191319Cm r4) {
        boolean z;
        int i = r4.A00;
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            z = this.A00;
        } else if (i != 3) {
            z = false;
        } else {
            z = this.A01;
        }
        return Boolean.valueOf(z);
    }

    public static boolean A00(C191319Cm r0, C198749e8 r1) {
        Boolean A012 = r1.A01(r0);
        Objects.requireNonNull(A012);
        return A012.booleanValue();
    }
}
