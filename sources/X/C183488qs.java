package X;

import java.util.ArrayList;

/* renamed from: X.8qs  reason: invalid class name and case insensitive filesystem */
public class C183488qs extends C132446Tt {
    public final AnonymousClass1EU A00;
    public final AnonymousClass9FJ A01;

    public C183488qs(AnonymousClass155 r2, AnonymousClass1EU r3, AnonymousClass9FJ r4) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0o = C165577te.A0o(this.A00);
        if (A0o.isEmpty()) {
            return null;
        }
        C175898bF r1 = ((C207249un) A0o.get(C203449o2.A01(A0o))).A08;
        if (r1 instanceof C175818b6) {
            return r1;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C175818b6 r5 = (C175818b6) obj;
        C178828hf r3 = this.A01.A00;
        if (r5 != null) {
            r3.Bnv();
            r3.A48(r5);
            return;
        }
        r3.A0M.A09(new C23168B8c(r3, 1));
    }
}
