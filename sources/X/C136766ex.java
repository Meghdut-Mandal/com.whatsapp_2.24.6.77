package X;

import java.util.List;

/* renamed from: X.6ex  reason: invalid class name and case insensitive filesystem */
public final class C136766ex implements C156917bA {
    public int A00;
    public int A01 = Integer.MIN_VALUE;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass64S A06;
    public final Object A07;
    public final List A08;
    public final boolean A09;
    public final int[] A0A;
    public final int A0B;
    public final long A0C;
    public final C157627dq A0D;
    public final AnonymousClass7bO A0E;
    public final AnonymousClass5RW A0F;
    public final Object A0G;
    public final boolean A0H;

    public final void A00(int i, int i2, int i3) {
        int i4;
        this.A00 = i;
        boolean z = this.A09;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A01 = i5;
        List list = this.A08;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AnonymousClass6Q4 r8 = (AnonymousClass6Q4) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0A;
            if (z) {
                C157627dq r2 = this.A0D;
                if (r2 != null) {
                    iArr[i7] = r2.B0t(this.A0F, r8.A01, i2);
                    iArr[i7 + 1] = i;
                    i4 = r8.A00;
                } else {
                    throw AnonymousClass001.A08("null horizontalAlignment when isVertical == true");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                AnonymousClass7bO r1 = this.A0E;
                if (r1 != null) {
                    iArr[i8] = C137246fp.A00((C137246fp) r1, i3 - r8.A00);
                    i4 = r8.A01;
                } else {
                    throw AnonymousClass001.A08("null verticalAlignment when isVertical == false");
                }
            }
            i += i4;
        }
    }

    public final void A01(AnonymousClass6WO r18) {
        int A032;
        if (this.A01 != Integer.MIN_VALUE) {
            List list = this.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass6Q4 r6 = (AnonymousClass6Q4) list.get(i);
                int[] iArr = this.A0A;
                int i2 = i * 2;
                long A0J = C90484aE.A0J(iArr[i2], iArr[i2 + 1]);
                AnonymousClass64S r0 = this.A06;
                r0.A01.get(this.A07);
                C006302t r9 = C113475fb.A00;
                if (this.A0H) {
                    boolean z = this.A09;
                    int A082 = C90494aF.A08(A0J);
                    if (z) {
                        A032 = (this.A01 - C90474aD.A03(A0J)) - r6.A00;
                    } else {
                        A082 = (this.A01 - A082) - r6.A01;
                        A032 = C90474aD.A03(A0J);
                    }
                    A0J = C90484aE.A0J(A082, A032);
                }
                long j = this.A0C;
                long A0J2 = C90484aE.A0J(((int) (A0J >> 32)) + ((int) (j >> 32)), ((int) (A0J & 4294967295L)) + ((int) (j & 4294967295L)));
                if (this.A09) {
                    long j2 = r6.A02;
                    r6.A0E(r9, 0.0f, C90484aE.A0J(((int) (A0J2 >> 32)) + ((int) (j2 >> 32)), ((int) (A0J2 & 4294967295L)) + ((int) (j2 & 4294967295L))));
                } else {
                    if (!(r18.A03() == AnonymousClass5RW.Ltr || r18.A02() == 0)) {
                        A0J2 = C90484aE.A0J((r18.A02() - r6.A01) - C90494aF.A08(A0J2), (int) (A0J2 & 4294967295L));
                    }
                    long j3 = r6.A02;
                    r6.A0E(r9, 0.0f, C90484aE.A0J(((int) (A0J2 >> 32)) + ((int) (j3 >> 32)), ((int) (A0J2 & 4294967295L)) + ((int) (j3 & 4294967295L))));
                }
            }
            return;
        }
        throw AnonymousClass001.A08("position() should be called first");
    }

    public C136766ex(AnonymousClass64S r8, C157627dq r9, AnonymousClass7bO r10, AnonymousClass5RW r11, Object obj, Object obj2, List list, int i, int i2, long j, boolean z, boolean z2) {
        int i3;
        int i4;
        this.A03 = i;
        this.A08 = list;
        this.A09 = z;
        this.A0D = r9;
        this.A0E = r10;
        this.A0F = r11;
        this.A0H = z2;
        this.A0B = i2;
        this.A0C = j;
        this.A07 = obj;
        this.A0G = obj2;
        this.A06 = r8;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AnonymousClass6Q4 r2 = (AnonymousClass6Q4) list.get(i7);
            boolean z3 = this.A09;
            if (z3) {
                i3 = r2.A00;
            } else {
                i3 = r2.A01;
            }
            i5 += i3;
            if (!z3) {
                i4 = r2.A00;
            } else {
                i4 = r2.A01;
            }
            i6 = Math.max(i6, i4);
        }
        this.A04 = i5;
        int i8 = i5 + this.A0B;
        this.A05 = i8 < 0 ? 0 : i8;
        this.A02 = i6;
        this.A0A = new int[(this.A08.size() * 2)];
    }
}
