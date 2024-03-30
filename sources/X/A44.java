package X;

import java.nio.charset.Charset;
import java.util.Objects;

public final class A44 implements B3O {
    public final C170568Dy A00;

    public final void ByE(int i, double d) {
        C170568Dy r3 = this.A00;
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        r3.A05((i << 3) | 1);
        r3.A0A(doubleToRawLongBits);
    }

    public final void ByF(int i, float f) {
        C170568Dy r2 = this.A00;
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        r2.A05((i << 3) | 5);
        r2.A06(floatToRawIntBits);
    }

    public final void ByO(B3T b3t, Object obj, int i) {
        C170568Dy r1 = this.A00;
        C23119B5y b5y = (C23119B5y) obj;
        AnonymousClass95R.A06(r1, i);
        r1.A05(AnonymousClass8EX.A00(b3t, b5y));
        b3t.ByK(r1.A01, b5y);
    }

    public final void ByZ(B3T b3t, Object obj, int i) {
        C170568Dy r2 = this.A00;
        int i2 = i << 3;
        r2.A05(i2 | 3);
        b3t.ByK(r2.A01, obj);
        r2.A05(i2 | 4);
    }

    public A44(C170568Dy r3) {
        Charset charset = C197089b7.A00;
        Objects.requireNonNull(r3, "output");
        this.A00 = r3;
        r3.A01 = this;
    }
}
