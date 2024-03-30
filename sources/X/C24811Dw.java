package X;

/* renamed from: X.1Dw  reason: invalid class name and case insensitive filesystem */
public class C24811Dw {
    public final C21010yW A00;
    public final AnonymousClass1E0 A01;
    public final C24841Dz A02;
    public final C19600wD A03;
    public final C19970wo A04;
    public final C20810yC A05;

    public static int A00(C24811Dw r0) {
        Integer A002 = AnonymousClass1M9.A00(r0.A03.A04());
        if (A002 == null) {
            return 0;
        }
        return A002.intValue();
    }

    public static long A01(C24811Dw r3) {
        long A002 = C19970wo.A00(r3.A04);
        return A002 - (A002 % 86400000);
    }

    public synchronized void A02(int i, int i2) {
        synchronized (this) {
            long A012 = A01(this);
            int A002 = A00(this);
            AnonymousClass1E0 r5 = this.A01;
            int i3 = i;
            int i4 = i2;
            C200979iZ A013 = r5.A01(i3, A002, i4, A012, false);
            A013.A08++;
            r5.A02(A013, i3, A002, i4, A012, false);
        }
    }

    public synchronized void A03(AnonymousClass3JD r79, int i, int i2) {
        long j;
        long j2;
        int i3;
        long j3;
        long j4;
        long j5;
        long j6;
        synchronized (this) {
            long A012 = A01(this);
            int A002 = A00(this);
            AnonymousClass1E0 r12 = this.A01;
            int i4 = i;
            int i5 = i2;
            C200979iZ A013 = r12.A01(i4, A002, i5, A012, false);
            A013.A04++;
            r12.A02(A013, i4, A002, i5, A012, false);
            C24821Dx r9 = this.A02.A01;
            AnonymousClass3S8 A014 = r9.A01();
            AnonymousClass3JD r3 = r79;
            AnonymousClass3S8 A003 = C24841Dz.A00(A014, r3, i5);
            if (i4 == 2) {
                j2 = A003.A0M + 1;
                j = 0;
                i3 = -2;
                j6 = 0;
            } else if (i4 == 3) {
                j2 = 0;
                j6 = A003.A0U + 1;
                i3 = -65;
                j = 0;
            } else if (i4 == 4 || i4 == 5) {
                j2 = 0;
                j3 = A003.A01 + 1;
                i3 = -262145;
                j = 0;
                j6 = 0;
                j5 = 0;
                j4 = 0;
                A014 = AnonymousClass3S8.A00(A003, i3, j2, j, 0, 0, 0, 0, j6, 0, 0, 0, 0, 0, j5, 0, j4, 0, 0, 0, j3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                r9.A03(A014);
            } else {
                if (i4 == 8) {
                    j4 = A003.A08 + (r3.A02 ? 1 : 0);
                    j2 = 0;
                    j5 = A003.A05 + 1;
                    i3 = -20481;
                    j = 0;
                    j6 = 0;
                    j3 = 0;
                    A014 = AnonymousClass3S8.A00(A003, i3, j2, j, 0, 0, 0, 0, j6, 0, 0, 0, 0, 0, j5, 0, j4, 0, 0, 0, j3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                }
                r9.A03(A014);
            }
            j5 = 0;
            j4 = 0;
            j3 = 0;
            A014 = AnonymousClass3S8.A00(A003, i3, j2, j, 0, 0, 0, 0, j6, 0, 0, 0, 0, 0, j5, 0, j4, 0, 0, 0, j3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
            r9.A03(A014);
        }
    }

    public synchronized void A04(AnonymousClass3KT r21, int i, int i2) {
        synchronized (this) {
            long A012 = A01(this);
            int A002 = A00(this);
            AnonymousClass1E0 r5 = this.A01;
            int i3 = i;
            int i4 = i2;
            C200979iZ A013 = r5.A01(i4, A002, i3, A012, false);
            A013.A05++;
            r5.A02(A013, i4, A002, i3, A012, false);
            this.A02.A01(r21, A002);
        }
    }

    public C24811Dw(C19600wD r1, C19970wo r2, C20810yC r3, C21010yW r4, AnonymousClass1E0 r5, C24841Dz r6) {
        this.A04 = r2;
        this.A00 = r4;
        this.A03 = r1;
        this.A01 = r5;
        this.A02 = r6;
        this.A05 = r3;
    }
}
