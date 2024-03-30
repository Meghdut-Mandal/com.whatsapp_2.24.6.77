package X;

import java.util.List;

/* renamed from: X.0Ck  reason: invalid class name and case insensitive filesystem */
public abstract class C02920Ck extends AnonymousClass0CZ {
    public final C02840Cc A00;
    public final C02930Cl A01;

    public int A0J() {
        return this.A00.A03.size();
    }

    public Object A0L(int i) {
        return this.A00.A03.get(i);
    }

    public void A0M(List list) {
        this.A00.A00(list);
    }

    public C02920Ck(C02830Cb r5) {
        C02940Cm r3 = new C02940Cm(this);
        this.A01 = r3;
        C02840Cc r0 = new C02840Cc(new C02880Cg(r5).A00(), (C02860Ce) new C02870Cf(this));
        this.A00 = r0;
        r0.A06.add(r3);
    }

    public C02920Ck(C02890Ch r4) {
        C02940Cm r2 = new C02940Cm(this);
        this.A01 = r2;
        C02840Cc r0 = new C02840Cc(r4, (C02860Ce) new C02870Cf(this));
        this.A00 = r0;
        r0.A06.add(r2);
    }
}
