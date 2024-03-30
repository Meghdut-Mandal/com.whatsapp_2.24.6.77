package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7pP  reason: invalid class name and case insensitive filesystem */
public class C162947pP extends C132446Tt {
    public Object A00;
    public Object A01;
    public final int A02;

    public C162947pP(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (this.A02 != 0) {
            Set set = (Set) obj;
            C29931Yo r4 = (C29931Yo) this.A00;
            if (set != null) {
                C19420v0 r3 = r4.A05;
                C36331k8.A0w(C19420v0.A00(r3), "payment_background_batch_require_fetch", false);
                r3.A1Z("payment_backgrounds_batch_last_fetch_timestamp");
                r4.A0B.A02(set);
            } else {
                Iterator A0s = C36361kB.A0s(r4.A0B);
                while (A0s.hasNext()) {
                    A0s.next();
                }
            }
            C162057nx r0 = (C162057nx) this.A01;
            if (r0 == null) {
                return;
            }
            if (set != null) {
                r0.BbA(set);
            } else {
                r0.BWY();
            }
        } else {
            AnonymousClass3KU r6 = (AnonymousClass3KU) obj;
            if (r6 != null) {
                ((AnonymousClass7hE) this.A00).BQc(r6.A08, ((AnonymousClass1Z2) this.A01).A01.A04(r6.A07), true);
                return;
            }
            ((AnonymousClass7hE) this.A00).BQc((String) null, (String) null, false);
        }
    }
}
