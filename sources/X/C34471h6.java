package X;

/* renamed from: X.1h6  reason: invalid class name and case insensitive filesystem */
public class C34471h6 {
    public final C34421h1 A00;
    public final AnonymousClass16A A01 = new C36231jy(this, 0);
    public final C26421Kc A02;
    public final C32001cn A03 = new C35981jZ(this, 0);
    public final C24361Cd A04;
    public final C226815j A05 = new C36001jb(this, 2);
    public final AnonymousClass16I A06;
    public final C24521Ct A07 = new C36071ji(this, 1);
    public final C24381Cf A08;
    public final C24511Cs A09 = new C36021jd(this, 1);
    public final C233117z A0A;

    public void A00() {
        this.A06.registerObserver(this.A05);
        this.A04.registerObserver(this.A03);
        this.A08.registerObserver(this.A07);
        this.A02.registerObserver(this.A01);
        this.A0A.registerObserver(this.A09);
    }

    public void A01() {
        this.A06.unregisterObserver(this.A05);
        this.A04.unregisterObserver(this.A03);
        this.A08.unregisterObserver(this.A07);
        this.A02.unregisterObserver(this.A01);
        this.A0A.unregisterObserver(this.A09);
    }

    public C34471h6(C26421Kc r4, C24361Cd r5, C34421h1 r6, AnonymousClass16I r7, C24381Cf r8, C233117z r9) {
        this.A00 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r8;
        this.A02 = r4;
        this.A0A = r9;
    }
}
