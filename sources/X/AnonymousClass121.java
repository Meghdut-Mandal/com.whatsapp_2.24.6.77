package X;

import java.io.IOException;

/* renamed from: X.121  reason: invalid class name */
public abstract class AnonymousClass121 extends AnonymousClass120 {
    public static AnonymousClass121 A00(byte[] bArr) {
        C187118xI r0 = new C187118xI(bArr);
        try {
            AnonymousClass121 A06 = r0.A06();
            if (r0.available() == 0) {
                return A06;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public int A0A() {
        int length = AnonymousClass122.A03((AnonymousClass122) this).length;
        return C201849kY.A01(length) + 1 + length;
    }

    public AnonymousClass121 A0B() {
        return this;
    }

    public AnonymousClass121 A0C() {
        return this;
    }

    public void A0D(C200179gm r3, boolean z) {
        r3.A04(AnonymousClass122.A03((AnonymousClass122) this), 6, z);
    }

    public boolean A0F(AnonymousClass121 r3) {
        AnonymousClass122 r1 = (AnonymousClass122) this;
        if (r3 == r1) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass122)) {
            return false;
        }
        return r1.A01.equals(((AnonymousClass122) r3).A01);
    }

    public final boolean A0G(AnonymousClass121 r3) {
        return this == r3 || A0F(r3);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C219411z) && A0F(((C219411z) obj).Bve()));
    }

    public abstract int hashCode();

    public boolean A0E() {
        return false;
    }
}
