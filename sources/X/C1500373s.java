package X;

import java.util.Iterator;

/* renamed from: X.73s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500373s implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass1Y4 A02;
    public final /* synthetic */ C146506vi A03;
    public final /* synthetic */ AnonymousClass3SC A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1500373s(AnonymousClass1Y4 r1, C146506vi r2, AnonymousClass3SC r3, Integer num, int i, long j, boolean z) {
        this.A02 = r1;
        this.A01 = j;
        this.A03 = r2;
        this.A06 = z;
        this.A05 = num;
        this.A00 = i;
        this.A04 = r3;
    }

    public final void run() {
        int A002;
        AnonymousClass1Y4 r4 = this.A02;
        long j = this.A01;
        C146506vi r3 = this.A03;
        boolean z = this.A06;
        Integer num = this.A05;
        int i = this.A00;
        AnonymousClass3SC r9 = this.A04;
        if (j > 0) {
            if (r3.A0O.A03.A02) {
                A002 = 3;
            } else {
                A002 = C36371kC.A00(z ? 1 : 0);
            }
            C24811Dw r2 = r4.A0E;
            double d = (double) j;
            boolean A1Q = AnonymousClass000.A1Q(num.intValue());
            synchronized (r2) {
                long A012 = C24811Dw.A01(r2);
                int A003 = C24811Dw.A00(r2);
                AnonymousClass1E0 r12 = r2.A01;
                C200979iZ A013 = r12.A01(i, A003, A002, A012, false);
                A013.A01 = (long) (((double) A013.A01) + d);
                if (A1Q) {
                    A013.A07++;
                }
                r12.A02(A013, i, A003, A002, A012, false);
            }
        }
        int intValue = num.intValue();
        Iterator A12 = C90514aH.A12(r9.A02);
        if (intValue == 0) {
            while (A12.hasNext()) {
                AnonymousClass3T1 A0l = C36391kE.A0l(A12);
                r4.A0E.A04(r4.A04.A01(A0l), C203229nZ.A02(A0l), i);
            }
            if (r4.A0A.A0E(475) && r3.A0N.A03() == 3) {
                AnonymousClass1Y5 r42 = r4.A0F;
                C124935z2 r22 = r3.A0M;
                r22.A05 = System.currentTimeMillis();
                r42.A00.A04(r22);
                return;
            }
            return;
        }
        while (A12.hasNext()) {
            A12.next();
            C24811Dw r15 = r4.A0E;
            synchronized (r15) {
                C24821Dx r14 = r15.A02.A01;
                C131446Pb A022 = r14.A02();
                long j2 = A022.A0F;
                long j3 = A022.A0I;
                r14.A04(new C131446Pb(A022.A0Q, j2, j3, A022.A0E, A022.A0G, A022.A0H, A022.A0M, A022.A0P, A022.A0L, A022.A0N, A022.A0O, A022.A01, A022.A02, A022.A03, A022.A07, A022.A06, A022.A08, A022.A00, A022.A0J, A022.A0K, A022.A05, A022.A04, A022.A09, A022.A0B, A022.A0A, A022.A0C, A022.A0D + 1));
            }
        }
    }
}
