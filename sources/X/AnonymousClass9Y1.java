package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Y1  reason: invalid class name */
public class AnonymousClass9Y1 {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final C19730wQ A04;
    public final AnonymousClass185 A05;
    public final C20810yC A06;
    public final C21010yW A07;
    public final AnonymousClass1KU A08;
    public final C18950u5 A09;
    public final C19770wU A0A;
    public final AnonymousClass005 A0B;
    public final AtomicInteger A0C = new AtomicInteger();
    public final AtomicInteger A0D = new AtomicInteger();

    public void A01(int i) {
        A02(i, (String) null, (String) null);
    }

    public C193039Jp A00() {
        return new C193039Jp(this.A02, this.A0C.get(), (long) this.A0D.getAndIncrement());
    }

    public void A03(C195209Sx r3) {
        C36391kE.A1R(this.A0A, this, r3, 33);
    }

    public AnonymousClass9Y1(C19730wQ r2, AnonymousClass185 r3, C20810yC r4, C21010yW r5, AnonymousClass1KU r6, C19770wU r7, AnonymousClass005 r8) {
        this.A06 = r4;
        this.A04 = r2;
        this.A0A = r7;
        this.A07 = r5;
        this.A08 = r6;
        this.A05 = r3;
        this.A09 = C20890yK.DEFAULT_SAMPLING_RATE;
        this.A0B = r8;
    }

    public void A02(int i, String str, String str2) {
        this.A02 = C36361kB.A0l();
        if (this.A06.A0E(4494)) {
            ((C65213Re) this.A0B.get()).A00 = System.currentTimeMillis();
        }
        this.A0D.set(1);
        this.A0C.set(i);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = true;
    }
}
