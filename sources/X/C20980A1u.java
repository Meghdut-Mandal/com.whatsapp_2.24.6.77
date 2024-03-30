package X;

import android.os.Handler;

/* renamed from: X.A1u  reason: case insensitive filesystem */
public class C20980A1u implements C23064B2n {
    public A23 A00;
    public C20983A1x A01;
    public C20983A1x A02;
    public boolean A03;
    public boolean A04;
    public final C204269pj A05;
    public final AnonymousClass9C3 A06;
    public final C198549dl A07;
    public final AnonymousClass9C2 A08;

    public void B5N() {
        C204269pj r2 = this.A05;
        r2.A0D = false;
        r2.A05.post(r2.A07);
    }

    public void BKM(C201589jv r6) {
        C198549dl r4 = this.A07;
        this.A02 = new C20983A1x(r4);
        this.A01 = new C20983A1x(r4);
        this.A00 = new A23(r4, new AnonymousClass88T(), new AnonymousClass88R(), false);
        r6.A03(this.A02);
        r6.A03(this.A01);
    }

    public C20980A1u(Handler handler, AnonymousClass9C3 r4, C198549dl r5) {
        AnonymousClass9C2 r1 = new AnonymousClass9C2(this);
        this.A08 = r1;
        this.A07 = r5;
        this.A06 = r4;
        this.A05 = new C204269pj(handler, r1);
    }

    public void release() {
    }

    public void B1T(AnonymousClass9ST r1) {
    }
}
