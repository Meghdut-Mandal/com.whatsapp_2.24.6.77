package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2j5  reason: invalid class name and case insensitive filesystem */
public class C49422j5 extends C132446Tt {
    public final AnonymousClass08V A00;
    public final AnonymousClass1LV A01;
    public final AnonymousClass1YR A02;
    public final Set A03;

    public C49422j5(AnonymousClass08V r2, AnonymousClass012 r3, AnonymousClass1LV r4, AnonymousClass1YR r5, Set set) {
        super(r3, true);
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = set;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        AnonymousClass147 A022;
        Set set = this.A03;
        AnonymousClass147 r3 = null;
        if (set.size() == 1) {
            AnonymousClass147 r1 = (AnonymousClass147) set.toArray()[0];
            i = this.A02.A01(r1);
            AnonymousClass1LV r4 = this.A01;
            if (C63833Lp.A00(r4.A02.A05(r1)) && (A022 = r4.A02(r1)) != null && r4.A04(A022).size() == 1) {
                r3 = A022;
            }
        } else {
            i = 0;
            Iterator it = this.A02.A02().iterator();
            while (it.hasNext()) {
                if (set.contains(C64933Qa.A02(it))) {
                    i++;
                }
            }
        }
        return new C595934n(r3, i);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.apply(obj);
    }
}
