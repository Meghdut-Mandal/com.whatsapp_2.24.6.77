package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9Sz  reason: invalid class name and case insensitive filesystem */
public final class C195229Sz {
    public int A00 = 3538944;
    public int A01 = 5000;
    public int A02 = 2500;
    public int A03 = -1;
    public int A04 = 13107200;
    public C195899Ws A05 = null;
    public AnonymousClass94B A06;
    public C198969eU A07 = null;
    public AnonymousClass9D1 A08 = null;
    public C202509m3 A09;
    public AtomicBoolean A0A;
    public AtomicBoolean A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = true;
    public boolean A0G = false;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K = false;

    public C208929zB A00() {
        boolean z = true;
        if (this.A05 == null) {
            this.A05 = new C195899Ws(65536);
        }
        if (this.A07 == null) {
            this.A07 = new C198969eU();
        }
        if (this.A09 == null) {
            z = false;
        }
        C200319h9.A01(z);
        C195899Ws r38 = this.A05;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A03;
        int i4 = this.A04;
        int i5 = this.A00;
        boolean z2 = this.A0J;
        boolean z3 = this.A0F;
        boolean z4 = this.A0H;
        C198969eU r11 = this.A07;
        C202509m3 r10 = this.A09;
        AnonymousClass94B r9 = this.A06;
        AnonymousClass9D1 r8 = this.A08;
        AtomicBoolean atomicBoolean = this.A0B;
        AtomicBoolean atomicBoolean2 = this.A0A;
        int i6 = i3;
        int i7 = i4;
        int i8 = i2;
        return new C208929zB(r38, r9, r11, r8, r10, atomicBoolean, atomicBoolean2, i, i8, i6, i7, i5, z2, z3, z4, this.A0E, this.A0I, this.A0G, this.A0D, this.A0K, this.A0C);
    }
}
