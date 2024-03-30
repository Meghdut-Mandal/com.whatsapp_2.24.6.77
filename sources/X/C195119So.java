package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9So  reason: invalid class name and case insensitive filesystem */
public final class C195119So {
    public int A00 = Integer.MAX_VALUE;
    public C102164zP A01;
    public final AnonymousClass17Y A02;
    public final C20050ww A03;
    public final C19970wo A04;
    public final C19630wG A05;
    public final C20810yC A06;
    public final C21010yW A07;
    public final AnonymousClass1BV A08;
    public final AnonymousClass1BS A09;
    public final C19770wU A0A;
    public final AtomicInteger A0B = C90484aE.A0v();

    public void A00(C21097A8i a8i) {
        a8i.A01 = true;
        C102164zP r0 = this.A01;
        if (r0 != null) {
            r0.A00(a8i);
        }
        List list = a8i.A00;
        if (list != null && list.size() > 0) {
            for (C21097A8i A002 : a8i.A00) {
                A00(A002);
            }
        }
    }

    public C195119So(AnonymousClass17Y r2, C20050ww r3, C19970wo r4, C19630wG r5, C20810yC r6, C21010yW r7, AnonymousClass1BV r8, AnonymousClass1BS r9, C19770wU r10) {
        this.A05 = r5;
        this.A0A = r10;
        this.A04 = r4;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A07 = r7;
        this.A09 = r9;
        this.A08 = r8;
    }
}
