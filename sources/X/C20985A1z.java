package X;

import java.util.Arrays;

/* renamed from: X.A1z  reason: case insensitive filesystem */
public class C20985A1z implements C23064B2n, C23012B0d {
    public int A00;
    public int A01;
    public final AnonymousClass9NT A02 = new AnonymousClass9NT();
    public final B3C A03;
    public final C203159nQ A04;
    public final float[] A05 = new float[16];
    public final boolean A06;

    public void BKM(C201589jv r1) {
    }

    public void release() {
    }

    public C194849Rm A00(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        AnonymousClass9NT r1 = this.A02;
        AnonymousClass67V r0 = r1.A04;
        if (r0 != null) {
            r0.A01(i, i2);
        }
        C203159nQ r2 = this.A04;
        r2.A07(this.A01, this.A00, i3, i4, 0, false, false);
        r1.A02 = i5;
        r1.A01 = i6;
        r1.A00 = i7;
        r1.A06 = z;
        return r2.A06();
    }

    public void B1T(AnonymousClass9ST r6) {
        B3C b3c;
        int i;
        C97934qY r3;
        int i2;
        AnonymousClass9NT r4 = this.A02;
        if (r4.A04 == null) {
            if (this.A06) {
                C97934qY r32 = new C97934qY();
                r4.A04 = r32;
                b3c = this.A03;
                i = r32.A00.A00;
                r3 = r32;
            } else {
                b3c = this.A03;
                C124085xZ r1 = new C124085xZ("SurfaceInput");
                r1.A01 = 36197;
                AnonymousClass67V r33 = new AnonymousClass67V(r1);
                r4.A04 = r33;
                i = r33.A00;
                r3 = r33;
            }
            b3c.Bj1(i);
            int i3 = this.A01;
            if (i3 > 0 && (i2 = this.A00) > 0) {
                r3.A01(i3, i2);
            }
        }
    }

    public void B5N() {
        AnonymousClass9NT r1 = this.A02;
        AnonymousClass67V r0 = r1.A04;
        if (r0 != null) {
            r0.A00();
            r1.A04 = null;
        }
        this.A03.Bj2();
    }

    public AnonymousClass9NT BC4() {
        try {
            B3C b3c = this.A03;
            b3c.Bx2();
            float[] fArr = this.A05;
            b3c.BIa(fArr);
            C203159nQ r3 = this.A04;
            float[] fArr2 = r3.A09;
            if (!Arrays.equals(fArr2, fArr)) {
                System.arraycopy(fArr, 0, fArr2, 0, 16);
                r3.A01 = true;
            }
            AnonymousClass9NT r2 = this.A02;
            r2.A05 = r3.A06();
            r2.A03 = b3c.BIL();
        } catch (RuntimeException unused) {
        }
        return this.A02;
    }

    public void BrL(C157787eg r2) {
        this.A03.BrL(r2);
    }

    public C20985A1z(B3C b3c, C203159nQ r3) {
        this.A04 = r3;
        this.A03 = b3c;
        this.A06 = C131956Rl.A00();
    }
}
